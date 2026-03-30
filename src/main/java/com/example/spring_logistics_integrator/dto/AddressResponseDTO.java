package com.example.spring_logistics_integrator.dto;

import java.util.Optional;

public record AddressResponseDTO(
        String uf,
        String localidade,
        String logradouro,
        Optional<Boolean> erro
) {
    public boolean notFound() {
        return erro().isPresent();
    }
}