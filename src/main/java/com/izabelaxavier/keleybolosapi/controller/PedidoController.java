package com.izabelaxavier.keleybolosapi.controller;

import com.izabelaxavier.keleybolosapi.dto.PedidoDTO;
import com.izabelaxavier.keleybolosapi.dto.PedidoResponseDTO;
import com.izabelaxavier.keleybolosapi.service.PedidoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pedidos")
@RequiredArgsConstructor
public class PedidoController {

    private final PedidoService pedidoService;

    @GetMapping
    public List<PedidoResponseDTO> listarTodos() {
        return pedidoService.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<PedidoResponseDTO> buscarPorId(@PathVariable Long id) {
        Optional<PedidoResponseDTO> responseDTO = pedidoService.buscarPorId(id);

        return responseDTO.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<PedidoResponseDTO> criar(@RequestBody PedidoDTO pedidoDTO) {
        PedidoResponseDTO response = pedidoService.criar(pedidoDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        boolean deletado = pedidoService.deletar(id);

        if (!deletado) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<PedidoResponseDTO> atualizar(
            @PathVariable Long id,
            @RequestBody PedidoDTO pedidoDTO) {

        Optional<PedidoResponseDTO> responseDTO = pedidoService.atualizar(id, pedidoDTO);

        return responseDTO.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
}