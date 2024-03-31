# Adapters

Seguindo a arquitetura limpa

Nessa pasta temos algumas subpastas para melhor organização das camadas:

- Config: arquivo de configurações do swagger e da autenticação JWT
- Controller: Primeiro lugar aonde bate o request, a rota do request, função de apenas chamar o service e fazer o mapper
- Db.repositories: Repositórios do JPA
- DTODTOs (Data Transfer Objects) são objetos utilizados para transferir dados entre diferentes partes do sistema, como entre a camada de apresentação (controllers) e a camada de serviços
- Mappers: Os mappers são responsáveis por converter do request para dominio
