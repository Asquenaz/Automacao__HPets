package steps;

import pages.CadastroUsuarioInvalidoPages;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;




public class CadastroUsuarioInvalidoSteps {
    CadastroUsuarioInvalidoPages cadInvalido = new CadastroUsuarioInvalidoPages();


    @Given("Que estou na tela de de cadastro")
    public void que_estou_na_tela_de_de_cadastro() {
        cadInvalido.telaCadastro();

    }

    @When("Cadastro dados invalidos")
    public void cadastro_dados_invalidos() {
        cadInvalido.inserirDadosCadastro();

    }

    @Then("O cadastro nao e realizado")
    public void o_cadastro_nao_e_realizado() throws InterruptedException {
        cadInvalido.tentativaCadastro();
    }
}
