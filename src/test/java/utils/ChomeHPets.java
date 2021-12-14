package utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChomeHPets {
    private WebDriver driver;

    public WebDriver AbrirNavegador() {
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://healthpets.app.br");

        return driver;
    }
    public WebDriver fecharNavegador (){
        driver.quit();

        return driver;
    }
}
