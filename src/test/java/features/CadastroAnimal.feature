#language eng
Feature: Testar funcionalidade "Realizar cadastro de Animais" no site healthPets

  @CadastroAnimal
  Scenario: Realizar Cadastro de um animal com dados Válidos

    Given Que esteja na tela de cadastro de animais
    When preenchendo_com_dados_corretos
    Then o cadastro do animal e realizado
