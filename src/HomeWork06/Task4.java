package HomeWork06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task4 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
        driver.findElement(By.xpath("//button[@id='checkbox']")).click();
        WebDriverWait wait=new WebDriverWait(driver,15);
        WebElement checkBox=driver.findElement(By.id("ch"));
        wait.until(ExpectedConditions.elementSelectionStateToBe(checkBox,true));
        System.out.println(checkBox.isSelected());



}
    }