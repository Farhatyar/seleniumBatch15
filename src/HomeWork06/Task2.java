package HomeWork06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");

        driver.findElement(By.xpath("//button[@id='display-other-button']")).click();
        WebDriverWait wait=new WebDriverWait(driver,15);

       WebElement hiddenBtn= driver.findElement(By.xpath("//button[@id='hidden']"));
       wait.until(ExpectedConditions.visibilityOf(hiddenBtn));
        ;hiddenBtn.click();
}
    }