# 🍰 KELEY BOLOS Backend

![Java](https://img.shields.io/badge/Java-17-orange)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.x-brightgreen)
![Status](https://img.shields.io/badge/status-em%20desenvolvimento-blue)
![License](https://img.shields.io/badge/license-MIT-lightgrey)

API backend desenvolvida com **Java + Spring Boot** para gerenciamento de encomendas da **KELEY BOLOS**.

O objetivo do projeto é criar um sistema real de pedidos para auxiliar no controle de encomendas, produtos, horários de retirada e futuras integrações com WhatsApp e painel administrativo.

---

## 🚀 Tecnologias utilizadas

- Java 17  
- Spring Boot  
- Spring Data JPA  
- Spring Security  
- H2 Database  
- Lombok  
- Maven  

---

## 📌 Funcionalidades

### 🍞 Produtos
- CRUD completo de produtos

### 🧾 Pedidos
- CRUD completo de pedidos

### ⚙️ Recursos implementados

- Arquitetura em camadas (Controller, Service, Repository)
- DTOs (`PedidoDTO` e `PedidoResponseDTO`)
- Validação com Spring Validation (`@Valid`, `@NotNull`, `@Positive`)
- Tratamento global de exceções (`@ControllerAdvice`)
- Uso de `BigDecimal` para valores monetários
- Controle de data e horário (`LocalDate`, `LocalTime`)
- Relacionamento entre entidades (`@ManyToOne`)
- Uso de `Optional` e programação funcional no Service
- Respostas padronizadas via DTO
- Banco em memória H2
- Testes via Postman

---

## 📂 Estrutura do projeto

src/main/java/com/izabelaxavier/keleybolosapi
├── controller
├── dto
├── entity
├── exception
├── repository
├── security
└── service

---

## 📅 Evolução do projeto

### 📌 13/05/2026
- Criação inicial do projeto
- Configuração do Spring Boot
- Estrutura base da API
- CRUD de Produtos
- Integração com H2
- Primeiros testes no Postman

### 📌 14/05/2026
- Configuração inicial do Spring Security
- Organização de pacotes e estrutura

### 📌 15/05/2026
- Criação da entidade Pedido
- Uso de `LocalDate` e `LocalTime`
- Modelagem inicial das regras de negócio

### 📌 18/05/2026 🚀
- Relacionamento @ManyToOne (Pedido → Produto)
- Criação de Repository e Controller de pedidos
- Implementação de POST e GET
- DTOs de entrada e saída
- Uso de BigDecimal
- Testes completos no Postman (201 Created)

### 📌 19/05/2026 ⚡
- GET /pedidos/{id}
- PUT /pedidos/{id}
- DELETE /pedidos/{id}
- Uso de Optional
- Tratamento de 404/200/204
- CRUD completo de pedidos

### 📌 20/05/2026 🏗️
- Criação da camada Service
- Refatoração do Controller
- Centralização da regra de negócio
- Uso de .map() e .orElseGet()

### 📌 21/05/2026 🛡️
- Validação com Spring Validation
- Implementação de @ControllerAdvice
- Tratamento global de erros (400 Bad Request)
- Respostas de erro estruturadas por campo

---

## 🎯 Próximos passos

- Integração com frontend
- Migração para PostgreSQL
- Deploy da aplicação
- Integração com WhatsApp
- Painel administrativo

---

## ▶️ Como executar o projeto

git clone https://github.com/izabelaxavier/keley-bolos-backend.git

cd keley-bolos-backend

mvn spring-boot:run

A aplicação ficará disponível em:

http://localhost:8080

---

## 📡 Endpoints

### 🍞 Produtos
- POST /produtos  
- GET /produtos  
- PUT /produtos/{id}  
- DELETE /produtos/{id}  

### 🧾 Pedidos
- POST /pedidos  
- GET /pedidos  
- GET /pedidos/{id}  
- PUT /pedidos/{id}  
- DELETE /pedidos/{id}  

---

## 👩‍💻 Desenvolvido por

Izabela Xavier

LinkedIn: https://www.linkedin.com/in/izabela-xavier-dev/  
GitHub: https://github.com/izabelaxavier  
