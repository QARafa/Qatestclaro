#Author: rmoreira2512@gmail.com


Feature: Realizar Login
  Eu como usuario gostaria de realizar o Login

 
  Scenario: Realizando Login com usuario Existente
    Given que eu esteja no "http://automationpractice.com"
    When que eu clico e Singin 
    And preencho o email já cadastrado "testeqaorafa3@outlook.com"
    And preencho a senha já cadastrado "Qa12345"
    And clico em SinginGreen
    Then valido "MY ACCOUNT"  

