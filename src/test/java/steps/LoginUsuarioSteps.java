package steps;
import utils.ChomeHPets;
import pages.LoginUsuarioPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginUsuarioSteps {
    private WebDriver driver;
    ChomeHPets abrirHpets = new ChomeHPets();
    LoginUsuarioPage loginPage = new LoginUsuarioPage();

    @Given("Que tenha os dados validos para login")
    public void que_tenha_os_dados_validos_para_login() {
        driver = abrirHpets.AbrirNavegador();
        driver.findElement(By.id("email")).sendKeys(loginPage.getUsuario());
        driver.findElement(By.id("password")).sendKeys(loginPage.getSenha());
    }

    @When("Inserir os dados e tentar realizar o login")
    public void inserir_os_dados_e_tentar_realizar_o_login() {
        driver.findElement(By.cssSelector(".btn-primary")).click();
    }

    @Then("O login é validado e o acesso é liberado")
    public void o_login_e_validado_e_o_acesso_e_liberado()  {
        abrirHpets.fecharNavegador();
    }
}




