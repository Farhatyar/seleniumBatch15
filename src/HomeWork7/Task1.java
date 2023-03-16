package HomeWork7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

      driver.findElement(By.id("txtUsername")).sendKeys("Admin");
      driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
      driver.findElement(By.id("btnLogin")).click();
      driver.findElement(By.xpath("//b[text()='PIM']")).click();

      String idS="52378A";
      List<WebElement> idColumn=driver.findElements(By.xpath("//table[@id='resultTable']//tbody/tr/td[2]/a"));
        for (int i = 0; i < idColumn.size(); i++) {
          if (idColumn.get(i).getText().equals(idS)){
              driver.findElement(By.xpath("//table[@id='resultTable']//tbody/tr["+(i+1)+"]/td[1]/input")).click();

            }
        }
    }
}