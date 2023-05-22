package seleniumproject;

import java.time.Duration;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.interactions.Actions;
import javax.swing.JTextArea;

public class AutoCitsmart {
    public static void main(String[] args) throws InterruptedException {
    	SetorInterface.main(args);
    	while((SetorInterface.setorSelecionado)== null) {
    	System.out.println(SetorInterface.setorSelecionado);
    	Thread.sleep(2000);
    	}
    	InterfaceTexto.titulo = "Descricão do problema:";
    	InterfaceTexto.main(args);
    	while((InterfaceTexto.info)== null) {
        	Thread.sleep(2000);
        	System.out.println(InterfaceTexto.info);
        	}
    	ServicoInterface.main(args);
    	while((ServicoInterface.servicoSelecionado)== null) {
    	System.out.println(ServicoInterface.servicoSelecionado);
    	Thread.sleep(2000);
    	}
    	
   
    	Scanner entrada = new Scanner(System.in);
        System.setProperty("selenium.server.httpClientFactory", "apache");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.cesu.pe.gov.br/");
        /*
        String user = JOptionPane.showInputDialog("Digite o usuario:");
        JPasswordField pwd = new JPasswordField(20);
        int action = JOptionPane.showConfirmDialog(null, pwd, "Digite uma senha", JOptionPane.OK_CANCEL_OPTION);
        if (action < 0) JOptionPane.showMessageDialog(null, "Cancel, X or escape key selected");
        String password = new String(pwd.getPassword());
        */
        String user = "";
        String password = "";
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
        //By.xpath("//input[@id='senha']")
        Thread.sleep(6000);
        WebElement usuario = wait.until(ExpectedConditions.elementToBeClickable((By.xpath("//input[@id='user']"))));

        usuario.sendKeys(user);

        WebElement senha = wait.until(ExpectedConditions.elementToBeClickable((By.xpath("//input[@id='senha']"))));

        senha.sendKeys(password); 

        WebElement login = driver.findElement(By.xpath("//button[normalize-space()='Entrar']"));
        login.click();
        
        

        
        Thread.sleep(2000);
   
        WebElement pontinhos = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/nav/div/div[2]/ul/li[4]/a/i")));
        pontinhos.click();

        WebElement AcessarSistema = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"navbar\"]/ul/li[4]/ul/li[4]/a")));
        AcessarSistema.click();

        WebElement RegistroIncidentes = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[4]/div/div/div/div[2]/div/div[2]/div/div[1]/div/div[2]/adf-widget-content/div/ul/li[3]/a")));
        RegistroIncidentes.click();

        WebElement NovaSolicitacao = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"titulo\"]/div[1]/div[1]/span")));
        NovaSolicitacao.click();
        
       

      //Store the web element
        WebElement iframe = driver.findElement(By.xpath("//iframe[@id='frameNovaSolicitacao']"));

        //Switch to the frame
        driver.switchTo().frame(iframe);
        String Contrato = "ses";
        WebElement ContratoDrop =  wait.until(ExpectedConditions.elementToBeClickable(By.id("idContrato")));
        Thread.sleep(3000);
        ContratoDrop.click();
        ContratoDrop.sendKeys(Contrato);
       WebElement Tab2 = driver.findElement(By.id("tab2"));
        Tab2.click();
        Thread.sleep(3000);
        WebElement CampoSolicitante = wait.until(ExpectedConditions.elementToBeClickable(By.id("solicitante")));
        CampoSolicitante.click();
        CampoSolicitante.sendKeys(SetorInterface.setorSelecionado);
        Thread.sleep(3000);
        CampoSolicitante.sendKeys(Keys.DOWN);
        Thread.sleep(3000);
        CampoSolicitante.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        CampoSolicitante.click();
        Thread.sleep(2000);
        WebElement CampoEmail = wait.until(ExpectedConditions.elementToBeClickable(By.id("emailcontato")));
        CampoEmail.click();
        String Email = "setores_hgv@pronte-pe.com.br";
        CampoEmail.clear();
        CampoEmail.sendKeys(Email);
        WebElement Tab3 = driver.findElement(By.id("tab3"));
        Tab3.click();
        Thread.sleep(2000);
        WebElement ServicoBusca = wait.until(ExpectedConditions.elementToBeClickable(By.id("servicoBusca")));
        String Servico = ServicoInterface.servicoSelecionado;
        ServicoBusca.click();
        ServicoBusca.sendKeys(Servico);
        Thread.sleep(3000);
        ServicoBusca.sendKeys(Keys.DOWN);
        Thread.sleep(3000);
        ServicoBusca.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        ServicoBusca.click();
        WebElement CampoDescricao = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='fieldDescricao']//div[@class='controls']//div[@class='controls']//iframe[@class='wysihtml5-sandbox']")));       
        CampoDescricao.click();
        CampoDescricao.sendKeys("Problema " + InterfaceTexto.info);
        ////iframe[@id='fraInformacoesComplementares']
        WebElement iframe2 = driver.findElement(By.xpath("//iframe[@id='fraInformacoesComplementares']"));
        driver.switchTo().frame(iframe2);
        WebElement CampoEtiquetaCesu = driver.findElement(By.id("campoDyn_3697"));
        CampoEtiquetaCesu.click();
        String Etiqueta = "1021546";
        CampoEtiquetaCesu.sendKeys(Etiqueta);
        
        WebElement CampoUnidade = wait.until(ExpectedConditions.elementToBeClickable(By.id("campoDyn_3699")));
        CampoUnidade.click();
        String Unidade = "HGV";
        CampoUnidade.sendKeys(Unidade);
        
        WebElement CampoSetor = wait.until(ExpectedConditions.elementToBeClickable(By.id("campoDyn_3700")));
        CampoSetor.click();
        String Setor = "Informática";
        CampoSetor.sendKeys(Setor);
        
        WebElement CampoRamal = wait.until(ExpectedConditions.elementToBeClickable(By.id("campoDyn_3701")));
        CampoRamal.click();
        String Ramal = "845842";
        CampoRamal.sendKeys(Ramal);
        
        WebElement Funcionando = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@id='campoDyn_3702'])[1]")));
        Funcionando.click();
        driver.switchTo().parentFrame();
        
        WebElement Gravar = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='btnGravar']")));
        //Gravar.click();
        Thread.sleep(30000);
        driver.switchTo().defaultContent();
        entrada.close();
       

        driver.quit(); // Fechar o navegador.
    }
}
