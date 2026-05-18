# 🍰 KELEY BOLOS Backend

API backend desenvolvida com **Java + Spring Boot** para gerenciamento de encomendas da KELEY BOLOS. O objetivo do projeto é criar um sistema real de pedidos para auxiliar no controle de encomendas, produtos, horários de retirada e futuramente integração com WhatsApp e painel administrativo.

## 🚀 Tecnologias utilizadas

- Java
- Spring Boot
- Spring Data JPA
- Spring Security
- H2 Database
- Lombok
- Maven

## 📌 Funcionalidades atuais

- CRUD completo de produtos
- CRUD de pedidos
- Estrutura de pedidos com DTO (Data Transfer Objects)
- Controle de data de retirada (`LocalDate`)
- Controle de horário de retirada (`LocalTime`)
- Integração com banco H2
- Testes realizados no Postman
- API REST estruturada de forma profissional
- Relacionamento entre entidades com JPA (`@ManyToOne`)
- Respostas customizadas com DTO de saída
- Tratamento de valores monetários com `BigDecimal`

## 📂 Estrutura do projeto

src/main/java/com/izabelaxavier/keleybolosapi  
├── controller  
├── dto  
├── entity  
├── repository  
└── security  

## 📅 Evolução do projeto

📌 13/05/2026  
- Criação inicial do projeto  
- Configuração do Spring Boot  
- Estruturação inicial da API  
- Criação da entidade Produto  
- Implementação do ProductRepository  
- Criação do ProductController  
- CRUD completo de produtos  
- Integração com banco H2  
- Primeiros testes no Postman  

📌 14/05/2026  
- Configuração inicial do Spring Security  
- Ajustes e melhorias na estrutura da API  
- Organização dos pacotes do projeto  

📌 15/05/2026  
- Criação da entidade Pedido  
- Modelagem inicial das regras de negócio  
- Implementação de `LocalDate` para data de retirada  
- Implementação de `LocalTime` para horário de retirada  
- Estruturação dos atributos de pedidos  
- Evolução no entendimento de modelagem de entidades  

📌 18/05/2026 🔥 (Grande salto de arquitetura)  
- Implementação de relacionamento JPA (`@ManyToOne`) entre Pedido e Produto  
- Criação de `PedidoRepository` e `PedidoController`  
- Implementação de endpoints GET e POST para pedidos  
- Ajustes no Spring Security liberando rotas `/pedidos/`  
- Implementação de arquitetura com DTOs (PedidoDTO e PedidoResponseDTO)  
- Uso de BigDecimal para valores monetários  
- Testes completos via Postman com status 201 Created  

## 🎯 Próximos passos

- Integração com frontend  
- Migração para PostgreSQL  
- Deploy da aplicação  
- Integração futura com WhatsApp  
- Painel administrativo  

## 👩‍💻 Desenvolvido por

Izabela Xavier  
LinkedIn: https://www.linkedin.com/in/izabela-xavier-dev/  
GitHub: https://github.com/izabelaxavier
