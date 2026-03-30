package com.example.spring_logistics_integrator.utils;

public class CepUtils {
    public static boolean isValid(String cep) {
        return cep != null && cep.length() == 8;
    }
}