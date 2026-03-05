#language: pt
#enconding: UTF-8
#author: Guilherme Teixeira
#version: 1.0

Funcionalidade: Checkout
  Com essa funcionalidade iremos realizar checkout de um produto na aplicação

  Como um usuário cadastrado
  Eu quero possuir um fluxo de checkout
  Para a compra ser efetuada com sucesso

  Contexto: Entrar na tela de login
    Dado que o cliente esteja na tela de login
    E inserir os dados do usuário
      | usuario       | senha        |
      | standard_user | secret_sauce |

  @smokeTest @checkout
  Cenário: Validar o login na aplicação
    E adicionar um produto no carrinho
    Quando realizar o checkout
    Então deve validar mensagem de compra com sucesso "Thank you for your order!"