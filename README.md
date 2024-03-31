# Ezoom-Teste-Mobile-Backend

Foi desenvolvido também a API com Autenticação básica e o CRUD das tarefas, feito com Java e Spring Boot,além disso foi feito o deploy via AWS, na aws utilizei o ec2 para subir a aplicação, além do RDS para banco de dados!

## Decições técnicas

A arquitetura segue a arquitetura por camadas!
- Adapter
- Domain
- Services

Na pasta services, gostaria de feito com usecases, porém não deu tempo então fiz com service, mas basicamente a funcionalidade do service é ter a regra de negocio da aplicação

## Detalhes principais

- **Arquitetura**: Clean arch com modificações
- **Linguagem**: Java
- **Framework**: Spring Boot
- **Testes**: _Gostaria de ter feito testes unitários e de integração_

## Funcionalidades

- **Autenticação**: Login e registrar usuário. com Autenticação básica via JWT
- **Crud de tarefas**: Criara, ler, atualizar e deletar as tarefas

## Como executar

- **Requisitos**:
- Java 17
- Mysql

```
git clone https://github.com/marcelomoresco/ezoom-backend.git
```

- Instalar as dependencias do maven
