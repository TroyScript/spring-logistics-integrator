package com.example.spring_logistics_integrator.controller;

import com.example.spring_logistics_integrator.models.ShippingResponse;
import com.example.spring_logistics_integrator.service.ShippingService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/shipping")
@RequiredArgsConstructor
public class ShippingController {
    private final ShippingService shippingService;

    @GetMapping("/{cep}")
    public ResponseEntity<ShippingResponse> calculate(@PathVariable String cep) {
        return ResponseEntity.ok(shippingService.getShippingResponse(cep));
    }
}