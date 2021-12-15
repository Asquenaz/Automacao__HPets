#language eng
  Feature:  Realizar cadastro com dados invalidos

    @CadastroUsuarioComDadosInvalidos
    Scenario: Realizar cadastro com senha invalida

      Given Que estou na tela de de cadastro
      When   Cadastro dados invalidos
      Then  O cadastro nao e realizado