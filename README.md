# API de Produtos VLJ- Spring Boot

## Descrição
Esta é uma API CRUD para gerenciamento de produtos da VLJ-CARNES, desenvolvida em Spring Boot. Ela permite criar, ler, atualizar e excluir produtos do sistema.

## Tecnologias Utilizadas
- Java 22+
- Spring Boot
- Spring Web
- Spring Data JPA
- Banco de Dados (PostgreSQL)
- Jakarta Validation

## Endpoints

### 1. Listar Todos os Produtos
**Endpoint:** `GET /product/get/all`

**Resposta:** Retorna uma lista com todos os produtos cadastrados.

### 2. Buscar Produto por ID
**Endpoint:** `GET /product/get/{id}`

**Parâmetro:** `id` - Identificador do produto.

**Resposta:** Retorna os detalhes do produto correspondente ao ID informado.

### 3. Inserir um Novo Produto
**Endpoint:** `POST /product/insert`

**Corpo da Requisição:**
```json
{
  "name": "Nome do Produto",
  "price": 100.00,
  "description": "Descrição do Produto",
}
```

**Resposta:** Retorna os dados do produto criado.

### 4. Atualizar um Produto
**Endpoint:** `PUT /product/update`

**Corpo da Requisição:**
```json
{
  "id": "123",
  "name": "Nome Atualizado",
  "price": 120.00,
  "description": "Descrição Atualizada"
}
```

**Resposta:** Retorna os dados do produto atualizado.

### 5. Deletar um Produto
**Endpoint:** `DELETE /product/delete/{id}`

**Parâmetro:** `id` - Identificador do produto a ser removido.

**Resposta:** Retorna os dados do produto deletado.

## Como Executar o Projeto
1. Clone o repositório:
   ```sh
   git clone https://github.com/seu-repositorio.git
   ```
2. Navegue até o diretório do projeto:
   ```sh
   cd APIproduct
   ```
3. Configure o banco de dados no `application.properties` ou `application.yml`.
4. Execute o projeto:
   ```sh
   mvn spring-boot:run
   ```
5. Acesse os endpoints via Postman, Insomnia ou navegador.

## Autor
Desenvolvido por [Seu Nome]

