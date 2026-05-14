package com.izabelaxavier.keleybolosapi.controller;
import com.izabelaxavier.keleybolosapi.entity.Produto;
import com.izabelaxavier.keleybolosapi.repository.ProdutoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
@RequiredArgsConstructor
public class ProdutoController {

    private final ProdutoRepository produtoRepository;

    @GetMapping
    public List<Produto> listarTodos() {
        return produtoRepository.findAll();
    }
    @PostMapping
    public Produto criar(@RequestBody Produto produto) {
        return produtoRepository.save(produto);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        if (!produtoRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        produtoRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
    @PutMapping("/{id}")
    public ResponseEntity<Produto> atualizar(
            @PathVariable Long id,
            @RequestBody Produto produtoAtualizado) {

        if (!produtoRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }

        produtoAtualizado.setId(id);

        Produto produtoSalvo = produtoRepository.save(produtoAtualizado);

        return ResponseEntity.ok(produtoSalvo);
    }
}
