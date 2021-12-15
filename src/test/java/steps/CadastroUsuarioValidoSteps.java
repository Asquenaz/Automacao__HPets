package steps;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import pages.CadastroUsuarioPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import utils.ChomeHPets;

public class CadastroUsuarioValidoSteps {
    ChomeHPets abrirHpets = new ChomeHPets();
    private WebDriver driver;

    @Before
    public void before(){
        driver = abrirHpets.AbrirNavegador();
        driver.findElement(By.id("cad-tab")).click();
    }

    @Given("que tenha os dados validos para realizar o cadastro")
    public void queTenhaOsDadosValidosParaRealizarOCadastro() {
        CadastroUsuarioPage cadUserPage = new CadastroUsuarioPage();

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
