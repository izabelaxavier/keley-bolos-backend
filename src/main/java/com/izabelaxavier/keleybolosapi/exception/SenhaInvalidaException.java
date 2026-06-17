package com.izabelaxavier.keleybolosapi.exception;

public class SenhaInvalidaException
        extends RuntimeException {

    public SenhaInvalidaException(
            String mensagem
    ) {
        super(mensagem);
    }
}