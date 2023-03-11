package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
    public static void main(String[] args) throws InterruptedException {
        // connect to the  webDriver
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        // initiate the instance of web-driver
        WebDriver driver=new ChromeDriver();
        // open google .com
        driver.get("https://www.google.com");
        // slow down
        Thread.sleep(2000);
        // new navigate to facebook
        driver.navigate().to("https://www.facebook.com/");
        // slow down
        Thread.sleep(2000);
        // go back
        driver.navigate().back();
        // slow down
        Thread.sleep(2000);
        //  go to facebook
        driver.navigate().forward();
        // slow down
        Thread.sleep(2000);
        //refresh the page
        driver.navigate().refresh();
        // close the browser
        driver.close();
    }
}
