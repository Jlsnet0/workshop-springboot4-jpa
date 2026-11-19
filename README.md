# Workshop Spring Boot JPA

Projeto desenvolvido durante os estudos do curso **Java Completo — Programação Orientada a Objetos + Projetos**, do professor Nélio Alves.

O objetivo é praticar o desenvolvimento de APIs REST com Spring Boot, trabalhando com persistência de dados, mapeamento objeto-relacional e organização em camadas.

## Tecnologias utilizadas

- **Java 25**
- **Spring Boot 4.1.2**
- **Spring Data JPA**
- **Hibernate**
- **Maven**
- **H2 Database**
- **PostgreSQL**
- **REST API**

## Sobre o projeto

A aplicação consiste em uma API REST para gerenciamento de um sistema de pedidos, contemplando usuários, produtos, categorias e pedidos.

O projeto permite estudar como estruturar uma aplicação backend utilizando o ecossistema Spring, desde a exposição dos endpoints até o acesso e a persistência dos dados no banco de dados.

## Funcionalidades

- Consulta de usuários, produtos, categorias e pedidos.
- Busca de registros por ID.
- Cadastro de usuários.
- Atualização de usuários.
- Remoção de usuários.
- Relacionamento entre entidades.
- Tratamento de exceções e respostas HTTP.
- Persistência de dados utilizando JPA e Hibernate.

## Arquitetura do projeto

A aplicação está organizada em camadas, separando as responsabilidades de cada componente:

```text
src/main/java/com/joseneto/workshop/
│
├── config/          # Configurações e carga inicial de dados
│
├── entities/        # Entidades e modelos do domínio
│   ├── enums/       # Enumerações
│   └── pk/          # Chaves primárias compostas
│
├── repositories/    # Acesso e persistência de dados
│
├── resources/       # Controllers e endpoints REST
│   └── exceptions/  # Tratamento de exceções HTTP
│
└── services/        # Regras de negócio
    └── exceptions/  # Exceções personalizadas
```

## Principais conceitos estudados

- Desenvolvimento de APIs REST.
- Arquitetura em camadas (Resource, Service e Repository).
- Mapeamento objeto-relacional (ORM).
- JPA e Hibernate.
- Entidades e seus relacionamentos:
  - One-to-One
  - One-to-Many
  - Many-to-One
  - Many-to-Many
- Chaves primárias compostas (`@EmbeddedId`).
- Repositórios com Spring Data JPA.
- Injeção de dependências.
- Tratamento de exceções.
- Manipulação de requisições e respostas HTTP.
- Configuração de perfis de aplicação.

## Endpoints disponíveis

| Método | Endpoint | Descrição |
|---|---|---|
| GET | `/users` | Lista usuários |
| GET | `/users/{id}` | Busca usuário por ID |
| POST | `/users` | Cadastra usuário |
| PUT | `/users/{id}` | Atualiza usuário |
| DELETE | `/users/{id}` | Remove usuário |
| GET | `/products` | Lista produtos |
| GET | `/products/{id}` | Busca produto por ID |
| GET | `/categories` | Lista categorias |
| GET | `/categories/{id}` | Busca categoria por ID |
| GET | `/orders` | Lista pedidos |
| GET | `/orders/{id}` | Busca pedido por ID |

## Como executar o projeto

### Pré-requisitos

- Java 25 ou superior.
- Maven (ou utilização do Maven Wrapper incluído no projeto).

### Executando a aplicação

Clone o repositório:

```bash
git clone URL_DO_REPOSITORIO
```

Entre na pasta do projeto:

```bash
cd workshop-springboot-jpa
```

Execute a aplicação utilizando o Maven Wrapper:

**Linux / macOS:**

```bash
./mvnw spring-boot:run
```

**Windows:**

```bash
mvnw.cmd spring-boot:run
```

Por padrão, a aplicação utiliza o perfil `test`, configurado com o banco de dados H2 em memória e dados iniciais carregados automaticamente.

### Console H2

Após iniciar a aplicação, o console do banco de dados pode ser acessado em:

```text
http://localhost:8080/h2-console
```

Configurações:

- JDBC URL: `jdbc:h2:mem:testdb`
- User Name: `sa`
- Password: (vazio)

## Objetivo de aprendizagem

Este repositório faz parte da minha jornada de aprendizado em **Java Backend**, com foco na construção de uma base sólida em Java, Spring Boot, persistência de dados e desenvolvimento de APIs REST.

O projeto acompanha minha evolução prática durante o curso, servindo também como material de consulta e referência para estudos futuros.
