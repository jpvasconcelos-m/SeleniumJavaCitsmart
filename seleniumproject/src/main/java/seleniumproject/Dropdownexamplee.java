package seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

class DropdownExample {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.cesu.pe.gov.br/citsmart/jspEmbedded/43871/jsp_303_process.jsp");

        // Localize o elemento da dropdown list
        WebElement dropdownElement = driver.findElement(By.id("idCausaIncidente"));

        // Crie um objeto Select usando o elemento da dropdown list
        Select dropdown = new Select(dropdownElement);

        // Obtenha todos os elementos da dropdown list
        List<WebElement> options = dropdown.getOptions();

        // Copie o conteúdo dos elementos da dropdown list
        List<String> dropdownContent = new ArrayList<>();
        for (WebElement option : options) {
            dropdownContent.add(option.getText());
        }

        // Imprima o conteúdo copiado
        for (String content : dropdownContent) {
            System.out.println(content);
        }

        driver.quit();
    }
}

