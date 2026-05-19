# 🍰 KELEY BOLOS Backend

API backend desenvolvida com **Java + Spring Boot** para gerenciamento de encomendas da **KELEY BOLOS**.

O objetivo do projeto é criar um sistema real de pedidos para auxiliar no controle de encomendas, produtos, horários de retirada e futuramente integração com WhatsApp e painel administrativo.

---

## 🚀 Tecnologias utilizadas

- Java
- Spring Boot
- Spring Data JPA
- Spring Security
- H2 Database
- Lombok
- Maven

---

## 📌 Funcionalidades atuais

### Produtos
✅ CRUD completo de produtos

### Pedidos
✅ CRUD completo de pedidos

### Recursos implementados

- Estrutura de pedidos com DTOs (`PedidoDTO` e `PedidoResponseDTO`)
- Controle de data de retirada (`LocalDate`)
- Controle de horário de retirada (`LocalTime`)
- Relacionamento entre entidades com JPA (`@ManyToOne`)
- Integração com banco H2
- Respostas customizadas com DTO de saída
- Tratamento de valores monetários com `BigDecimal`
- Testes realizados no Postman
- API REST estruturada em camadas

---

## 📂 Estrutura do projeto

```text
src/main/java/com/izabelaxavier/keleybolosapi
├── controller
├── dto
├── entity
├── repository
└── security
```

---

## 📅 Evolução do projeto

### 📌 13/05/2026

- Criação inicial do projeto
- Configuração do Spring Boot
- Estruturação inicial da API
- Criação da entidade `Produto`
- Implementação do `ProdutoRepository`
- Criação do `ProdutoController`
- CRUD completo de produtos
- Integração com banco H2
- Primeiros testes no Postman

---

### 📌 14/05/2026

- Configuração inicial do Spring Security
- Ajustes e melhorias na estrutura da API
- Organização dos pacotes do projeto

---

### 📌 15/05/2026

- Criação da entidade `Pedido`
- Modelagem inicial das regras de negócio
- Implementação de `LocalDate` para data de retirada
- Implementação de `LocalTime` para horário de retirada
- Estruturação dos atributos de pedidos
- Evolução na modelagem de entidades

---

### 📌 18/05/2026 🔥 (Grande salto de arquitetura)

- Implementação de relacionamento JPA (`@ManyToOne`) entre `Pedido` e `Produto`
- Criação do `PedidoRepository`
- Criação do `PedidoController`
- Implementação dos endpoints `GET` e `POST` para pedidos
- Ajustes no Spring Security liberando rotas `/pedidos/**`
- Implementação de DTOs (`PedidoDTO` e `PedidoResponseDTO`)
- Uso de `BigDecimal` para valores monetários
- Testes completos via Postman com retorno `201 Created`

---

### 📌 19/05/2026 🚀 (CRUD completo de pedidos)

#### 🔎 Busca de pedidos

Endpoint implementado:

`GET /pedidos/{id}`

Funcionalidades:

- Busca de pedidos por ID
- Uso de `Optional<Pedido>`
- Retorno `200 OK`
- Retorno `404 Not Found`
- Conversão para `PedidoResponseDTO`

Fluxo testado:

`POST → GET`

---

#### 🗑️ Exclusão de pedidos

Endpoint implementado:

`DELETE /pedidos/{id}`

Funcionalidades:

- Validação com `existsById()`
- Exclusão usando `deleteById()`
- Retorno `204 No Content`
- Retorno `404 Not Found`

Fluxo testado:

`POST → GET → DELETE → GET (404)`

---

#### ✏️ Atualização de pedidos

Endpoint implementado:

`PUT /pedidos/{id}`

Funcionalidades:

- Atualização completa dos pedidos
- Alteração de:
  - quantidade
  - forma de pagamento
  - observações
  - data de retirada
  - horário de retirada
  - produto relacionado
- Validação de produto via `produtoId`
- Conversão para `PedidoResponseDTO`
- Tratamento `404 Not Found`

Fluxo testado:

`POST → GET → PUT → GET`

---

### ✅ CRUD completo de pedidos finalizado

Endpoints implementados:

- `POST /pedidos`
- `GET /pedidos`
- `GET /pedidos/{id}`
- `PUT /pedidos/{id}`
- `DELETE /pedidos/{id}`

---

## 🎯 Próximos passos

- Integração com frontend
- Migração para PostgreSQL
- Deploy da aplicação
- Integração futura com WhatsApp
- Painel administrativo

---

## 👩‍💻 Desenvolvido por

**Izabela Xavier**

LinkedIn: https://www.linkedin.com/in/izabela-xavier-dev/

GitHub: https://github.com/izabelaxavier
