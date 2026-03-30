package com.example.spring_logistics_integrator.models;

public record ShippingResponse (
    String street,
    String city,
    String state,
    double shippingCost
) {}