#Author: rmoreira2512@gail.com


 Feature: Realizar Cadastro 
  Eu como usuario quero acessar o site e realizar um cadastro
  
 Background:

  Given que eu esteja no "http://automationpractice.com"
  When que eu click e Singin 

  
 Scenario: C0 Realizar um Cadastrado
  
  When que eu click e Singin 
  And Preencho o campo email "testeqaorafaqa6644@outlook.com"
  And Clico em Create an account  
  And Preencho o First Name "Rafael"
  And Preencho o Last Name "Santos"
  And Preencho o Password "Qa12345"
  And Seleciono dia do aniversario 
  And Seleciono o Mes de aniversari
  And Seleciono o Ano de aniversario 
  And descrevo o address "St Tesla"
  And descrevo o city "Bronx"
  And seleciono State 
  And descrevo o Postal Code "10452"
  And descrevo o Mobile Phone "2124567890"
  And Clico em Register
  Then entao valido "MY ACCOUNT"
  
  
   Scenario: CN01 Cadastro Codigo Postal Formato Incorreto
  
  
  And Preencho o campo email "testeqaorafa4@outlook.com"
  And Clico em Create an account  
  And Preencho o First Name "Rafael"
  And Preencho o Last Name "Santos"
  And Preencho o Password "Qa12345"
  And Seleciono dia do aniversario 
  And Seleciono o Mes de aniversari
  And Seleciono o Ano de aniversario 
  And descrevo o address "St Tesla"
  And descrevo o city "Bronx"
  And seleciono State 
  And descrevo o Postal Code "10452000"
  And descrevo o Mobile Phone "2124567890"
  And Clico em Register
  Then entao valido "The Zip/Postal code you've entered is invalid. It must follow this format: 00000"
  
     Scenario: CN02 Cadastro com Senha menor que Cinco digito
  
  
  And Preencho o campo email "testeqaorafa5@outlook.com"
  And Clico em Create an account  
  And Preencho o First Name "Rafael"
  And Preencho o Last Name "Santos"
  And Preencho o Password "Qa1"
  And Seleciono dia do aniversario 
  And Seleciono o Mes de aniversari
  And Seleciono o Ano de aniversario 
  And descrevo o address "St Tesla"
  And descrevo o city "Bronx"
  And seleciono State 
  And descrevo o Postal Code "10452"
  And descrevo o Mobile Phone "2124567890"
  And Clico em Register
  Then entao valido "passwd is invalid."
  
   Scenario: C03 Realizar Login
  
  
  And Preencho o campo email Login "testeqaorafa5@outlook.com"
  And Preencho o campo Senha Login "Qa12345"
  And Clico em Singin Verde 
  Then Valido o Acesso com "MY ACCOUNT"
  



 