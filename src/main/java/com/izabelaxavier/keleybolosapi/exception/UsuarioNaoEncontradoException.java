package com.izabelaxavier.keleybolosapi.exception;

public class UsuarioNaoEncontradoException
        extends RuntimeException {

    public UsuarioNaoEncontradoException(
            String mensagem
    ) {
        super(mensagem);
    }
}