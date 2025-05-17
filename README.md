# 🛡️ Spring Security 6 + JWT + OAuth2 com Spring Boot

Este projeto demonstra a implementação de autenticação e autorização utilizando **Spring Security 6**, **JWT (JSON Web Tokens)** e **OAuth2** em uma aplicação **Spring Boot**. Utiliza **MySQL** como banco de dados, hospedado em um contêiner **Docker**. Para testes de API, foi utilizado o **Postman**, e o **Beekeeper Studio** foi utilizado para visualização e manipulação dos dados no banco.

---

## 🔧 Tecnologias Utilizadas

- **Java 17+**
- **Spring Boot**
- **Spring Security 6**
- **JWT**
- **OAuth2** 
- **MySQL (Docker)**
- **JPA / Hibernate**
- **Postman (para testes REST)**
- **Beekeeper Studio (gerenciador de banco de dados)**

## 🎥 Fonte da Aula

Este projeto foi baseado na seguinte aula no YouTube:  
📺 [Spring Security 6, JWT e OAuth2 - por Programação Full Stack](https://youtu.be/nDst-CRKt_k?si=imcle-6m5VJ8IDEx)

---

## 📬 Endpoints REST

| Método | Endpoint             | Descrição                  |
|--------|----------------------|----------------------------|
| POST   | `/users`             | Cadastro de novo usuário   |
| POST   | `/login`             | Login e geração do JWT     |
| GET    | `/users`             | Listar Usuários            |
| POST   | `/tweets`            | Criar Tweet                |
| DELETE | `/tweets/{id}`       | Deletar Tweet              |
| DELETE | `/feed`              | Listar Tweets              |

---

## 🔐 Segurança
- JWT Token é utilizado para autenticação de endpoints protegidos.
- Após o login, um token JWT é retornado e deve ser enviado no header: Authorization: Bearer SEU_TOKEN
- OAuth2 pode ser configurado para login social (Google, GitHub etc.), se desejado.
