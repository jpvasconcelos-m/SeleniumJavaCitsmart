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

public class AutoCitsmart {
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

    int padrao = 0;

    	ServicoInterface.main(args);
    	while((ServicoInterface.servicoSelecionado)== null) {
    	System.out.println(ServicoInterface.servicoSelecionado);
    	Thread.sleep(2000);


        }
        InterfaceTexto.main(args, "Descricão do problema:");

        while (InterfaceTexto.info == null) {
            Thread.sleep(2000);
            System.out.println(InterfaceTexto.info);
        }
        String TextoDescricao = InterfaceTexto.info;
        if (ServicoInterface.servicoSelecionado.contains("SES (HGV) > Arquivo/Pasta > Acesso") || ServicoInterface.servicoSelecionado.contains("Usuário de Rede/Internet > Criação")){
            padrao = 1;
        } else if (ServicoInterface.servicoSelecionado.contains("SES (HGV) > Arquivo/Pasta > Backup e Recuperação")
                || ServicoInterface.servicoSelecionado.contains("Arquivo/Pasta > Mapeamento")
                || ServicoInterface.servicoSelecionado.contains("Estação de trabalho > Configuração")
                || ServicoInterface.servicoSelecionado.contains("Estação de trabalho > Instalação")
                || ServicoInterface.servicoSelecionado.contains("Projetor e Perifericos > Configuração")
                || ServicoInterface.servicoSelecionado.contains("Projetor e Perifericos > Remanejamento")
                || ServicoInterface.servicoSelecionado.contains("Sistemas Operacional > Atualização")
                || ServicoInterface.servicoSelecionado.contains("Sistemas Operacional > Ativação de Licença")
                || ServicoInterface.servicoSelecionado.contains("Softwares e Aplicativos > Ativação de Licença")
                || ServicoInterface.servicoSelecionado.contains("Softwares e Aplicativos > Configuração")
                || ServicoInterface.servicoSelecionado.contains("Softwares e Aplicativos > Instalação/Desinstalação/Atualização")
                || ServicoInterface.servicoSelecionado.contains("Usuário de Rede/Internet > Bloqueio/Desbloqueio")
                || ServicoInterface.servicoSelecionado.contains("Usuário de Rede/Internet > Configuração")
                || ServicoInterface.servicoSelecionado.contains("Usuário de Rede/Internet > Liberação de Acesso Proxy")
                || ServicoInterface.servicoSelecionado.contains("Usuário de Rede/Internet > Liberação de Acesso Wi-Fi")
                || ServicoInterface.servicoSelecionado.contains("Usuário de Rede/Internet > Senha")) {
            padrao=2;
        } else if (ServicoInterface.servicoSelecionado.contains("Ativos de Rede > Configuração Física")
                || ServicoInterface.servicoSelecionado.contains("Dúvidas do Sistema, Regmed")
                || ServicoInterface.servicoSelecionado.contains("Estação de Trabalho > Empréstimo de Equipamento (DPZ)")
                || ServicoInterface.servicoSelecionado.contains("Sistemas Operacional > Configuração")
                || ServicoInterface.servicoSelecionado.contains("Estação de Trabalho > Intervenção Técnica")
                || ServicoInterface.servicoSelecionado.contains("Estação de Trabalho > Intervenção Técnica ( Troca de peça)")
                || ServicoInterface.servicoSelecionado.contains("Estação de Trabalho > Manutenção preventiva")
                || ServicoInterface.servicoSelecionado.contains("Estação de Trabalho > Remanejamento")
                || ServicoInterface.servicoSelecionado.contains("Estação de Trabalho > Substituição")
                || ServicoInterface.servicoSelecionado.contains("FormaSUS/RHOSE/SISGRADE/SISCAD/SISCADADISP/SISCON > Bug/Erro/Falha")
                || ServicoInterface.servicoSelecionado.contains("FormaSUS/RHOSE/SISGRADE/SISCAD/SISCADADISP/SISCON > Dúvidas e Orientações")
                || ServicoInterface.servicoSelecionado.contains("Impressora e Digitalização > Intervenção Técnica")
                || ServicoInterface.servicoSelecionado.contains("Impressora e Digitalização > Intervenção técnica(troca de peça)")
                || ServicoInterface.servicoSelecionado.contains("Impressora e Digitalização > Manutenção Preventiva")
                || ServicoInterface.servicoSelecionado.contains("Impressora e Digitalização > Substituição")
                || ServicoInterface.servicoSelecionado.contains("Indefinido >")
                || ServicoInterface.servicoSelecionado.contains("Internet/Rede > Ativação")
                || ServicoInterface.servicoSelecionado.contains("Internet/Rede > Instalação de Ponto de Rede")
                || ServicoInterface.servicoSelecionado.contains("Mãe Coruja > Dúvidas e Orientações")
                || ServicoInterface.servicoSelecionado.contains("Outros Sistemas > Dúvidas e Orientações")
                || ServicoInterface.servicoSelecionado.contains("Papel de Parede > Alteração")
                || ServicoInterface.servicoSelecionado.contains("Projetor e Perifericos > Instalação")
                || ServicoInterface.servicoSelecionado.contains("Projetor e Perifericos > Substituição")
                || ServicoInterface.servicoSelecionado.contains("SAPE >")
                || ServicoInterface.servicoSelecionado.contains("SEI/SIGEPE >")
                || ServicoInterface.servicoSelecionado.contains("SICREF/SISCONF/SCON >")
                || ServicoInterface.servicoSelecionado.contains("SIGAPE >")
                || ServicoInterface.servicoSelecionado.contains("SIM/SINAN/SINASC/CIEVS >")
                || ServicoInterface.servicoSelecionado.contains("Sistemas - Gerenciador de impressão >")
                || ServicoInterface.servicoSelecionado.contains("Sistemas Ministério da Saúde >")
                || ServicoInterface.servicoSelecionado.contains("Sistemas Operacional > Instalação")
                || ServicoInterface.servicoSelecionado.contains("Sistemas Operacional > Manutenção Preventiva")
                || ServicoInterface.servicoSelecionado.contains("Sistemas de BI >")
                || ServicoInterface.servicoSelecionado.contains("Telefonia >")
                || ServicoInterface.servicoSelecionado.contains("Usuário de E-mail >")
                || ServicoInterface.servicoSelecionado.contains("Vistoria/Diagnóstico >")) {
            padrao = 3;
        } else if (ServicoInterface.servicoSelecionado.contains("CITSmart ITSM > Cadastro de Usuário")) {
            padrao = 4;

        } else if (ServicoInterface.servicoSelecionado.contains("Impressora e Digitalização > Aquisição de Suprimentos")
                || ServicoInterface.servicoSelecionado.contains("Impressora e Digitalização > Configuração")
                || ServicoInterface.servicoSelecionado.contains("Impressora e Digitalização > Instalação")
                || ServicoInterface.servicoSelecionado.contains("Impressora e Digitalização > Remanejamento")
                || ServicoInterface.servicoSelecionado.contains("Impressora e Digitalização > Reposição")) {
            padrao = 5;
        } else if (ServicoInterface.servicoSelecionado.contains("Sistema MV/SoulMV >")) {
            padrao = 6;

        }
        System.out.println(padrao);

   
    	Scanner entrada = new Scanner(System.in);
        System.setProperty("selenium.server.httpClientFactory", "apache");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.cesu.pe.gov.br/");
        
        
        
        
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


        //Aqui é o objetivo.
        //Para padrão 1 temos:
        // Etiqueta= Cesu campoDyn_3526
        //UnidadeDropdown= campoDyn_3527
        //Setor= campoDyn_3528 receber do sendkeys a partir do gui.
        //Contato= campoDyn_3529 3184-5772

        /*
EtiquetaPadrão 2: campoDyn_3520
Etiqueta= Cesu campoDyn_3520
UnidadeDropdown= campoDyn_3521
Setor= campoDyn_3522
Contato= campoDyn_3523
Funcionando(s/n)= campoDyn_3524
         */

        String Etiqueta = null;

        if(padrao == 1) {
            System.out.println("Etiqueta: ");
            while(Etiqueta == null) {
                Etiqueta = entrada.nextLine();
                WebElement CampoEtiquetaCesu = driver.findElement(By.id("campoDyn_3526"));
                CampoEtiquetaCesu.click();
                CampoEtiquetaCesu.sendKeys(Etiqueta);


                WebElement CampoSetor = wait.until(ExpectedConditions.elementToBeClickable(By.id("campoDyn_3528")));
                CampoSetor.click();
                String Setor = SetorInterface.setorSelecionado;
                CampoSetor.sendKeys(Setor);

                WebElement CampoRamal = wait.until(ExpectedConditions.elementToBeClickable(By.id("campoDyn_3529")));
                CampoRamal.click();
                String Ramal = "845842";
                CampoRamal.sendKeys(Ramal);
                WebElement UnidadeDropdown = driver.findElement(By.id("campoDyn_3527"));
                WebElement ExpandirUnidade =  driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/div[1]/table[1]/tbody[1]/tr[3]/td[2]/div[1]/select[1]"));
                ExpandirUnidade.click();
                Select select = new Select(UnidadeDropdown);
                select.selectByValue("880");
                //WebElement Funcionando = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@id='campoDyn_3702'])[1]")));
                //Funcionando.click();
                Thread.sleep(2000);
            }
        }
        if(padrao == 2){
            while(Etiqueta == null) {
                Etiqueta = entrada.nextLine();
                WebElement CampoEtiquetaCesu = driver.findElement(By.id("campoDyn_3520"));
                CampoEtiquetaCesu.click();
                CampoEtiquetaCesu.sendKeys(Etiqueta);

                WebElement CampoSetor = wait.until(ExpectedConditions.elementToBeClickable(By.id("campoDyn_3522")));
                CampoSetor.click();
                String Setor = SetorInterface.setorSelecionado;
                CampoSetor.sendKeys(Setor);

                WebElement CampoRamal = wait.until(ExpectedConditions.elementToBeClickable(By.id("campoDyn_3523")));
                CampoRamal.click();
                String Ramal = "845842";
                CampoRamal.sendKeys(Ramal);
                WebElement UnidadeDropdown = driver.findElement(By.id("campoDyn_3521"));
                WebElement ExpandirUnidade =  driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/div[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/select[1]"));
                ExpandirUnidade.click();
                Select select = new Select(UnidadeDropdown);
                select.selectByValue("870");

                InterfaceSimNao.SimNao("Funcionando?");

                while (InterfaceSimNao.resposta.equals("")) {
                    System.out.println(InterfaceSimNao.resposta);
                }

                String resposta = InterfaceSimNao.resposta;
                WebElement Funcionando = driver.findElement(By.cssSelector("body > form:nth-child(5) > div:nth-child(16) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(2) > td:nth-child(1) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(5) > td:nth-child(2) > div:nth-child(1) > input:nth-child(1)"));
                WebElement NaoFuncionando = driver.findElement(By.cssSelector("body > form:nth-child(5) > div:nth-child(16) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(2) > td:nth-child(1) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(5) > td:nth-child(2) > div:nth-child(1) > input:nth-child(3)"));
                if (resposta.equals("Sim")) {
                    Funcionando.click();
                } else if (resposta.equals("Não")) {
                    NaoFuncionando.click();

                }

        }


        
        WebElement CampoUnidade = wait.until(ExpectedConditions.elementToBeClickable(By.id("campoDyn_3699")));
        CampoUnidade.click();
        String Unidade = null;
        while (Unidade == null){
            Unidade = entrada.nextLine();
            Thread.sleep(2500);
        }

        driver.switchTo().parentFrame();
        
        WebElement Gravar = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='btnGravar']")));
        //Gravar.click();
      
       
        	
        Thread.sleep(30000);
        driver.switchTo().defaultContent();
        entrada.close();
       

        driver.quit(); // Fechar o navegador.
    }
}}
