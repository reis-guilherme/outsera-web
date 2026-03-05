<h1 align="center">Automação Web Saucedemo</h1>
<h1 align="center">
    <a href="https://www.oracle.com/br/java/technologies/javase/javase-jdk8-downloads.html">🔗 Java</a>
    <a href="https://www.selenium.dev/">🔗 Selenium</a>
    <a href="http://cucumber.io/">🔗 Cucumber</a>
    <a href="https://junit.org/junit5/">🔗 jUnit</a>
    <a href="https://github.com/DiUS/java-faker">🔗 Faker</a>

</h1>
<p align="center">🚀 Projeto de automação de testes utilizando as técnicas da metodologia BDD.</p>


## Começando

Para executar o projeto, será necessário instalar os seguintes programas:

- [JDK: Necessário para executar o projeto Java](https://www.oracle.com/br/java/technologies/downloads/)
- [Maven: Necessário para realizar o build do projeto Java](https://maven.apache.org/download.cgi)

*Não Esqueça de configurar as variáveis de ambiente para execução.
- [Tutorial para configuração das variáveis](https://medium.com/beelabacademy/configurando-vari%C3%A1veis-de-ambiente-java-home-e-maven-home-no-windows-e-unix-d9461f783c26#:~:text=Bom%2C%20mas%20o%20que%20s%C3%A3o,arquivos%20necess%C3%A1rios%2C%20inclusive%20os%20bin%C3%A1rios.)
- [IntelliJ: Para desenvolvimento do projeto](https://www.jetbrains.com/pt-br/idea/)

*Instale também os plugins Gherkin e Cucumber for Java.

- [Git: Para versionamento e clone do projeto](https://github.com/guilhermert14/projeto_web_api)


## Execução Via Terminal

É possível executar o projeto via linha de comando. Após configurar as variáveis de ambiente abra o terminal.

```bash
# clonando projeto do git
$ git clone https://github.com/guilhermert14/projeto_web_api.git

# acesse a pasta do projeto
$ cd outsera-web

# execute o comando do maven para execução dos testes.
$ mvn clean test
```

## Execução via IDE

```bash
                                                                   
├───src                                               
│   ├───main                                          
│   │   ├───java                                      
│   │   │   └───outsera                                    
│   │   │       └───web                               
│   │   │           └───common                        
│   │   │           ├───configuration             
│   │   │           ├───enums           
│   │   │           └───interfaces  
│   └───test                                          
│       ├───java                                      
│       │   └───outsera                                    
│       │   │   └───web 
│       │   │       ├───funcionalidades     # Interações com a tela.
│       │   │       ├───pages               # Mapeamento de elementos
│       │   │       └───steps               # Steps de testes 
│       │   └───runTest   # Classe de execução dos testes.
│       │                         
│       └───resources                                 
│           └───features  # Cenários de Teste no formato Gherkin
```

O arquivo que deve ser executado encontra-se:
```bash
src/test/java/outsera/web/runTest/RunTest.java

# Utilizar a tag para rodar os cénarios que deseja.
# Exemplo:
tags = {"@login"})

```

#### [IntelliJ] Para executar o projeto basta clicar com o botão direito do mouse -> Run 'RunTest'

## Allure Report

O projeto utiliza Allure Report para geração de relatórios de execução dos testes.

```bash
# Após executar os testes:
$ mvn clean test

# Os resultados serão salvos em:
$ target/allure-results

# Para visualizar o relatório execute:
$ mvn allure:serve
```


## Diretrizes das decisões tomadas
####  Linguagem de programação escolhida: Java
####  Design Pattern: Page Object

