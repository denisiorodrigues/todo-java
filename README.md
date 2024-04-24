<h1 align="center">
  Todo List for JAVA
</h1>

Uma aplicação com uma simplicidade nas regras mas abordando todas as melhores práticas de desenvolvimento como:

- Código limpo
- Testes Unitários
- Docker para subir uma instância de base de dados

O projeto foi elaborado [nesse vídeo](https://youtu.be/IjProDV001o) da <img src="https://img.shields.io/static/v1?label=Youtube&message=@giulianabezerra&color=8257E5&labelColor=000000" alt="@giulianabezerra" /> .


## Tecnologias
 
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring MVC](https://docs.spring.io/spring-framework/reference/web/webmvc.html)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [SpringDoc OpenAPI 3](https://springdoc.org/v2/#spring-webflux-support)
- [Mysql](https://dev.mysql.com/downloads/)

## Práticas adotadas

- SOLID, DRY, YAGNI, KISS
- API REST
- Consultas com Spring Data JPA
- Injeção de Dependências
- Tratamento de respostas de erro
- Geração automática do Swagger com a OpenAPI 3


## Como Executar
- Criar a base de dados antes de rodar, pois o JPA só cria as tebalas se houver uma base de dados
- Clonar repositório git
- Construir o projeto:
```
$ ./mvnw clean package
```
- Executar a aplicação:
```
$ java -jar target/todolist-0.0.1-SNAPSHOT.jar
```

A API poderá ser acessada em [localhost:8080](http://localhost:8080).
O Swagger poderá ser visualizado em [localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)


## API Endpoints

Para fazer as requisições HTTP abaixo, foi utilizada a ferramenta [REST Client](https://github.com/Huachao/vscode-restclient):

- Listar todos
```
### GET ALL
GET http://localhost:8080/todos
Accept: application/json
```

- Criar a tarefa
```
POST http://localhost:8080/todos
content-type: application/json

{
  "name": "Tarefa menos importante",
  "description": "Separa os documentos para o deposito",
  "done": false,
  "priority": 3
}
```

-  Atualizar a tarefa
```
PUT http://localhost:8080/todos
content-type: application/json

{
   "id": 1,
  "name": "Tarefa mais importante",
  "description": "Concluir o projeto até o final do mês de abril",
  "done": false,
  "priority": 1
}
```
- Remover a tarefa
```
DELETE http://localhost:8080/todos/2
```


## Comandos SQL 

Criar uma base de dados
```bash
CREATE DATABASE todolist;
```

Conceder privilégios a um usuário na base de dados
```bash
GRANT ALL PRIVILEGES ON *.* TO 'myuser'@'%';
```

Recarregar as permissões do MySQL para que as alterações entrem em vigor imediatamente
```bash
FLUSH PRIVILEGES;
```

Consulta para visualizar as permissões concedidas aos usuários
```bash
SELECT user, host, authentication_string, Select_priv, Insert_priv, Update_priv, Delete_priv, Create_priv, Drop_priv, Grant_priv, References_priv, Alter_priv, Create_tmp_table_priv, Lock_tables_priv, Create_view_priv, Show_view_priv, Create_routine_priv, Alter_routine_priv, Execute_priv, Event_priv, Trigger_priv 
FROM mysql.user;
```

Todos os crétidos a <img src="https://img.shields.io/static/v1?label=Youtube&message=@giulianabezerra&color=8257E5&labelColor=000000" alt="@giulianabezerra" /> o meu mais muito obrigado por compartilhar o conteúdo

https://github.com/giuliana-bezerra/todolist-desafio-backendjr/blob/main/src/test/java/br/com/giulianabezerra/todolist/TodolistApplicationTests.java