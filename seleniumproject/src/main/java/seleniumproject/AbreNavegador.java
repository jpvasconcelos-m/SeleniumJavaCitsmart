package seleniumproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AbreNavegador {
    public static void main() throws InterruptedException {
        System.setProperty("selenium.server.httpClientFactory", "apache");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.cesu.pe.gov.br/");




        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        //By.xpath("//input[@id='senha']")
        Thread.sleep(5000);
}}
