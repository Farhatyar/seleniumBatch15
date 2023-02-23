package HomeWork02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    /*navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
    fill out the form
    click on register
    close the browser
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0");
        driver.findElement(By.id("customer.firstName")).sendKeys("Omar");
        driver.findElement(By.id("customer.lastName")).sendKeys("Farhatyar");
        driver.findElement(By.id("customer.address.street")).sendKeys("2500");
        driver.findElement(By.id("customer.address.city")).sendKeys("philly");
        driver.findElement(By.id("customer.address.state")).sendKeys("PA");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("19030");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("+1267000000");
        driver.findElement(By.id("customer.ssn")).sendKeys("4567 1457 32");
        driver.findElement(By.id("customer.username")).sendKeys("Omar");
        driver.findElement(By.id("customer.password")).sendKeys("4567");
        driver.findElement(By.id("repeatedPassword")).sendKeys("4567");
        driver.findElement(By.className("button")).click();

        Thread.sleep(2000);
        driver.close();
    }
}