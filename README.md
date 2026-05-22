# 🍰 KELEY BOLOS Backend

![Java](https://img.shields.io/badge/Java-17-orange)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.x-brightgreen)
![Status](https://img.shields.io/badge/status-em%20desenvolvimento-blue)
![License](https://img.shields.io/badge/license-MIT-lightgrey)

API REST desenvolvida com **Java + Spring Boot** para gerenciamento de encomendas da **KELEY BOLOS**.

O projeto simula um sistema real de pedidos para confeitaria, permitindo o gerenciamento de produtos, encomendas, datas de retirada e regras de negócio, servindo também como projeto de estudo e evolução prática em desenvolvimento backend.

---

# 🚀 Tecnologias utilizadas

- Java 17
- Spring Boot 3
- Spring Data JPA
- Spring Security
- Spring Validation
- H2 Database
- Lombok
- Maven
- Swagger / OpenAPI
- Postman

---

# 📌 Funcionalidades

## 🍞 Produtos
✅ Criar produto  
✅ Listar produtos  
✅ Atualizar produto  
✅ Remover produto  

## 🧾 Pedidos
✅ Criar pedido  
✅ Listar pedidos  
✅ Buscar pedido por ID  
✅ Atualizar pedido  
✅ Excluir pedido  

---

# ⚙️ Recursos implementados

### Arquitetura
- Arquitetura em camadas:
    - Controller
    - Service
    - Repository
    - DTO
    - Exception Handler

### Validação e segurança

- Validação com Spring Validation:
    - `@Valid`
    - `@NotNull`
    - `@Positive`

- Tratamento global de exceções com:

```java
@ControllerAdvice
```

- Configuração inicial do Spring Security

### Regras de negócio

- DTOs:
    - `PedidoDTO`
    - `PedidoResponseDTO`

- Relacionamento:

```java
@ManyToOne
```

(Pedido → Produto)

- Uso de:

```java
Optional
```

- Programação funcional:

```java
.map()
.orElseGet()
```

### Banco e testes

- Banco H2 em memória
- Testes completos via Postman
- Documentação interativa via Swagger

---

# 📂 Estrutura do projeto

```bash
src/main/java/com/izabelaxavier/keleybolosapi
│
├── config
├── controller
├── dto
├── entity
├── exception
├── repository
└── service
```

---

# 📅 Evolução do projeto

## 📌 13/05/2026
- Inicialização do projeto
- Configuração Spring Boot
- CRUD Produtos
- Integração H2
- Primeiros testes Postman

## 📌 14/05/2026
- Configuração inicial Spring Security
- Organização da arquitetura

## 📌 15/05/2026
- Criação entidade Pedido
- Implementação LocalDate e LocalTime
- Modelagem inicial

## 📌 18/05/2026 🚀
- Relacionamento Pedido → Produto
- Repository e Controller de pedidos
- DTOs
- Uso de BigDecimal
- Testes POST / GET

## 📌 19/05/2026 ⚡
- GET /pedidos/{id}
- PUT /pedidos/{id}
- DELETE /pedidos/{id}
- CRUD completo
- Tratamento 404 / 200 / 204

## 📌 20/05/2026 🏗️
- Camada Service
- Refatoração Controllers
- Centralização das regras
- Uso de Optional

## 📌 21/05/2026 🛡️
- Bean Validation
- Global Exception Handler
- Respostas padronizadas
- Tratamento de 400 Bad Request
- Integração Swagger / OpenAPI

---

# 📡 Endpoints

## Produtos

| Método | Endpoint |
|---------|-----------|
| POST | /produtos |
| GET | /produtos |
| PUT | /produtos/{id} |
| DELETE | /produtos/{id} |

## Pedidos

| Método | Endpoint |
|---------|-----------|
| POST | /pedidos |
| GET | /pedidos |
| GET | /pedidos/{id} |
| PUT | /pedidos/{id} |
| DELETE | /pedidos/{id} |

---

# 📖 Swagger

Após executar a aplicação:

```bash
http://localhost:8080/swagger-ui/index.html
```

---

# ▶️ Executando localmente

Clone o repositório:

```bash
git clone https://github.com/izabelaxavier/keley-bolos-backend.git
```

Entrar na pasta:

```bash
cd keley-bolos-backend
```

Executar:

```bash
mvn spring-boot:run
```

Aplicação disponível:

```bash
http://localhost:8080
```

---

# 🎯 Próximos passos

- [ ] PostgreSQL
- [ ] Deploy
- [ ] Integração Frontend
- [ ] Integração WhatsApp
- [ ] Painel administrativo
- [ ] JWT Authentication
- [ ] Docker

---

# 👩‍💻 Desenvolvido por

**Izabela Xavier**

LinkedIn:  
https://www.linkedin.com/in/izabela-xavier-dev/

GitHub:  
https://github.com/izabelaxavier
