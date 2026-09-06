**Aluno:** Fellype Gabriel Agripino dos Santos
**Matrícula:** 2525050400
**Turma:** 7
**Curso:** Análise e Desenvolvimento de Sistemas
**Instituição:** Centro Universitário UNIFACISA
**Competência:** Integrar Interfaces Web e Serviços Web
**Professor:** Jonathan Lima
**Data de entrega:** 05/09/2026

---

# JJ Publicidade API

API REST desenvolvida em Java com Spring Boot, para a competência de Integrar Interfaces Web e Serviços Web (ADS - UNIFACISA).

## Sobre o projeto

CRUD completo para gerenciamento de clientes e anúncios de uma empresa de carro de som (JJ Publicidade).

## Entidades

- **Cliente**: nome, telefone, endereço
- **Anuncio**: texto, data de veiculação, valor, cliente relacionado (1 Cliente -> N Anuncios)

## Tecnologias

- Java 17
- Spring Boot
- Spring Data JPA
- H2 Database
- Lombok
- Maven

## Estrutura de pastas

- `Entidades` — classes de domínio
- `Repositorios` — interfaces JpaRepository
- `Services` — regras de negócio
- `Controladores` — endpoints REST

## Endpoints

### Clientes
| Método | Rota | Ação |
|--------|------|------|
| GET | /clientes | Lista todos |
| GET | /clientes/{id} | Busca por id |
| POST | /clientes | Cria novo |
| PUT | /clientes/{id} | Atualiza |
| DELETE | /clientes/{id} | Remove |

### Anúncios
| Método | Rota | Ação |
|--------|------|------|
| GET | /anuncios | Lista todos |
| GET | /anuncios/{id} | Busca por id |
| POST | /anuncios | Cria novo |
| PUT | /anuncios/{id} | Atualiza |
| DELETE | /anuncios/{id} | Remove |

## Como rodar

1. Clonar o repositório
2. Importar como projeto Maven no Eclipse (ou outra IDE)
3. Rodar `ApiApplication.java`
4. API disponível em `http://localhost:8080`

## Testes

Todos os endpoints foram testados manualmente no Postman, com resultados validados (201 Created, 200 OK, 204 No Content).