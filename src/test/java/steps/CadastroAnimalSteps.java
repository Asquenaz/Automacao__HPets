package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CadastroAnimalPage;


public class CadastroAnimalSteps {
    CadastroAnimalPage cadAnimal = new CadastroAnimalPage();

    @Given("Que esteja na tela de cadastro de animais")
    public void queEstejaNaTelaDeCadastroDeAnimais() {
        cadAnimal.acessarTelaCadastro();
    }

    @When("preenchendo_com_dados_corretos")
    public void preenchendoComDadosCorretos() throws InterruptedException {
        cadAnimal.preencherDados();

    }

    @Then("o cadastro do animal e realizado")
        public void oCadastroDoAnimalERealizado () throws InterruptedException {
            cadAnimal.realizarCadastro();
        }
    }

