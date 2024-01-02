# code-with-quarkus

This project uses Quarkus, the Supersonic Subatomic Java Framework.

# Projeto CRUD de Produtos com Quarkus

Este projeto é um exemplo simples de um aplicativo CRUD (Create, Read, Update, Delete) utilizando o framework Quarkus para gerenciamento de produtos. Ele demonstra como construir uma aplicação Java rápida, leve e eficiente, ideal para aplicações nativas de nuvem.

## Pré-requisitos

Antes de começar, certifique-se de ter o seguinte instalado em sua máquina:

- [Java Development Kit (JDK)](https://adoptopenjdk.net/) - Versão 11 ou superior
- [Apache Maven](https://maven.apache.org/)

## Configuração do Ambiente

Clone este repositório e navegue até o diretório do projeto:

```bash
git clone https://github.com/seu-usuario/seu-repositorio.git
cd seu-repositorio
Executando o Projeto
Execute o aplicativo Quarkus usando o seguinte comando:

## Executando
```bash
Copy code
./mvnw compile quarkus:dev
Isso iniciará o servidor Quarkus localmente. Você poderá acessar a aplicação em http://localhost:8080.



## Endpoints CRUD
A API oferece os seguintes endpoints para operações CRUD de produtos:

Listar todos os produtos:
GET /produtos

Buscar um produto por ID:
GET /produtos/{id}

Adicionar um novo produto:
POST /produtos

Atualizar um produto existente:
PUT /produtos/{id}

Remover um produto por ID:
PUT /produtos/{id}

Remover um produto por ID:
DELETE /produtos/{id}

