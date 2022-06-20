#Author: your.email@your.domain.com


Feature: Realizar Login
  Eu como usuario já cadastrado quero realizar login ao site

  
  Scenario: Realizar login com usuario existente
    Given dado que eu esteja "http://automationpractice.com/index.php"
    When Clico em Singin
    And digito o email
    And digito a senha
    Then Validado a login com "MY ACCOUNT"


