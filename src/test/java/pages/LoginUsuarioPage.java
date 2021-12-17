package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Browser;
import utils.DadosAcesso;

public class LoginUsuarioPage {
    DadosAcesso dados = new DadosAcesso();
    Browser browser = new Browser();
    WebDriver driver = browser.getDriver();


    public void dadosLogin (){
        Browser.getDriver().findElement(By.id("email")).sendKeys(dados.getEmail());
        Browser.getDriver().findElement(By.id("password")).sendKeys(dados.getSenha());
    }

    public void clicarBotaoLogin (){
        Browser.getDriver().findElement(By.cssSelector(".btn-primary")).click();
    }

    public void efetuarLogin(){
        Browser.getDriver().findElement(By.id("email")).sendKeys(dados.getEmail());
        Browser.getDriver().findElement(By.id("password")).sendKeys(dados.getSenha());
        Browser.getDriver().findElement(By.cssSelector(".btn-primary")).click();

    }
    public void efetuarLogout() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(Browser.getDriver(),25);
        Browser.getDriver().findElement(By.cssSelector(".hamburguer")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li/a[text()='Logout']")));
        browser.fecharNavegador();
    }
}

