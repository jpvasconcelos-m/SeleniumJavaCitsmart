package seleniumproject;

import org.apache.commons.logging.Log;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;




import java.time.Duration;


public class LoginInterface extends Application {


    private static LoginInterface instance;
    public String username;
   public String password;



    public static WebDriver driver; // Variável para o WebDriver do Selenium



    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Login");

        // Criação dos elementos da interface
        Text title = new Text("Login");
        title.setFont(Font.font("Arial", FontWeight.BOLD, 20));

        Label usernameLabel = new Label("Usuário:");
        TextField usernameField = new TextField();

        Label passwordLabel = new Label("Senha:");
        PasswordField passwordField = new PasswordField();

        Button loginButton = new Button("Entrar");

        Text message = new Text();

        // Configuração do layout
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20));
        grid.setVgap(10);
        grid.setHgap(10);

        grid.add(title, 0, 0, 2, 1);
        grid.add(usernameLabel, 0, 1);
        grid.add(usernameField, 1, 1);
        grid.add(passwordLabel, 0, 2);
        grid.add(passwordField, 1, 2);
        grid.add(loginButton, 1, 3);
        grid.add(message, 0, 4, 2, 1);

        // Configuração do evento de login
        loginButton.setOnAction(e -> {
           String username = usernameField.getText();
            String password = passwordField.getText();

            boolean loginSuccessful = performLogin(username, password);

            if (loginSuccessful) {
                message.setText("Login bem-sucedido!");
                message.setFill(Color.GREEN);
            } else {
                message.setText("Credenciais inválidas. Tente novamente.");
                message.setFill(Color.RED);
            }

        });

        // Configuração da cena
        Scene scene = new Scene(grid, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
        instance = this;
    }

    // Método para realizar o login com Selenium
    private boolean performLogin(String username, String password) {


        // Configurar o WebDriver do Selenium
        System.setProperty("selenium.server.httpClientFactory", "apache");

        ChromeOptions option = new ChromeOptions();
        option.setPageLoadStrategy(PageLoadStrategy.NONE);
        driver = new ChromeDriver(option);
        // Navegar para a página de login
        driver.get("https://www.cesu.pe.gov.br/");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // Preencher campos de usuário e senha
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement usernameElement = wait.until(ExpectedConditions.elementToBeClickable((By.xpath("//input[@id='user']"))));
        usernameElement.sendKeys(username);

        WebElement passwordElement = wait.until(ExpectedConditions.elementToBeClickable((By.xpath("//input[@id='senha']"))));
        passwordElement.sendKeys(password);

        // Clicar no botão de login
        WebElement loginButton = driver.findElement(By.xpath("//button[normalize-space()='Entrar']"));
        loginButton.click();

        WebElement Aguardar = wait.until(ExpectedConditions.elementToBeClickable(By.id("gerenciamento-servicos")));
        // Verificar se o login foi bem-sucedido
        boolean loginSuccessful;

        loginSuccessful = driver.getCurrentUrl().equals("https://www.cesu.pe.gov.br/citsmart/pages/smartPortal/smartPortal.load");




        System.out.println(loginSuccessful);

        return loginSuccessful;
    }
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }


    public static void main(String[] args) throws InterruptedException {

        launch(args);

    }

    public static LoginInterface getInstance() {
        return instance;
    }
}
