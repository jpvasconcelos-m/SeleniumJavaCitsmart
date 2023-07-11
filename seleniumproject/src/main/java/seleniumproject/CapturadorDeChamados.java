package seleniumproject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
public class CapturadorDeChamados {

   private String url;
    private String nSolicitacao;

    CapturadorDeChamados(String url, String nSolicitacao){
        this.url = url;
        this.nSolicitacao= nSolicitacao;
    }

   void capturarChamado(){
       WebDriver driver = new ChromeDriver();
       WebDriverWait wait;
       driver = AutoCitsmart.getDriver();


   }
}
