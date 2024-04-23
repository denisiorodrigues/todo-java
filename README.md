# ToDo List

Uma aplicação com uma simplicidade nas regras mas abordando todas as melhores práticas de desenvolvimento como:

- Código limpo
- Testes Unitários
- Docker para subir uma instância de base de dados

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