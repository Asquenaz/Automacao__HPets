package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

    private static WebDriver driver;
    private static String baseUrl = "https://healthpets.app.br";


    public  static void  AbrirNavegador() {
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(baseUrl);
    }

    public static WebDriver getDriver(){
        return driver;
    }

    public static void fecharNavegador (){
        driver.quit();
    }
}
