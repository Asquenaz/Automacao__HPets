package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Browser;
import utils.DadosAcesso;

public class CadastroUsuarioValidoPage {
    DadosAcesso dadosAcesso = new DadosAcesso();


    Browser abrirHpets = new Browser();
    private WebDriver driver;

    public void acessarTelaCadastro() {
        driver = abrirHpets.getDriver();
        driver.findElement(By.id("cad-tab")).click();
    }

    public void inserirDadosValidos() {
        driver.findElement(By.id("name")).sendKeys(dadosAcesso.getNomeValido());
        driver.findElement(By.id("email")).sendKeys(dadosAcesso.emailFormatado());
        driver.findElement(By.id("password")).sendKeys(dadosAcesso.getSenhaValido());
        driver.findElement(By.id("password-confirm")).sendKeys(dadosAcesso.getConfirmacaoSenhaValida());
        driver.findElement(By.cssSelector(".btn")).click();
    }

    public void cadastroRealizado() throws InterruptedException {
        LoginUsuarioPage logout = new LoginUsuarioPage();
        logout.efetuarLogout();
    }
}
