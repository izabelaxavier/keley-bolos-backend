package com.izabelaxavier.keleybolosapi.controller;

import com.izabelaxavier.keleybolosapi.dto.PedidoDTO;
import com.izabelaxavier.keleybolosapi.dto.PedidoResponseDTO;
import com.izabelaxavier.keleybolosapi.entity.Pedido;
import com.izabelaxavier.keleybolosapi.entity.Produto;
import com.izabelaxavier.keleybolosapi.repository.PedidoRepository;
import com.izabelaxavier.keleybolosapi.repository.ProdutoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

@RestController
@RequestMapping("/pedidos")
@RequiredArgsConstructor
public class PedidoController {

    private final PedidoRepository pedidoRepository;
    private final ProdutoRepository produtoRepository;

    @GetMapping
    public List<PedidoResponseDTO> listarTodos() {
        List<Pedido> pedidos = pedidoRepository.findAll();
        // Converte a lista de Entidades para a lista de DTOs de resposta
        return pedidos.stream().map(this::converterParaResponseDTO).toList();
    }

    @PostMapping
    public ResponseEntity<PedidoResponseDTO> criar(@RequestBody PedidoDTO pedidoDTO) {
        Produto produto = produtoRepository.findById(pedidoDTO.getProdutoId())
                .orElseThrow(() -> new RuntimeException("Produto não encontrado com o ID: " + pedidoDTO.getProdutoId()));

        Pedido pedido = new Pedido();
        pedido.setQuantidade(pedidoDTO.getQuantidade());
        pedido.setFormaPagamento(pedidoDTO.getFormaPagamento());
        pedido.setObservacoes(pedidoDTO.getObservacoes());
        pedido.setDataRetirada(pedidoDTO.getDataRetirada());
        pedido.setHorarioRetirada(pedidoDTO.getHorarioRetirada());
        pedido.setProduto(produto);

        Pedido pedidoSalvo = pedidoRepository.save(pedido);

        // Transforma o pedido salvo no DTO de resposta plano
        PedidoResponseDTO responseDTO = converterParaResponseDTO(pedidoSalvo);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(responseDTO);
    }

    // Método que faz a mágica da conversão limpa
    private PedidoResponseDTO converterParaResponseDTO(Pedido pedido) {
        PedidoResponseDTO dto = new PedidoResponseDTO();
        dto.setId(pedido.getId());
        dto.setQuantidade(pedido.getQuantidade());
        dto.setFormaPagamento(pedido.getFormaPagamento());
        dto.setObservacoes(pedido.getObservacoes());
        dto.setDataRetirada(pedido.getDataRetirada());
        dto.setHorarioRetirada(pedido.getHorarioRetirada());

        if (pedido.getProduto() != null) {
            dto.setProdutoNome(pedido.getProduto().getNome());
            dto.setProdutoPreco(pedido.getProduto().getPreco());
        }
        return dto;
    }
}