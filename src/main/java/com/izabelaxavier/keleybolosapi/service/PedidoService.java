package com.izabelaxavier.keleybolosapi.service;

import com.izabelaxavier.keleybolosapi.dto.PedidoDTO;
import com.izabelaxavier.keleybolosapi.dto.PedidoResponseDTO;
import com.izabelaxavier.keleybolosapi.entity.Pedido;
import com.izabelaxavier.keleybolosapi.entity.Produto;
import com.izabelaxavier.keleybolosapi.enums.StatusPedido;
import com.izabelaxavier.keleybolosapi.exception.ProdutoNaoEncontradoException;
import com.izabelaxavier.keleybolosapi.repository.PedidoRepository;
import com.izabelaxavier.keleybolosapi.repository.ProdutoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PedidoService {

    private final PedidoRepository pedidoRepository;
    private final ProdutoRepository produtoRepository;

    public PedidoResponseDTO criar(PedidoDTO pedidoDTO) {

        Produto produto = produtoRepository.findById(
                pedidoDTO.getProdutoId()
        ).orElseThrow(() ->
                new ProdutoNaoEncontradoException(
                        "Produto não encontrado com ID: " + pedidoDTO.getProdutoId()
                )
        );

        Pedido pedido = new Pedido();
        pedido.setNomeCliente(pedidoDTO.getNomeCliente());
        pedido.setQuantidade(pedidoDTO.getQuantidade());
        pedido.setFormaPagamento(pedidoDTO.getFormaPagamento());
        pedido.setObservacoes(pedidoDTO.getObservacoes());
        pedido.setDataRetirada(pedidoDTO.getDataRetirada());
        pedido.setHorarioRetirada(pedidoDTO.getHorarioRetirada());
        pedido.setProduto(produto);
        pedido.setStatus(StatusPedido.RECEBIDO);

        Pedido pedidoSalvo = pedidoRepository.save(pedido);

        return converterParaResponseDTO(
                pedidoSalvo
        );
    }

    public List<PedidoResponseDTO> listarTodos() {

        return pedidoRepository.findAll()
                .stream()
                .map(this::converterParaResponseDTO)
                .toList();
    }

    public Optional<PedidoResponseDTO> buscarPorId(Long id) {

        return pedidoRepository.findById(id)
                .map(this::converterParaResponseDTO);
    }

    public boolean deletar(Long id) {

        if (!pedidoRepository.existsById(id)) {
            return false;
        }

        pedidoRepository.deleteById(id);

        return true;
    }

    public Optional<PedidoResponseDTO> atualizar(
            Long id,
            PedidoDTO pedidoDTO
    ) {

        Optional<Pedido> pedidoOptional =
                pedidoRepository.findById(id);

        if (pedidoOptional.isEmpty()) {
            return Optional.empty();
        }

        Produto produto =
                produtoRepository.findById(
                        pedidoDTO.getProdutoId()
                ).orElseThrow(() ->
                        new ProdutoNaoEncontradoException(
                                "Produto não encontrado com ID: "
                                        + pedidoDTO.getProdutoId()
                        )
                );

        Pedido pedido =
                pedidoOptional.get();

        pedido.setNomeCliente(
                pedidoDTO.getNomeCliente()
        );

        pedido.setQuantidade(
                pedidoDTO.getQuantidade()
        );

        pedido.setFormaPagamento(
                pedidoDTO.getFormaPagamento()
        );

        pedido.setObservacoes(
                pedidoDTO.getObservacoes()
        );

        pedido.setDataRetirada(
                pedidoDTO.getDataRetirada()
        );

        pedido.setHorarioRetirada(
                pedidoDTO.getHorarioRetirada()
        );

        pedido.setProduto(
                produto
        );

        if (pedidoDTO.getStatus() != null) {
            pedido.setStatus(
                    pedidoDTO.getStatus()
            );
        }

        Pedido pedidoAtualizado =
                pedidoRepository.save(
                        pedido
                );

        return Optional.of(
                converterParaResponseDTO(
                        pedidoAtualizado
                )
        );
    }

    private PedidoResponseDTO converterParaResponseDTO(
            Pedido pedido
    ) {

        PedidoResponseDTO dto =
                new PedidoResponseDTO();

        dto.setId(
                pedido.getId()
        );

        dto.setNomeCliente(
                pedido.getNomeCliente()
        );

        dto.setQuantidade(
                pedido.getQuantidade()
        );

        dto.setFormaPagamento(
                pedido.getFormaPagamento()
        );

        dto.setObservacoes(
                pedido.getObservacoes()
        );

        dto.setDataRetirada(
                pedido.getDataRetirada()
        );

        dto.setHorarioRetirada(
                pedido.getHorarioRetirada()
        );

        dto.setStatus(
                pedido.getStatus()
        );

        if (pedido.getProduto() != null) {

            dto.setProdutoNome(
                    pedido.getProduto()
                            .getNome()
            );

            dto.setProdutoPreco(
                    pedido.getProduto()
                            .getPreco()
            );

            dto.setValorTotal(
                    pedido.getProduto()
                            .getPreco()
                            .multiply(
                                    java.math.BigDecimal.valueOf(
                                            pedido.getQuantidade()
                                    )
                            )
            );
        }

        return dto;
    }
}