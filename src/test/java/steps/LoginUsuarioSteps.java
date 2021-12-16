package steps;

import pages.LoginUsuarioPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginUsuarioSteps {
    LoginUsuarioPage login = new LoginUsuarioPage();

    @Given("Que tenha os dados validos para login")
    public void que_tenha_os_dados_validos_para_login() {
        login.getEmail();
        login.getSenha();
    }

    @When("Inserir os dados e tentar realizar o login")
    public void inserir_os_dados_e_tentar_realizar_o_login() {
         login.efetuarLogin();
    }
    @Then("O login é validado e o acesso é liberado")
    public void o_login_e_validado_e_o_acesso_e_liberado() throws InterruptedException {
        login.efetuarLogout();
    }
}




