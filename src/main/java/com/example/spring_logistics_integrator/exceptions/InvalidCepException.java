package com.example.spring_logistics_integrator.exceptions;

public class InvalidCepException extends RuntimeException {
    public InvalidCepException(String cep) {
        super("Cep inválido: " + cep);
    }
}