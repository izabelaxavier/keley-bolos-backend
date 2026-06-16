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
- H2 Database (utilizado durante o desenvolvimento inicial)
- PostgreSQL
- Docker
- Docker Compose
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

✅ Controle de status do pedido

✅ Cálculo automático do valor total

---

# ⚙️ Recursos implementados

### Controle de pedidos

- Enum `StatusPedido`
- Status disponíveis:
    - RECEBIDO
    - EM_PRODUCAO
    - PRONTO
    - ENTREGUE

- Definição automática do status inicial:

```java
StatusPedido.RECEBIDO
```
- Atualização de status via API

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

- H2 Database (utilizado durante o desenvolvimento inicial)
- PostgreSQL
- Banco PostgreSQL executado via Docker
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
├── enums
```

---

# 📅 Evolução do projeto

## 📌 13/05/2026
- Inicialização do projeto
- Configuração Spring Boot
- CRUD Produtos
- Integração H2
- Primeiros testes Postman

---

## 📌 14/05/2026
- Configuração inicial Spring Security
- Organização da arquitetura
---

## 📌 15/05/2026
- Criação entidade Pedido
- Implementação LocalDate e LocalTime
- Modelagem inicial

---
## 📌 18/05/2026 🚀
- Relacionamento Pedido → Produto
- Repository e Controller de pedidos
- DTOs
- Uso de BigDecimal
- Testes POST / GET

---
## 📌 19/05/2026 ⚡
- GET /pedidos/{id}
- PUT /pedidos/{id}
- DELETE /pedidos/{id}
- CRUD completo
- Tratamento 404 / 200 / 204

---
## 📌 20/05/2026 🏗️
- Camada Service
- Refatoração Controllers
- Centralização das regras
- Uso de Optional

---
## 📌 21/05/2026 🛡️
- Bean Validation
- Global Exception Handler
- Respostas padronizadas
- Tratamento de 400 Bad Request
- Integração Swagger / OpenAPI

---

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

---

## 📌 08/06/2026 🎂

### Melhorias implementadas

- Adicionado campo `nomeCliente` na entidade `Pedido`
- Adicionado campo `nomeCliente` no `PedidoDTO`
- Adicionado campo `nomeCliente` no `PedidoResponseDTO`
- Atualização da camada Service para persistência do cliente
- Atualização do fluxo de criação e atualização de pedidos
- Implementação do mapeamento entre DTOs e entidade
- Testes realizados via Swagger/OpenAPI

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

---

## 📌 09/06/2026 📋

### Melhorias implementadas

- Criação do enum `StatusPedido`
- Adição do campo `status` na entidade `Pedido`
- Atualização do `PedidoDTO`
- Atualização do `PedidoResponseDTO`
- Definição automática do status inicial como `RECEBIDO`
- Implementação da atualização de status via API
- Inclusão do status nas respostas dos pedidos
- Testes realizados via Swagger/OpenAPI

### Status disponíveis

- RECEBIDO
- EM_PRODUCAO
- PRONTO
- ENTREGUE

### Benefícios

- Controle do andamento dos pedidos
- Melhor rastreabilidade da produção
- Base para futuras funcionalidades administrativas

### Fluxo validado

✅ Criação de pedidos com status inicial automático

✅ Atualização de status via API

✅ Consulta de pedidos com status

✅ Persistência do status no banco de dados

✅ Retorno do status nas respostas da API

---

## 📌 10/06/2026 🐳

### Infraestrutura

- Migração do banco H2 para PostgreSQL
- Configuração da conexão com PostgreSQL
- Criação do arquivo `docker-compose.yml`
- Criação do `Dockerfile`
- Banco PostgreSQL executado via Docker
- Primeiros testes de containerização da aplicação

### Regras de negócio

- Implementação do cálculo automático do valor total do pedido

```java
valorTotal = produtoPreco * quantidade
```

- Inclusão do campo `valorTotal` no `PedidoResponseDTO`
- Retorno automático do valor total nas respostas da API

### Melhorias

- Integração completa com PostgreSQL validada
- Persistência dos dados fora do banco H2 em memória
- Estrutura inicial preparada para deploy
- Testes realizados via Swagger/OpenAPI e Postman

### Fluxo validado

✅ Cadastro de produtos

✅ Cadastro de pedidos

✅ Cálculo automático do valor total

✅ Persistência em PostgreSQL

✅ Consulta de pedidos com valor total

✅ Banco executando via Docker

### Containerização

✅ Imagem Docker da aplicação gerada com sucesso

✅ Container PostgreSQL executando via Docker

✅ Comunicação da aplicação com PostgreSQL validada

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
  "produtoPreco": 70.00,
  "valorTotal": 140.00,
  "status": "RECEBIDO"
}

```
---

## 📌 11/06/2026 🔍

### Melhorias implementadas

* Implementação do endpoint `GET /pedidos/status/{status}`
* Criação do método `findByStatus(StatusPedido status)` no `PedidoRepository`
* Desenvolvimento da lógica de busca por status na camada `PedidoService`
* Conversão automática dos resultados para `PedidoResponseDTO`
* Integração completa com o enum `StatusPedido`
* Testes realizados via Swagger/OpenAPI

### Funcionalidades adicionadas

* Consulta de pedidos por status
* Filtragem de pedidos diretamente no banco de dados utilizando Spring Data JPA
* Retorno apenas dos pedidos pertencentes ao status informado

### Fluxo validado

✅ Consulta de pedidos RECEBIDO

✅ Consulta de pedidos EM_PRODUCAO

✅ Consulta de pedidos PRONTO

✅ Consulta de pedidos ENTREGUE

✅ Retorno de lista filtrada de pedidos

✅ Integração com PostgreSQL

### Exemplo

```http
GET /pedidos/status/RECEBIDO
```

Resposta:

```json
[
  {
    "id": 1,
    "nomeCliente": "Izabela Xavier",
    "status": "RECEBIDO"
  }
]
```

### Benefícios

* Otimização das consultas de pedidos
* Base para dashboards administrativos
* Facilita futuras telas de produção e entrega
* Melhor organização do fluxo operacional da confeitaria

---

## 📌 15/06/2026 🔄

### Melhorias implementadas

* Criação do endpoint PATCH `/pedidos/{id}/status`
* Atualização parcial do status dos pedidos
* Implementação da classe `AtualizarStatusDTO`
* Separação da regra de atualização de status do PUT geral
* Integração completa com Swagger/OpenAPI

### Fluxo validado

✅ RECEBIDO → EM_PRODUCAO

✅ EM_PRODUCAO → PRONTO

✅ PRONTO → ENTREGUE

✅ Atualização parcial sem necessidade de alterar outros campos do pedido

✅ Persistência do status no PostgreSQL

✅ Consulta dos pedidos com status atualizado

---

### Dashboard de pedidos

* Criação do endpoint GET `/pedidos/dashboard`
* Contagem de pedidos por status
* Retorno consolidado para painel administrativo
* Integração com `StatusPedido`
* Testes realizados via Swagger/OpenAPI

### Exemplo de resposta

```json
{
  "recebidos": 1,
  "emProducao": 1,
  "prontos": 0,
  "entregues": 0
}
```

### Benefícios

* Visão rápida do andamento dos pedidos
* Base para criação do painel administrativo
* Métricas para acompanhamento da produção

---

### Dashboard financeiro

- Criação do endpoint GET `/pedidos/dashboard/financeiro`
- Contagem total de pedidos
- Soma automática do valor total vendido
- Uso de Stream API
- Uso de reduce() para agregação financeira
- Testes realizados via Swagger/OpenAPI

Exemplo:

```
{
"totalPedidos": 2,
"valorTotalVendido": 210
}
```
---
## 📌 16/06/2026 🔐

### Sistema de autenticação

* Criação da entidade `User`
* Criação da tabela `usuarios` no PostgreSQL
* Implementação do `UserRepository`
* Criação do DTO `LoginDTO`
* Criação do DTO `LoginResponseDTO`
* Implementação da camada `AuthService`
* Criação do endpoint `POST /auth/login`
* Integração do login com PostgreSQL
* Validação de credenciais por e-mail e senha
* Testes realizados via Swagger/OpenAPI

### Fluxo implementado

1. Recebe e-mail e senha via API
2. Busca usuário pelo e-mail no banco de dados
3. Valida a senha informada
4. Retorna resposta de autenticação

### Fluxo validado

✅ Usuário encontrado

✅ Senha válida

✅ Retorno HTTP 200 OK

✅ Login realizado com sucesso

✅ Consulta ao PostgreSQL via Spring Data JPA

### Testes realizados

#### Login válido

```json
{
  "email": "izabelaxavier89@gmail.com",
  "senha": "123456"
}
```

Resposta:

```json
{
  "mensagem": "Login realizado com sucesso"
}
```

#### Login inválido

```json
{
  "email": "izabelaxavier89@gmail.com",
  "senha": "999999"
}
```

Resposta atual:

```text
500 Internal Server Error
```

### Próximas melhorias

* Tratamento de exceções para autenticação
* Criação de `UsuarioNaoEncontradoException`
* Criação de `SenhaInvalidaException`
* Retorno HTTP 401 Unauthorized
* Criptografia de senha com BCrypt
* Implementação de JWT Authentication

```
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
| GET    | /pedidos/status/{status} |

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

Subir o banco PostgreSQL:

```bash
docker-compose up -d
```

Executar a aplicação:

```bash
mvn spring-boot:run
```

Aplicação disponível:

```bash
http://localhost:8080
```

---

# 🎯 Próximos passos

- [ ] Dashboard de pedidos
- [ ] JWT Authentication
- [ ] Execução completa da API via Docker Compose
- [ ] Deploy
- [ ] Painel administrativo
- [ ] Integração Frontend
- [ ] Integração WhatsApp

---

# 👩‍💻 Desenvolvido por

**Izabela Xavier**

LinkedIn:  
https://www.linkedin.com/in/izabela-xavier-dev/

GitHub:  
https://github.com/izabelaxavier
