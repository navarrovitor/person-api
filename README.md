<h2>Desenvolvimento de um sistema de gerenciamento de pessoas em API REST com Spring Boot</h2>
<h6>Projeto feito a partir do live code 'Desenvolvendo um sistema de gerenciamento de pessoas em API REST com Spring Boot' do professor Rodrigo Peleias</h6>

Os seguintes conhecimentos foram abordados:

- Setup inicial de projetos com Spring Boot Initialzr
- Criação de modelo de dados para o mapeamento de entidades em bancos de dados
- Desenvolvimento de operações de gerenciamento de usuários (CRUD)
- Relação de cada uma das operações acima com o padrão arquitetural REST
- Desenvolvimento de testes unitários para validação das funcionalidades
- Implantação do sistema na nuvem através do Heroku

Para executar o projeto no terminal, digite o seguinte comando:

```shell script
mvn spring-boot:run
```

Após executar o comando acima, basta apenas abrir o seguinte endereço e visualizar a execução do projeto:

```
http://localhost:8080/api/v1/people
```

São necessários os seguintes pré-requisitos para a execução do projeto desenvolvido durante a aula:

- Java 11 ou versões superiores
- Maven 3.6.3 ou versões superiores
- Uma IDE (recomendo o uso do VS code)
- Controle de versão GIT instalado na sua máquina
- Conta no GitHub para o armazenamento do seu projeto na nuvem
- Conta no Heroku para o deploy do projeto na nuvem
