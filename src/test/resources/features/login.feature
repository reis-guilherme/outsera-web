#language: pt
#enconding: UTF-8
#author: Guilherme Teixeira
#version: 1.0

Funcionalidade: Login
  Com essa funcionalidade iremos realizar o login de um usuário cadastrado na aplicação

  Como um usuário cadastrado
  Eu preciso inserir dados cadastrais
  Para o login ser efetuado com sucesso

  Contexto: Entrar na tela de login
    Dado que o cliente esteja na tela de login

  @smokeTest @loginAplicacao
  Cenário: Validar o login na aplicação
    Quando inserir os dados do usuário
      | usuario       | senha        |
      | standard_user | secret_sauce |
    Então deve realizar o login com sucesso

  @autenticacaoIncorreta
  Esquema do Cenario: Validar autenticações incorretas
    Quando inserir os dados do usuário
      | usuario   | senha   |
      | <usuario> | <senha> |
    Então deve exibir a mensagem <mensagem> de login incorreto com sucesso

    Exemplos:
      | usuario         | senha        | mensagem                                                                    |
      | locked_out_user | secret_sauce | "Epic sadface: Sorry, this user has been locked out."                       |
      | testeoutsera    | secret_sauce | "Epic sadface: Username and password do not match any user in this service" |
      | standard_user   | testeoutsera | "Epic sadface: Username and password do not match any user in this service" |