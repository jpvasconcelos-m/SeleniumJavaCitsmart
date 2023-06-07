package seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AutoCSNovo {
 public static void main(String[] args) throws InterruptedException {
  RepetirChamado Repetir = new RepetirChamado();
  String k = "";
  LoginGUI.main(args);
  WebDriver driver = new ChromeDriver();

  while (LoginGUI.username == null) {
   System.out.println(LoginGUI.username);
   Thread.sleep(3000);
  }

  do {
   k = "";
   SetorInterface.setorSelecionado = null;
   InterfaceTexto.info = null;
   ServicoInterface.servicoSelecionado = null;
   InterfaceSimNao.resposta = "";
   Repetir.resposta = "";

   SetorInterface.main(args);

   while (SetorInterface.setorSelecionado == null) {
    System.out.println(SetorInterface.setorSelecionado);
    Thread.sleep(2000);
   }

   InterfaceTexto.main(args, "Descricão do problema:");

   while (InterfaceTexto.info == null) {
    Thread.sleep(2000);
    System.out.println(InterfaceTexto.info);
   }

   String TextoDescricao = InterfaceTexto.info;
   InterfaceTexto.info = null;

   InterfaceTexto.main(args, "Causa:");

   while (InterfaceTexto.info == null) {
    Thread.sleep(2000);
    System.out.println(InterfaceTexto.info);
   }

   String TextoCausa = InterfaceTexto.info;
   InterfaceTexto.info = null;

   InterfaceTexto.main(args, "Solução:");

   while (InterfaceTexto.info == null) {
    Thread.sleep(2000);
    System.out.println(InterfaceTexto.info);
   }

   String TextoSolucao = InterfaceTexto.info;
   InterfaceTexto.info = null;

   ServicoInterface.main(args);

   while (ServicoInterface.servicoSelecionado == null) {
    System.out.println(ServicoInterface.servicoSelecionado);
    Thread.sleep(2000);
   }

   System.setProperty("selenium.server.httpClientFactory", "apache");
   driver.get("https://www.cesu.pe.gov.br/");

   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
   Thread.sleep(4000);
   WebElement usuario = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='user']")));
   usuario.sendKeys(LoginGUI.username);

   WebElement senha = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='senha']")));
   senha.sendKeys(LoginGUI.password);

   WebElement login = driver.findElement(By.xpath("//button[normalize-space()='Entrar']"));
   login.click();

   Thread.sleep(2000);

   WebElement pontinhos = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/nav/div/div[2]/ul/li[4]/a/i")));
   pontinhos.click();

   WebElement AcessarSistema = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"navbar\"]/ul/li[4]/ul/li[4]/a")));
   AcessarSistema.click();

   WebElement RegistroIncidentes = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div//div//div//li[4]//a[1]")));
   RegistroIncidentes.click();
   Thread.sleep(3000);

   WebElement CadRapido = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='cadastroRapido']")));
   CadRapido.click();
   Thread.sleep(1000);

   WebElement CampoSolicitante = wait.until(ExpectedConditions.elementToBeClickable(By.id("nomeSolicitanteCadastroRapido")));
   CampoSolicitante.click();
   CampoSolicitante.sendKeys(SetorInterface.setorSelecionado);
   Thread.sleep(2000);
   CampoSolicitante.sendKeys(Keys.DOWN);
   Thread.sleep(2000);
   CampoSolicitante.sendKeys(Keys.ENTER);
   Thread.sleep(2000);
   CampoSolicitante.click();

   WebElement CampoEmail = wait.until(ExpectedConditions.elementToBeClickable(By.id("emailContatoCadastroRapido")));
   CampoEmail.click();
   String Email = "setores_hgv@pronte-pe.com.br";
   CampoEmail.clear();
   CampoEmail.sendKeys(Email);
   Thread.sleep(1000);

   WebElement ServicoBusca = wait.until(ExpectedConditions.elementToBeClickable(By.id("servicoBuscaCadastroRapido")));
   String Servico = ServicoInterface.servicoSelecionado;
   ServicoBusca.click();
   ServicoBusca.sendKeys(Servico);
   Thread.sleep(1500);
   ServicoBusca.sendKeys(Keys.DOWN);
   Thread.sleep(1500);
   ServicoBusca.sendKeys(Keys.ENTER);
   Thread.sleep(1500);
   ServicoBusca.click();

   WebElement dropdown1 = driver.findElement(By.id("idUnidadeCadastroRapido"));
   WebElement dropdown2 = driver.findElement(By.id("idStatusCadastroRapido"));
   Select select1 = new Select(dropdown1);

   WebElement Expandir = driver.findElement(By.xpath("//div[@data-collapse-closed='true']//div//span"));
   Expandir.click();

   Select select2 = new Select(dropdown2);
   select1.selectByValue("6660");
   select2.selectByValue("4");

   WebElement CampoDescricao = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@id='descricaoCadastroRapido']")));
   WebElement Causa = wait.until(ExpectedConditions.elementToBeClickable(By.id("detalhamentoCausaCadastroRapido")));
   WebElement Solucao = wait.until(ExpectedConditions.elementToBeClickable(By.id("respostaCadastroRapido")));

   CampoDescricao.click();
   CampoDescricao.sendKeys(TextoDescricao);

   Causa.sendKeys(TextoCausa);
   Solucao.sendKeys(TextoSolucao);
//a
   WebElement Gravar = driver.findElement(By.xpath("//a[@onclick='gravarCadastroRapido();']"));

   Thread.sleep(3000);
   InterfaceSimNao.main(args);

   while (InterfaceSimNao.resposta.equals("")) {
    System.out.println(InterfaceSimNao.resposta);
   }

   String resposta = InterfaceSimNao.resposta;

   if (resposta.equals("Sim")) {
    Gravar.click();
   } else if (resposta.equals("Não")) {
    driver.quit();
   }


   Repetir.main(args);

   while (Repetir.resposta.equals("")) {
    Thread.sleep(5000);
   }

   k = Repetir.resposta;
  }
  while (k.equals("Sim"));

  Thread.sleep(7000);
 }
}
