package HomeWork06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task1 {
   public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");

        driver.findElement(By.id("populate-text")).click();

        WebDriverWait wait = new WebDriverWait(driver,20);
        boolean isTextChanged=wait.until(ExpectedConditions.textToBe(By.id("h2"),"Selenium Webdriver"));
        System.out.println(isTextChanged);
    }
}
