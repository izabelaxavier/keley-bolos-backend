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
✅ Associar pedido a cliente

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

### Tratamento de exceções

- Exceção personalizada:

```java
ProdutoNaoEncontradoException
```

- Uso de:

```java
orElseThrow()
```

- Retorno HTTP 404 para recursos inexistentes

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
.orElseThrow()
```
- Associação de pedidos a clientes

### Banco e testes

- Banco H2 em memória
- Testes completos via Postman
- Documentação interativa via Swagger
- Testes de:
    - 201 Created
    - 400 Bad Request
    - 404 Not Found

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

## 📌 25/05/2026 🚨
- Criação da exceção personalizada `ProdutoNaoEncontradoException`
- Implementação de `orElseThrow()`
- Tratamento específico para produto inexistente
- Retorno HTTP 404 via `@ControllerAdvice`
- Eliminação de erro genérico 500 Internal Server Error
- Testes completos via Postman
- Fluxo validado:
    - Produto existente → 201 Created
    - Produto inexistente → 404 Not Found
    - Dados inválidos → 400 Bad Request
    
## 📌 08/06/2026 🎂

### Melhorias implementadas

- Adicionado campo `nomeCliente` na entidade `Pedido`
- Adicionado campo `nomeCliente` no `PedidoDTO`
- Adicionado campo `nomeCliente` no `PedidoResponseDTO`
- Atualização da camada Service para persistência do cliente
- Atualização do fluxo de criação e atualização de pedidos
- Implementação do mapeamento entre DTOs e entidade
- Testes realizados via Swagger/OpenAPI

## 📌 09/06/2026 📋

### Melhorias implementadas

- Criação do enum StatusPedido
- Adição do campo status na entidade Pedido
- Definição automática do status inicial como RECEBIDO
- Implementação da atualização de status via API
- Inclusão do status nas respostas dos pedidos

### Status disponíveis

- RECEBIDO
- EM_PRODUCAO
- PRONTO
- ENTREGUE

### Benefícios

- Controle do andamento dos pedidos
- Melhor rastreabilidade da produção
- Base para futuras funcionalidades administrativas


### Funcionalidades adicionadas

- Associação de pedidos a clientes
- Persistência do nome do cliente no banco de dados
- Retorno do nome do cliente nas respostas da API
- Consulta de pedidos contendo dados do cliente

### Fluxo validado

✅ Cadastro de produto

✅ Cadastro de pedido vinculado ao produto

✅ Persistência do nome do cliente

✅ Consulta individual de pedido

✅ Consulta geral de pedidos

✅ Atualização de pedidos

✅ Exclusão de pedidos

### Exemplo de resposta

```json
{
  "id": 1,
  "nomeCliente": "Izabela Xavier",
  "quantidade": 2,
  "formaPagamento": "PIX",
  "observacoes": "Sem cobertura",
  "dataRetirada": "2026-06-10",
  "horarioRetirada": "14:00:00",
  "produtoNome": "Bolo de Chocolate",
  "produtoPreco": 70
}
```
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

- [ ] Status do pedido
- [ ] Cálculo de valor total do pedido
- [ ] PostgreSQL
- [ ] Docker
- [ ] JWT Authentication
- [ ] Deploy
- [ ] Integração Frontend
- [ ] Painel administrativo
- [ ] Integração WhatsApp

---

# 👩‍💻 Desenvolvido por

**Izabela Xavier**

LinkedIn:  
https://www.linkedin.com/in/izabela-xavier-dev/

GitHub:  
https://github.com/izabelaxavier
