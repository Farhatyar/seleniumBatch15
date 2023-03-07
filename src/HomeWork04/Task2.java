package HomeWork04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Task2 {
public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");

        List<WebElement> checkBtns=driver.findElements(By.cssSelector("input[class='cb1-element']"));
        for (WebElement checkBtn:checkBtns){
            String optText= checkBtn.getAttribute("value");
            if (optText.equalsIgnoreCase("Option-3")){
                checkBtn.click();
            }

        }
    }
}