package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Browser;
import utils.DadosAcesso;

public class CadastroUsuarioInvalidoPages {
    private WebDriver driver;

    Browser abrirHpets = new Browser();
    DadosAcesso dados = new DadosAcesso();


    public void telaCadastro() {
        driver = abrirHpets.getDriver();
        driver.findElement(By.id("cad-tab")).click();

    }

    public void inserirDadosCadastro() {
        driver.findElement(By.id("name")).sendKeys(dados.getNomeCadastro());
        driver.findElement(By.id("email")).sendKeys(emailFormatado());
        driver.findElement(By.id("password")).sendKeys(dados.getSenhaCadastro());
        driver.findElement(By.id("password-confirm")).sendKeys(dados.getConfirmacaoSenha());

    }
    public void tentativaCadastro() throws InterruptedException {
        driver.findElement(By.cssSelector(".btn")).click();
    }

    public String emailFormatado() {
        return dados.emailFormatado();
    }
}
