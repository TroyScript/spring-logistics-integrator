package com.example.spring_logistics_integrator.exceptions;

public class CepNotFoundException extends RuntimeException {
    public CepNotFoundException(String cep) {
        super("CEP não encontrado: " + cep);
    }
}