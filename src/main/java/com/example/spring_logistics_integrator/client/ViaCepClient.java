package com.example.spring_logistics_integrator.client;

import com.example.spring_logistics_integrator.dto.AddressResponseDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "ViaCEP", url = "https://viacep.com.br")
public interface ViaCepClient {
    @GetMapping("/ws/{cep}/json/")
    AddressResponseDTO getAddress(@PathVariable String cep);
}