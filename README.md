# KELEY BOLOS Backend 🍰

API backend desenvolvida com Java + Spring Boot para gerenciamento de encomendas da KELEY BOLOS.

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

✅ CRUD completo de produtos  
✅ Estrutura inicial de pedidos  
✅ Controle de data de retirada  
✅ Controle de horário de retirada  
✅ Integração com banco H2  
✅ Testes realizados no Postman  
✅ Estrutura REST API  

---

## 📂 Estrutura do projeto

src/main/java/com/izabelaxavier/keleybolosapi

├── controller  
├── entity  
├── repository  
└── security  

---

## 📅 Evolução do projeto

### 13/05/2026
- Criação inicial do projeto
- Configuração do Spring Boot
- Estruturação inicial da API
- Criação da entidade Produto
- Implementação do ProdutoRepository
- Criação do ProdutoController
- CRUD completo de produtos
- Integração com banco H2
- Primeiros testes no Postman

### 14/05/2026
- Configuração inicial do Spring Security
- Ajustes e melhorias na estrutura da API
- Organização dos pacotes do projeto

### 15/05/2026
- Criação da entidade Pedido
- Modelagem inicial das regras de negócio
- Implementação de LocalDate para data de retirada
- Implementação de LocalTime para horário de retirada
- Estruturação dos atributos de pedidos
- Melhor entendimento sobre modelagem de entidades e tipos de dados

---

## 🎯 Próximos passos

- Relacionamento entre Pedido e Produto
- Criação do PedidoRepository
- Criação do PedidoController
- Integração entre frontend e backend
- Banco PostgreSQL
- Deploy da aplicação
- Integração futura com WhatsApp
- Painel administrativo

---

## 👩‍💻 Desenvolvido por

Izabela Xavier

- LinkedIn: https://www.linkedin.com/in/izabela-xavier-dev/
- GitHub: https://github.com/izabelaxavier
