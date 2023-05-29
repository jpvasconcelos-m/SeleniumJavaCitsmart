package seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CapturarChamados {

    static WebDriver driver2 = new ChromeDriver();
    static WebDriverWait wait2 = new WebDriverWait(driver2, Duration.ofSeconds(30));
   public static void Capturar(String nSolicitacao, String Site) throws InterruptedException {
       System.setProperty("selenium.server.httpClientFactory", "apache");
       driver2.get(Site);
       WebElement campoCaptura = wait2.until(ExpectedConditions.elementToBeClickable(By.id("chamados")));
       campoCaptura.sendKeys(nSolicitacao);
       WebElement btnCaptura = wait2.until(ExpectedConditions.elementToBeClickable(By.id("btnGravar")));
       Thread.sleep(2000);
       btnCaptura.click();
       Thread.sleep(2000);
       driver2.quit();
   }


}
