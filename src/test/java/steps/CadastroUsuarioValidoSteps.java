package steps;

import pages.CadastroUsuarioValidoPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CadastroUsuarioValidoSteps {
    CadastroUsuarioValidoPage cadUserPage = new CadastroUsuarioValidoPage();


    @Given("que tenha os dados validos para realizar o cadastro")
    public void queTenhaOsDadosValidosParaRealizarOCadastro() {
        cadUserPage.acessarTelaCadastro();
    }

    @When("inseridos os dados nos campos corretos")
    public void inseridos_os_dados_nos_campos_corretos() {
        cadUserPage.inserirDadosValidos();
    }

    @Then("o cadastro e realizado")
    public void oCadastroERealizado() throws InterruptedException  {
        cadUserPage.cadastroRealizado();

    }
}
