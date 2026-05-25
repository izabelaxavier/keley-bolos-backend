package com.izabelaxavier.keleybolosapi.exception;

import com.izabelaxavier.keleybolosapi.exception.ProdutoNaoEncontradoException;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;


import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(
            MethodArgumentNotValidException.class
    )
    public ResponseEntity<?> tratarValidacao(
            MethodArgumentNotValidException ex
    ) {

        Map<String, String> erros =
                new HashMap<>();

        ex.getBindingResult()
                .getFieldErrors()
                .forEach(erro -> {

                    erros.put(
                            erro.getField(),
                            erro.getDefaultMessage()
                    );

                });

        return ResponseEntity
                .badRequest()
                .body(erros);

    }

    @ExceptionHandler(
            ProdutoNaoEncontradoException.class
    )
    public ResponseEntity<String>
    tratarProdutoNaoEncontrado(
            ProdutoNaoEncontradoException ex
    ) {

        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(ex.getMessage());

    }

}