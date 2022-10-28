package com.anderson.ProdutoServer.exception;

public class BadRequestException extends RuntimeException{

    private static final long serialVersionsUID = -7339546357706827674L;

    public BadRequestException(String message) {
        super(message);
    }
}
