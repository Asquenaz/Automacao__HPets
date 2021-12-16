#langauage eng
Feature: Testar a funcionalidade de login no site do HealthPets

  @LoginUsuario
    Scenario: Realizar login com dados válidos

      Given Que tenha os dados validos para login
      When Inserir os dados e tentar realizar o login
      Then O login é validado e o acesso é liberado


