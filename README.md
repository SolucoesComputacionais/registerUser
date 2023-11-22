<h1>Projeto de Cadastro de Usuários</h1>

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Descrição

Esse projeto consiste em um sistema de Cadastro de Usuário, utilizando as seguintes linguagens:

<img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white">  <img src="https://img.shields.io/badge/MySQL-00000F?style=for-the-badge&logo=mysql&logoColor=white">

O programa permite a inserção de informações como nome, idade e cidade de uma pessoa, armazenando esses dados em um banco de dados MySQL. Além disso, é possível listar os usuários cadastrados.

## Estrutura do Projeto
### Classe Pessoa

A classe Pessoa representa um indivíduo e possui os seguintes atributos:

- `nome` (String): Nome da pessoa.
- `idade` (int): Idade da pessoa.
- `cidade` (String, privado): Cidade da pessoa.


A classe também possui um construtor para inicializar os atributos e métodos getters para acessar as informações.

### Classe Cadastro
A classe Cadastro contém o método main para a execução do programa. Ela oferece duas opções ao usuário:

- Cadastrar um novo usuário.
- Listar todos os usuários cadastrados.

#### Cadastrar Usuário

Ao escolher a opção 1, o programa solicitará o nome, idade e cidade do usuário. Essas informações são então utilizadas para criar um objeto da classe Pessoa, e os dados são inseridos no banco de dados MySQL.


#### Listar Usuários
Ao escolher a opção 2, o programa realiza uma consulta no banco de dados para obter a lista de todos os usuários cadastrados. Essa lista é exibida no console.


## Banco de Dados

O banco de dados utilizado é o MySQL, e a conexão é estabelecida através do JDBC. As informações de conexão estão configuradas para um banco chamado usuariodb com usuário "root" e senha "root". Certifique-se de ter um servidor MySQL em execução na porta 3300.

### Instruções de Uso

- Execute um servidor MySQL na porta 3300.
- Compile e execute o programa Java.
- Escolha a opção desejada:
- Opção 1: Cadastrar usuário.
- Opção 2: Listar usuários cadastrados.

## O que usamos para desenvolver o sistema

Trabalhamos em equipe para realizar todo o desenvolvimento do projeto, devido a isso precisamos buscar dentro plataformas para nos auxiliar neste quesito, disso isso foi utilizado as seguintes plataformas:

<div style="display: inline-block"><br/>
    <img align-itens="center"src="https://img.shields.io/badge/Discord-7289DA?style=for-the-badge&logo=discord&logoColor=white"> 
    <img align-itens="center"src="https://img.shields.io/badge/Visual_Studio_Code-0078D4?style=for-the-badge&logo=visual%20studio%20code&logoColor=white"> 
    <img align-itens="center"src="https://img.shields.io/badge/Oracle-F80000?style=for-the-badge&logo=oracle&logoColor=black"> 
    <img align-itens="center"src="https://img.shields.io/badge/WhatsApp-25D366?style=for-the-badge&logo=whatsapp&logoColor=white"> 
    <img align-itens="center" src="https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white">

</div>




