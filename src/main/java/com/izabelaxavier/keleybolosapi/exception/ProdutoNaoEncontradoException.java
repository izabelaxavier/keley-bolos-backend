package com.izabelaxavier.keleybolosapi.exception;

public class ProdutoNaoEncontradoException
        extends RuntimeException {

    public ProdutoNaoEncontradoException(
            String mensagem
    ) {

        super(mensagem);

    }

}