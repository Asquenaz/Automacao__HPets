package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.DadosAcesso;

public class CadastroAnimalPage {
    LoginUsuarioPage login = new LoginUsuarioPage();
    DadosAcesso dados = new DadosAcesso();

    private WebDriver driver;

    public void acessarTelaCadastro() {
        login.getEmail();
        login.getSenha();

        driver.findElement(By.cssSelector(".btn-primary")).click();
        driver.findElement(By.cssSelector(".fa-paw")).click();
        driver.findElement(By.id("add")).click();
    }
    public void preencherDados() {
        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.id("add"));
        WebElement dropdown = driver.findElement(By.id("especie"));

        builder.moveToElement(element, 0, 0).perform();

        driver.findElement(By.id("nome")).sendKeys(dados.getNome());
        driver.findElement(By.id("cor")).sendKeys(dados.getCor());
        driver.findElement(By.id("data_nascimento")).sendKeys(dados.getData_nasc());

        dropdown.findElement(By.xpath("//option[. = 'Cachorro']")).click();
        dropdown.findElement(By.xpath("//option[. = 'Grande']")).click();
    }

    public void realizarCadastro() {
        driver.findElement(By.xpath("//button[@type='submit']")).click();

    }
}

