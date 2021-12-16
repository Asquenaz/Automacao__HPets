package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Browser;
import utils.DadosAcesso;

public class LoginUsuarioPage {
    DadosAcesso dados = new DadosAcesso();
    Browser browser = new Browser();
    WebDriver driver = browser.getDriver();

    public void getEmail (){

       Browser.getDriver().findElement(By.id("email")).sendKeys(dados.getEmail());

    }
    public void getSenha (){
        Browser.getDriver().findElement(By.id("password")).sendKeys(dados.getSenha());
    }

    public void efetuarLogin (){
        Browser.getDriver().findElement(By.cssSelector(".btn-primary")).click();
    }

    public void efetuarLogout() {
        Browser.getDriver().findElement(By.cssSelector(".hamburguer")).click();
        Browser.getDriver().findElement(By.linkText("Logout")).click();
         //  driver.findElement(By.xpath("//li/a[text()='Logout']")).click();
        //  browser.fecharNavegador();
    }
}

