package steps;
import org.openqa.selenium.WebDriver;
import pages.CadastroUsuarioValidoPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import utils.Browser;

public class CadastroUsuarioValidoSteps {
    Browser abrirHpets = new Browser();
    private WebDriver driver;


    @Given("que tenha os dados validos para realizar o cadastro")
    public void queTenhaOsDadosValidosParaRealizarOCadastro() {
        driver = abrirHpets.getDriver();
        driver.findElement(By.id("cad-tab")).click();

        CadastroUsuarioValidoPage cadUserPage = new CadastroUsuarioValidoPage();

        driver.findElement(By.id("name")).sendKeys(cadUserPage.getNome());
        driver.findElement(By.id("email")).sendKeys(cadUserPage.emailFormatado());
        driver.findElement(By.id("password")).sendKeys(cadUserPage.getSenha());
        driver.findElement(By.id("password-confirm")).sendKeys(cadUserPage.getConfirmacaoSenha());
    }

    @When("inseridos os dados nos campos corretos")
    public void inseridos_os_dados_nos_campos_corretos() {
        driver.findElement(By.cssSelector(".btn")).click();
    }

    @Then("o cadastro e realizado")
    public void oCadastroERealizado() {
        abrirHpets.fecharNavegador();
    }
}
