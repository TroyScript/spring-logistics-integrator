# Spring Logistics Integrator
A simple SpringBoot microsservice that integrates with ViaCEP API to provide address validation and simulated shipping cost by CEP

## Why I built this
This project was created to apply in practice what I studied about Declarative REST Clients in Java. I used OpenFeign to reduce boilerplate code when defining HTTP API interactions.
I also added OpenAPI/Swagger to make it easier to test, but my main objective with this project was learning Declarative REST Clients!

## Features
- Address Lookup: Uses ViaCEP to fetch details (Street, City, State) via CEP.
- Shipping Logic: Implements basic shipping cost logic based on Brazil regions.
- Uses Swagger/OpenAPI for easy testing

## Key concepts applied
- Feign Client: Integrated OpenFeign for HTTP communication. This project uses Interfaces and annotations to consume ViaCEP API.
- DTO Pattern: Used to encapsulate data sent from ViaCEP API
- Project architeture: Ensures clear separation of concerns and easy scalability
