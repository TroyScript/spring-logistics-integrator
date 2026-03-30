package com.example.spring_logistics_integrator.dto;

public record AddressResponseDTO(
        String uf,
        String localidade,
        String logradouro
) {}