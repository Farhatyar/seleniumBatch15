package HomeWork03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    /*enter the message in the text box
    click on show message
    Enter value of a
    Enter value of B
    click on the button get total
    also please print the value of the attribute type of the button GET TOTAL*/

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://practice.syntaxtechs.net/basic-first-form-demo.php");
       WebElement text= driver.findElement(By.xpath("//input[@id='user-message']"));
       text.sendKeys("I like Selenium");
     WebElement showmessage= driver.findElement(By.xpath("//button[text()='Show Message']"));
        showmessage.click();
        WebElement valueA= driver.findElement(By.xpath("//input[@id='sum1']"));
        valueA.sendKeys("3");
         WebElement valueB= driver.findElement(By.xpath("//input[@id='sum2']"));
         valueB.sendKeys("5");
          WebElement total= driver.findElement(By.xpath("//button[contains(text(),'Total')]"));
         total.click();
        System.out.println(driver.findElement(By.xpath
                ("//button[contains(text(),'Total')]")).getAttribute("type"));

        System.out.println(
                driver.findElement(By.xpath("//label[text()=' Total a + b = ']"))
                        .getText()+" "+driver.findElement(By.xpath("//span[@id='displayvalue']"))
                        .getText());

        Thread.sleep(3000);
        driver.quit();
    }
}