package seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FecharChamados {
    static WebDriver driver3 = new ChromeDriver();
    static WebDriverWait wait3 = new WebDriverWait(driver3, Duration.ofSeconds(30));

    public static void Fechar(String nSolicitacao, String Site) throws InterruptedException {
        CausaSolucaoInterface.causaSelecionada = "null";
        System.setProperty("selenium.server.httpClientFactory", "apache");
        driver3.get(Site);
        WebElement campoCaptura = wait3.until(ExpectedConditions.elementToBeClickable(By.id("chamados")));
        campoCaptura.sendKeys(nSolicitacao);
        WebElement dropdown1 = driver3.findElement(By.id("idCausaIncidente"));
        WebElement dropdown2 = driver3.findElement(By.id("idCategoriaSolucao"));
        Select select1 = new Select(dropdown1);
        Select select2 = new Select(dropdown2);

        WebElement btnFechar = wait3.until(ExpectedConditions.elementToBeClickable(By.id("btnGravar")));
        CausaSolucaoInterface.main(new String [0]);
        while (CausaSolucaoInterface.causaSelecionada == null) {
            System.out.println(CausaSolucaoInterface.causaSelecionada);
            Thread.sleep(2000);
        }
        select1.selectByVisibleText(CausaSolucaoInterface.causaSelecionada);
        select2.selectByVisibleText(CausaSolucaoInterface.causaSelecionada);


    WebElement Causa = wait3.until(ExpectedConditions.elementToBeClickable(By.id("detalhamentoCausa")));
    WebElement Solucao = wait3.until(ExpectedConditions.elementToBeClickable(By.id("resposta")));


      Causa.sendKeys(AutoCSNovo.TextoCausa);
      Solucao.sendKeys(AutoCSNovo.TextoSolucao);
      Thread.sleep(10000);
        btnFechar.click();

    }
}
