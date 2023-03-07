package HomeWork04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");

        WebElement CheckboxBtn=driver.findElement
                (By.cssSelector("input[type='checkbox']"));

        boolean isSelectedCheck=CheckboxBtn.isSelected();
        System.out.println(isSelectedCheck);
        if (!isSelectedCheck) {
            CheckboxBtn.click();
        }
        System.out.println(CheckboxBtn.isSelected());

    }
}