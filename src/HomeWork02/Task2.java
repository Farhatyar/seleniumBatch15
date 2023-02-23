package HomeWork02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
        /*navigate to fb.com
        click on create new account
        fill up all the textbooks
        click on sign up button
        close the pop-up
        close the browser
         */

public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("Khan");
        driver.findElement(By.name("lastname")).sendKeys("yar");
        driver.findElement(By.name("reg_email__")).sendKeys("Khan-yar@gmail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("Khan-yar@gmail.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("456");


        driver.close();


}
}