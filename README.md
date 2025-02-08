# Spring Boot API Demo

This is a Spring Boot REST API demo project that implements a simple product management system.

## Features

- RESTful API endpoints for CRUD operations
- H2 in-memory database
- Spring Data JPA for data persistence
- Lombok for reducing boilerplate code
- Spring Web for REST endpoints

## API Endpoints

- GET /api/products - Get all products
- GET /api/products/{id} - Get a specific product
- POST /api/products - Create a new product
- PUT /api/products/{id} - Update an existing product
- DELETE /api/products/{id} - Delete a product

## Getting Started

1. Clone the repository
2. Run `mvn spring-boot:run`
3. Access the API at `http://localhost:8080`
4. Access H2 Console at `http://localhost:8080/h2-console`