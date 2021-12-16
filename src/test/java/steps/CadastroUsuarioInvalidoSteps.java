package steps;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.CadastroUsuarioInvalidoPages;
import utils.Browser;


public class CadastroUsuarioInvalidoSteps {
    Browser abrirHpets = new Browser();
    CadastroUsuarioInvalidoPages cadInvalido = new CadastroUsuarioInvalidoPages();
    private WebDriver driver;


    @Given("Que estou na tela de de cadastro")
    public void que_estou_na_tela_de_de_cadastro() {
        driver = abrirHpets.getDriver();
        driver.findElement(By.id("cad-tab")).click();

    }

    @When("Cadastro dados invalidos")
    public void cadastro_dados_invalidos() {

        driver.findElement(By.id("name")).sendKeys(cadInvalido.getNome());
        driver.findElement(By.id("email")).sendKeys(cadInvalido.emailFormatado());
        driver.findElement(By.id("password")).sendKeys(cadInvalido.getSenha());
        driver.findElement(By.id("password-confirm")).sendKeys(cadInvalido.getConfirmacaoSenha());
    }

    @Then("O cadastro nao e realizado")
    public void o_cadastro_nao_e_realizado()  {
        driver.findElement(By.cssSelector(".btn")).click();
        abrirHpets.fecharNavegador();
    }
}
