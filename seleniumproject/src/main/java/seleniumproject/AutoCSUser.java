package seleniumproject;

import java.time.Duration;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

import javafx.application.Application;
import javafx.stage.Stage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AutoCSUser   {
   WebDriver driver = new ChromeDriver();

    public static void main(String[] args) throws InterruptedException {



        String password = null;

        String username = JOptionPane.showInputDialog("Digite o usuário:");
        if (username == null) {
            JOptionPane.showMessageDialog(null, "Operação cancelada");
            return;
        } else {
            JPasswordField pwd = new JPasswordField(20);
            int action = JOptionPane.showConfirmDialog(null, pwd, "Digite uma senha", JOptionPane.OK_CANCEL_OPTION);

            if (action == JOptionPane.OK_OPTION) {
                password = new String(pwd.getPassword());

                while (username == null) {
                    System.out.println(username);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Operação cancelada");
                return;
            }
        }




        SetorInterface.main(args);
        while ((SetorInterface.setorSelecionado) == null) {
            System.out.println(SetorInterface.setorSelecionado);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            };
        }

        int padrao = 0;

        ServicoInterface.main(args);
        while ((ServicoInterface.servicoSelecionado) == null) {
            System.out.println(ServicoInterface.servicoSelecionado);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


        }
        InterfaceTexto.main(args, "Descricão do problema:");

        while (InterfaceTexto.info == null) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(InterfaceTexto.info);
        }
        String TextoDescricao = InterfaceTexto.info;

        if (ServicoInterface.servicoSelecionado.contains("SES (HGV) > Arquivo/Pasta > Acesso") || ServicoInterface.servicoSelecionado.contains("Usuário de Rede/Internet > Criação")) {
            padrao = 1;
        } else if (ServicoInterface.servicoSelecionado.contains("SES (HGV) > Arquivo/Pasta > Backup e Recuperação")
                || ServicoInterface.servicoSelecionado.contains("SES (HGV) > Arquivo/Pasta > Mapeamento")
                || ServicoInterface.servicoSelecionado.contains("SES (HGV) > Estação de Trabalho > Configuração")
                || ServicoInterface.servicoSelecionado.contains("SES (HGV) > Estação de trabalho > Instalação")
                || ServicoInterface.servicoSelecionado.contains("SES (HGV) > Projetor e Perifericos > Configuração")
                || ServicoInterface.servicoSelecionado.contains("SES (HGV) > Projetor e Perifericos > Remanejamento")
                || ServicoInterface.servicoSelecionado.contains("SES (HGV) > Sistemas Operacional > Atualização")
                || ServicoInterface.servicoSelecionado.contains("SES (HGV) > Sistemas Operacional > Ativação de Licença")
                || ServicoInterface.servicoSelecionado.contains("SES (HGV) > Softwares e Aplicativos > Ativação de Licença")
                || ServicoInterface.servicoSelecionado.contains("SES (HGV) > Softwares e Aplicativos > Configuração")
                || ServicoInterface.servicoSelecionado.contains("SES (HGV) > Softwares e Aplicativos > Instalação/Desinstalação/Atualização")
                || ServicoInterface.servicoSelecionado.contains("SES (HGV) > Usuário de Rede/Internet > Bloqueio/Desbloqueio")
                || ServicoInterface.servicoSelecionado.contains("SES (HGV) > Usuário de Rede/Internet > Configuração")
                || ServicoInterface.servicoSelecionado.contains("SES (HGV) > Usuário de Rede/Internet > Liberação de Acesso Proxy")
                || ServicoInterface.servicoSelecionado.contains("SES (HGV) > Usuário de Rede/Internet > Liberação de Acesso Wi-Fi")
                || ServicoInterface.servicoSelecionado.contains("SES (HGV) > Usuário de Rede/Internet > Senha")) {
            padrao = 2;
        } else if (ServicoInterface.servicoSelecionado.contains("SES (HGV) > Ativos de Rede > Configuração Física")
                || ServicoInterface.servicoSelecionado.contains("SES (HGV) > Dúvidas do Sistema, Regmed")
                || ServicoInterface.servicoSelecionado.contains("SES (HGV) > Estação de Trabalho > Empréstimo de Equipamento (DPZ)")
                || ServicoInterface.servicoSelecionado.contains("SES (HGV) > Sistemas Operacional > Configuração")
                || ServicoInterface.servicoSelecionado.contains("SES (HGV) > Estação de Trabalho > Intervenção Técnica")
                || ServicoInterface.servicoSelecionado.contains("SES (HGV) > Estação de Trabalho > Intervenção Técnica ( Troca de peça)")
                || ServicoInterface.servicoSelecionado.contains("SES (HGV) > Estação de Trabalho > Manutenção preventiva")
                || ServicoInterface.servicoSelecionado.contains("SES (HGV) > Estação de Trabalho > Remanejamento")
                || ServicoInterface.servicoSelecionado.contains("SES (HGV) > Estação de Trabalho > Substituição")
                || ServicoInterface.servicoSelecionado.contains("SES (HGV) > FormaSUS/RHOSE/SISGRADE/SISCAD/SISCADADISP/SISCON > Bug/Erro/Falha")
                || ServicoInterface.servicoSelecionado.contains("SES (HGV) > FormaSUS/RHOSE/SISGRADE/SISCAD/SISCADADISP/SISCON > Dúvidas e Orientações")
                || ServicoInterface.servicoSelecionado.contains("SES (HGV) > Impressora e Digitalização > Intervenção Técnica")
                || ServicoInterface.servicoSelecionado.contains("SES (HGV) > Impressora e Digitalização > Intervenção técnica(troca de peça)")
                || ServicoInterface.servicoSelecionado.contains("SES (HGV) > Impressora e Digitalização > Manutenção Preventiva")
                || ServicoInterface.servicoSelecionado.contains("SES (HGV) > Impressora e Digitalização > Substituição")
                || ServicoInterface.servicoSelecionado.contains("SES (HGV) > Indefinido >")
                || ServicoInterface.servicoSelecionado.contains("SES (HGV) > Internet/Rede > Ativação")
                || ServicoInterface.servicoSelecionado.contains("SES (HGV) > Internet/Rede > Instalação de Ponto de Rede")
                || ServicoInterface.servicoSelecionado.contains("SES (HGV) > Mãe Coruja > Dúvidas e Orientações")
                || ServicoInterface.servicoSelecionado.contains("SES (HGV) > Outros Sistemas > Dúvidas e Orientações")
                || ServicoInterface.servicoSelecionado.contains("SES (HGV) > Papel de Parede > Alteração")
                || ServicoInterface.servicoSelecionado.contains("SES (HGV) > Projetor e Perifericos > Instalação")
                || ServicoInterface.servicoSelecionado.contains("SES (HGV) > Projetor e Perifericos > Substituição")
                || ServicoInterface.servicoSelecionado.contains("SES (HGV) > SAPE >")
                || ServicoInterface.servicoSelecionado.contains("SES (HGV) > SEI/SIGEPE >")
                || ServicoInterface.servicoSelecionado.contains("SES (HGV) > SICREF/SISCONF/SCON >")
                || ServicoInterface.servicoSelecionado.contains("SES (HGV) > SIGAPE >")
                || ServicoInterface.servicoSelecionado.contains("SES (HGV) > SIM/SINAN/SINASC/CIEVS >")
                || ServicoInterface.servicoSelecionado.contains("SES (HGV) > Sistemas - Gerenciador de impressão >")
                || ServicoInterface.servicoSelecionado.contains("SES (HGV) > Sistemas Ministério da Saúde >")
                || ServicoInterface.servicoSelecionado.contains("SES (HGV) > Sistemas Operacional > Instalação")
                || ServicoInterface.servicoSelecionado.contains("SES (HGV) > Sistemas Operacional > Manutenção Preventiva")
                || ServicoInterface.servicoSelecionado.contains("SES (HGV) > Sistemas de BI >")
                || ServicoInterface.servicoSelecionado.contains("SES (HGV) > Telefonia >")
                || ServicoInterface.servicoSelecionado.contains("SES (HGV) > Usuário de E-mail >")
                || ServicoInterface.servicoSelecionado.contains("SES (HGV) > Vistoria/Diagnóstico >")) {
            padrao = 3;
        } else if (ServicoInterface.servicoSelecionado.contains("SES (HGV) > CITSmart ITSM > Cadastro de Usuário")) {
            padrao = 4;

        } else if (ServicoInterface.servicoSelecionado.contains("SES (HGV) > Impressora e Digitalização > Aquisição de Suprimentos")
                || ServicoInterface.servicoSelecionado.contains("SES (HGV) > Impressora e Digitalização > Configuração")
                || ServicoInterface.servicoSelecionado.contains("SES (HGV) > Impressora e Digitalização > Instalação")
                || ServicoInterface.servicoSelecionado.contains("SES (HGV) > Impressora e Digitalização > Remanejamento")
                || ServicoInterface.servicoSelecionado.contains("SES (HGV) > Impressora e Digitalização > Reposição")) {
            padrao = 5;
        } else if (ServicoInterface.servicoSelecionado.contains("SES (HGV) > Sistema MV/SoulMV >")) {
            padrao = 6;

        }
        System.out.println(padrao);


        Scanner entrada = new Scanner(System.in);
        System.setProperty("selenium.server.httpClientFactory", "apache");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.cesu.pe.gov.br/");


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        //By.xpath("//input[@id='senha']")
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement usuario = wait.until(ExpectedConditions.elementToBeClickable((By.xpath("//input[@id='user']"))));

        usuario.sendKeys(username);

        WebElement senha = wait.until(ExpectedConditions.elementToBeClickable((By.xpath("//input[@id='senha']"))));

        senha.sendKeys(password);

        WebElement login = driver.findElement(By.xpath("//button[normalize-space()='Entrar']"));
        login.click();


        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        };

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
        WebElement ContratoDrop = wait.until(ExpectedConditions.elementToBeClickable(By.id("idContrato")));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        };
        ;
        ContratoDrop.click();
        ContratoDrop.sendKeys(Contrato);
        WebElement Tab2 = driver.findElement(By.id("tab2"));
        Tab2.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        };
        ;
        WebElement CampoSolicitante = wait.until(ExpectedConditions.elementToBeClickable(By.id("solicitante")));


            WebElement PesqAvancada = wait.until(ExpectedConditions.elementToBeClickable(By.id("btnPesqAvancada")));
            PesqAvancada.click();
            WebElement EmailAvancada = wait.until(ExpectedConditions.elementToBeClickable(By.id("pesqLockupLOOKUP_SOLICITANTE_EMAIL")));
            EmailAvancada.click();
            EmailAvancada.sendKeys(username);
            WebElement Pesquisar = driver.findElement(By.xpath("//div[@id='divIntLOOKUP_SOLICITANTE']//div//input[@id='btnPesquisar']"));
            Pesquisar.click();


            WebElement Solicitante = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[45]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[1]/input[1]")));
            Solicitante.click();
            CampoSolicitante.click();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            };
            ;
            CampoSolicitante.sendKeys(Keys.DOWN);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            };
            CampoSolicitante.sendKeys(Keys.ENTER);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            };
            CampoSolicitante.click();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }




        WebElement Tab3 = driver.findElement(By.id("tab3"));
        Tab3.click();
        Thread.sleep(2000);
        WebElement ServicoBusca = wait.until(ExpectedConditions.elementToBeClickable(By.id("servicoBusca")));
        String Servico = ServicoInterface.servicoSelecionado;
        ServicoBusca.click();
        ServicoBusca.sendKeys(Servico);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        };
        ServicoBusca.sendKeys(Keys.DOWN);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        };
        ServicoBusca.sendKeys(Keys.ENTER);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        };
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

        if (padrao == 1) {
            System.out.println("Etiqueta: ");


            WebElement CampoEtiquetaCesu = driver.findElement(By.id("campoDyn_3526"));
            InterfaceTexto.main(args, "Etiqueta: ");
            InterfaceTexto.info = null;
            while (InterfaceTexto.info == null) {
                Thread.sleep(2000);
                System.out.println(InterfaceTexto.info);
            }
            CampoEtiquetaCesu.sendKeys(InterfaceTexto.info);


            WebElement CampoSetor = wait.until(ExpectedConditions.elementToBeClickable(By.id("campoDyn_3528")));
            CampoSetor.click();
            String Setor = SetorInterface.setorSelecionado;
            CampoSetor.sendKeys(Setor);

            WebElement CampoRamal = wait.until(ExpectedConditions.elementToBeClickable(By.id("campoDyn_3529")));
            CampoRamal.click();
            String Ramal = "845842";
            CampoRamal.sendKeys(Ramal);
            WebElement UnidadeDropdown = driver.findElement(By.id("campoDyn_3527"));
            WebElement ExpandirUnidade = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/div[1]/table[1]/tbody[1]/tr[3]/td[2]/div[1]/select[1]"));
            ExpandirUnidade.click();
            Select select = new Select(UnidadeDropdown);
            select.selectByValue("880");
            CampoRamal.click();
            //WebElement Funcionando = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@id='campoDyn_3702'])[1]")));
            //Funcionando.click();
            Thread.sleep(2000);

        } else if (padrao == 2) {

            WebElement CampoEtiquetaCesu = driver.findElement(By.id("campoDyn_3520"));
            WebElement CampoSetor = wait.until(ExpectedConditions.elementToBeClickable(By.id("campoDyn_3522")));
            CampoSetor.click();
            String Setor = SetorInterface.setorSelecionado;
            CampoSetor.sendKeys(Setor);

            WebElement CampoRamal = wait.until(ExpectedConditions.elementToBeClickable(By.id("campoDyn_3523")));
            CampoRamal.click();
            InterfaceTexto.info = null;
            InterfaceTexto.main(args, "Ramal: ");
            while (InterfaceTexto.info == null) {
                Thread.sleep(2000);
                System.out.println(InterfaceTexto.info);
            }
            CampoRamal.sendKeys(InterfaceTexto.info);

            InterfaceTexto.main(args, "Etiqueta: ");
            InterfaceTexto.info = null;
            while (InterfaceTexto.info == null) {
                Thread.sleep(2000);
                System.out.println(InterfaceTexto.info);
            }
            CampoEtiquetaCesu.sendKeys(InterfaceTexto.info);

            WebElement UnidadeDropdown = driver.findElement(By.id("campoDyn_3521"));
            WebElement ExpandirUnidade = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/div[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/select[1]"));
            ExpandirUnidade.click();
            Select select = new Select(UnidadeDropdown);
            select.selectByValue("870");

            InterfaceSimNao.SimNao("Equip. está funcionando?");

            while (InterfaceSimNao.resposta.equals("")) {
                System.out.println(InterfaceSimNao.resposta);
                Thread.sleep(2000);
            }

            String resposta = InterfaceSimNao.resposta;
            WebElement Funcionando = driver.findElement(By.xpath(
                    "/html[1]/body[1]/form[1]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/div[1]/table[1]/tbody[1]/tr[5]/td[2]/div[1]/input[1]"));
            WebElement NaoFuncionando = driver.findElement(By.xpath(
                    "/html[1]/body[1]/form[1]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/div[1]/table[1]/tbody[1]/tr[5]/td[2]/div[1]/input[2]"));
            if (resposta.equals("Sim")) {
                Funcionando.click();
            } else if (resposta.equals("Não")) {
                NaoFuncionando.click();

            }

        } else if (padrao == 3) {
            //Não há nada adicional.
            System.out.println(".");
        } else if (padrao == 4) {

            String Setor = SetorInterface.setorSelecionado;

            WebElement CampoNome = driver.findElement(By.id("campoDyn_3851"));
            WebElement CampoTelefone = driver.findElement(By.id("campoDyn_3852"));
            WebElement CampoEmailP4 = driver.findElement(By.id("campoDyn_3853"));
            WebElement CampoSetor = driver.findElement(By.id("campoDyn_3854"));

            CampoSetor.sendKeys(Setor);

            InterfaceTexto.info = null;
            InterfaceTexto.main(args, "Nome:");
            while (InterfaceTexto.info == null) {
                Thread.sleep(2000);
                System.out.println(InterfaceTexto.info);
            }
            CampoNome.sendKeys(InterfaceTexto.info);
            InterfaceTexto.info = null;
            InterfaceTexto.main(args, "Telefone:");
            while (InterfaceTexto.info == null) {
                Thread.sleep(2000);
                System.out.println(InterfaceTexto.info);
            }
            CampoTelefone.sendKeys(InterfaceTexto.info);
            InterfaceTexto.info = null;

            InterfaceTexto.main(args, "Email:");
            while (InterfaceTexto.info == null) {
                Thread.sleep(2000);
                System.out.println(InterfaceTexto.info);
            }
            CampoEmailP4.sendKeys(InterfaceTexto.info);
        } else if (padrao == 5) {
            WebElement CampoEtiquetaCesu = driver.findElement(By.id("campoDyn_3697"));
            WebElement CampoSetor = wait.until(ExpectedConditions.elementToBeClickable(By.id("campoDyn_3700")));
            CampoSetor.click();
            String Setor = SetorInterface.setorSelecionado;
            CampoSetor.sendKeys(Setor);

            WebElement CampoRamal = wait.until(ExpectedConditions.elementToBeClickable(By.id("campoDyn_3701")));
            CampoRamal.click();
            InterfaceTexto.info = null;
            InterfaceTexto.main(args, "Ramal: ");
            while (InterfaceTexto.info == null) {
                Thread.sleep(2000);
                System.out.println(InterfaceTexto.info);
            }
            CampoRamal.sendKeys(InterfaceTexto.info);

            InterfaceTexto.main(args, "Etiqueta: ");
            InterfaceTexto.info = null;
            while (InterfaceTexto.info == null) {
                Thread.sleep(2000);
                System.out.println(InterfaceTexto.info);
            }
            CampoEtiquetaCesu.sendKeys(InterfaceTexto.info);

            WebElement Unidade = driver.findElement(By.id("campoDyn_3699"));
            Unidade.sendKeys("HGV");

            InterfaceSimNao.resposta = "";
            InterfaceSimNao.SimNao("Equip. está funcionando?");

            while (InterfaceSimNao.resposta.equals("")) {
                System.out.println(InterfaceSimNao.resposta);
                Thread.sleep(2000);
            }

            String resposta = InterfaceSimNao.resposta;
            WebElement Funcionando = driver.findElement(By.xpath(
                    "/html[1]/body[1]/form[1]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/div[1]/table[1]/tbody[1]/tr[6]/td[2]/div[1]/input[1]"));
            WebElement NaoFuncionando = driver.findElement(By.xpath(
                    "/html[1]/body[1]/form[1]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/div[1]/table[1]/tbody[1]/tr[6]/td[2]/div[1]/input[2]"));
            if (resposta.equals("Sim")) {
                Funcionando.click();
            } else if (resposta.equals("Não")) {
                NaoFuncionando.click();


            }} else if (padrao == 6) {
            WebElement CampoSetor = driver.findElement(By.id("campoDyn_3855"));
            WebElement CampoRamal = driver.findElement(By.id("campoDyn_3856"));
            WebElement CampoIP = driver.findElement(By.id("campoDyn_3857"));

            CampoSetor.sendKeys(SetorInterface.setorSelecionado);

            InterfaceTexto.info = null;
            InterfaceTexto.main(args, "Ramal: ");
            while (InterfaceTexto.info == null) {
                Thread.sleep(2000);
                System.out.println(InterfaceTexto.info);
            }
            CampoRamal.sendKeys(InterfaceTexto.info);

            InterfaceTexto.info = null;
            InterfaceTexto.main(args, "IP do computador: ");
            while (InterfaceTexto.info == null) {
                Thread.sleep(2000);
                System.out.println(InterfaceTexto.info);
            }
            CampoIP.sendKeys(InterfaceTexto.info);

        }




        driver.switchTo().parentFrame();

        WebElement Gravar = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='btnGravar']")));

        InterfaceSimNao.resposta = "";
        InterfaceSimNao.SimNao("Criar Chamado?");

        while (InterfaceSimNao.resposta.equals("")) {
            System.out.println(InterfaceSimNao.resposta);
            Thread.sleep(1500);
        }

        String resposta = InterfaceSimNao.resposta;

        if (resposta.equals("Sim")) {
            Gravar.click();
        } else if (resposta.equals("Não")) {
            driver.quit();
        }


        Thread.sleep(30000);
        driver.switchTo().defaultContent();
        entrada.close();


        driver.quit(); // Fechar o navegador.
    }


}
