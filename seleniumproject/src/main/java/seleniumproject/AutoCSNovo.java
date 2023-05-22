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

public class AutoCSNovo {
    public static void main(String[] args) throws InterruptedException {
    	
    	String user = JOptionPane.showInputDialog("Digite o usuario:");
        JPasswordField pwd = new JPasswordField(20);
        int action = JOptionPane.showConfirmDialog(null, pwd, "Digite uma senha", JOptionPane.OK_CANCEL_OPTION);
        if (action < 0) JOptionPane.showMessageDialog(null, "Cancel, X or escape key selected");
        String password = new String(pwd.getPassword());
    	while(user == null) {
    		System.out.println(user);
    	}
    	
    	
    	
    	SetorInterface.main(args);
    	while((SetorInterface.setorSelecionado)== null) {
    	System.out.println(SetorInterface.setorSelecionado);
    	Thread.sleep(2000);
    	}

        InterfaceTexto.main(args, "Descricão do problema:");
    	while((InterfaceTexto.info)== null) {
        	Thread.sleep(2000);
        	System.out.println(InterfaceTexto.info);
        	}
        String TextoDescricao = InterfaceTexto.info;
        InterfaceTexto.info = null;


        InterfaceTexto.main(args, "Causa:");
        while((InterfaceTexto.info)== null) {
            Thread.sleep(2000);
            System.out.println(InterfaceTexto.info);
        }
        String TextoCausa = InterfaceTexto.info;
        InterfaceTexto.info = null;
        InterfaceTexto.main(args, "Solução:");
        while((InterfaceTexto.info)== null) {
            Thread.sleep(2000);
            System.out.println(InterfaceTexto.info);
        }
        String TextoSolucao = InterfaceTexto.info;
        InterfaceTexto.info = null;

    	ServicoInterface.main(args);
    	while((ServicoInterface.servicoSelecionado)== null) {
    	System.out.println(ServicoInterface.servicoSelecionado);
    	Thread.sleep(2000);
    	}

   
    	Scanner entrada = new Scanner(System.in);
        System.setProperty("selenium.server.httpClientFactory", "apache");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.cesu.pe.gov.br/");
        
        
        
        //1
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
        //By.xpath("//input[@id='senha']")
        Thread.sleep(4000);
        WebElement usuario = wait.until(ExpectedConditions.elementToBeClickable((By.xpath("//input[@id='user']"))));

        usuario.sendKeys(user);

        WebElement senha = wait.until(ExpectedConditions.elementToBeClickable((By.xpath("//input[@id='senha']"))));

        senha.sendKeys(password); 

        WebElement login = driver.findElement(By.xpath("//button[normalize-space()='Entrar']"));
        login.click();
        
        //1

        
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
        
       

      //Store the web element
       // WebElement iframe = driver.findElement(By.xpath("//iframe[@id='frameNovaSolicitacao']"));

        //Switch to the frame
       // driver.switchTo().frame(iframe);
       // String Contrato = "ses";
        //WebElement ContratoDrop =  wait.until(ExpectedConditions.elementToBeClickable(By.id("idContrato")));
        Thread.sleep(1000);
        //ContratoDrop.click();
        //ContratoDrop.sendKeys(Contrato);
      // WebElement Tab2 = driver.findElement(By.id("tab2"));
       // Tab2.click();
        Thread.sleep(1500);
        WebElement CampoSolicitante = wait.until(ExpectedConditions.elementToBeClickable(By.id("nomeSolicitanteCadastroRapido")));
        CampoSolicitante.click();
        CampoSolicitante.sendKeys(SetorInterface.setorSelecionado);
        Thread.sleep(2000);
        CampoSolicitante.sendKeys(Keys.DOWN);
        Thread.sleep(2000);
        CampoSolicitante.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        CampoSolicitante.click();
        Thread.sleep(1000);
        WebElement CampoEmail = wait.until(ExpectedConditions.elementToBeClickable(By.id("emailContatoCadastroRapido")));
        CampoEmail.click();
        String Email = "setores_hgv@pronte-pe.com.br";
        CampoEmail.clear();
        CampoEmail.sendKeys(Email);
        //WebElement Tab3 = driver.findElement(By.id("tab3"));
        //Tab3.click();
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
        // Selecionando por índice
        select1.selectByValue("6660");
        select2.selectByValue("4");
        WebElement CampoDescricao = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@id='descricaoCadastroRapido']")));
        WebElement Causa = wait.until(ExpectedConditions.elementToBeClickable(By.id("detalhamentoCausaCadastroRapido")));
        WebElement Solucao = wait.until(ExpectedConditions.elementToBeClickable(By.id("respostaCadastroRapido")));

        CampoDescricao.click();
        CampoDescricao.sendKeys(TextoDescricao);

        Causa.sendKeys(TextoCausa);
        Solucao.sendKeys(TextoSolucao);
        ////iframe[@id='fraInformacoesComplementares']
        /*
        WebElement iframe2 = driver.findElement(By.xpath("//iframe[@id='fraInformacoesComplementares']"));
        driver.switchTo().frame(iframe2);
        WebElement CampoEtiquetaCesu = driver.findElement(By.id("campoDyn_3697"));
        CampoEtiquetaCesu.click();
        /*
        String Etiqueta = "1021546";
        CampoEtiquetaCesu.sendKeys(Etiqueta);
        /*
        WebElement CampoUnidade = wait.until(ExpectedConditions.elementToBeClickable(By.id("campoDyn_3699")));
        CampoUnidade.click();
        String Unidade = "HGV";
        CampoUnidade.sendKeys(Unidade);
        /*
        WebElement CampoSetor = wait.until(ExpectedConditions.elementToBeClickable(By.id("campoDyn_3700")));
        CampoSetor.click();
        String Setor = "Informática";
        CampoSetor.sendKeys(Setor);
        /*
        WebElement CampoRamal = wait.until(ExpectedConditions.elementToBeClickable(By.id("campoDyn_3701")));
        CampoRamal.click();
        String Ramal = "845842";
        CampoRamal.sendKeys(Ramal);
        
       /* WebElement Funcionando = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@id='campoDyn_3702'])[1]")));
        Funcionando.click();*/

        WebElement Gravar = driver.findElement(By.xpath("//a[@onclick='gravarCadastroRapido();']"));
        
       Thread.sleep(3000);
        InterfaceSimNao.main(args);
        
        while(InterfaceSimNao.resposta.equals("")) {
        System.out.println(InterfaceSimNao.resposta);
        }
        String resposta = InterfaceSimNao.resposta;
        if(resposta.equals("Sim")) {
        	Gravar.click();
        }

        Thread.sleep(30000);
        driver.switchTo().defaultContent();
        entrada.close();
       

        driver.quit(); // Fechar o navegador.
    }
}
