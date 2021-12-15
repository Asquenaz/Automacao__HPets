package steps;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CadastroAnimalPage;
import pages.LoginUsuarioPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.ChomeHPets;

public class CadastroAnimalSteps {
    LoginUsuarioPage loginPage = new LoginUsuarioPage();
    CadastroAnimalPage cadAnimal = new CadastroAnimalPage();
    ChomeHPets abrirHpets = new ChomeHPets();

    private WebDriver driver;

    @Before
    public void before(){

        driver = abrirHpets.AbrirNavegador();

        driver.findElement(By.id("email")).sendKeys(loginPage.getUsuario());
        driver.findElement(By.id("password")).sendKeys(loginPage.getSenha());
    }

    @Given("Que esteja na tela de cadastro de animais")
    public void queEstejaNaTelaDeCadastroDeAnimais() {
        driver.findElement(By.cssSelector(".btn-primary")).click();
        driver.findElement(By.cssSelector(".fa-paw")).click();
        driver.findElement(By.id("add")).click();
    }

    @When("preenchendo_com_dados_corretos")
    public void preenchendoComDadosCorretos() {
        Actions builder = new Actions(driver);
        WebElement element  = driver.findElement(By.id("add"));
        WebElement dropdown = driver.findElement(By.id("especie"));

        builder.moveToElement(element, 0, 0).perform();

        driver.findElement(By.id("nome")).sendKeys(cadAnimal.getNome());
        driver.findElement(By.id("cor")).sendKeys( cadAnimal.getCor());
        driver.findElement(By.id("data_nascimento")).sendKeys(cadAnimal.getData_nasc());

        dropdown.findElement(By.xpath("//option[. = 'Cachorro']")).click();
        dropdown.findElement(By.xpath("//option[. = 'Grande']")).click();
    }

    @Then("o cadastro do animal e realizado")
    public void oCadastroDoAnimalERealizado() {
       driver.findElement(By.xpath("//button[@type='submit']")).click();
       abrirHpets.fecharNavegador();
    }
}
