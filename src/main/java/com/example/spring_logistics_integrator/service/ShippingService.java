package com.example.spring_logistics_integrator.service;

import com.example.spring_logistics_integrator.client.ViaCepClient;
import com.example.spring_logistics_integrator.dto.AddressResponseDTO;
import com.example.spring_logistics_integrator.models.ShippingResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ShippingService {
    private final ViaCepClient viaCepClient;

    public ShippingResponse getShippingResponse(String cep) {
        AddressResponseDTO address = viaCepClient.getAddress(cep);
        double shippingCost = 0.0;

        return new ShippingResponse(
                address.localidade(),
                address.logradouro(),
                address.uf(),
                shippingCost
        );
    }

    private double calculateShippingCost(String uf) {
        return 0.0; // TODO: Shipping cost logic
    }
}