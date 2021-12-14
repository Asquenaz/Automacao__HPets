Feature: Testar funcionalidade "Realizar cadastro" no site healthPets

  @Realizar_cadastro
  Scenario: Realizar Cadastro com dados Validos

    Given que tenha os dados validos para realizar o cadastro
    When inseridos os dados nos campos corretos
    Then o cadastro e realizado
