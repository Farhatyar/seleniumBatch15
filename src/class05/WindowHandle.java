package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandle {
    public static void main(String[] args) throws InterruptedException {

        //  tell your project where the webdriver is located.
        //   for Mac user please do not use .exe with chromedriver
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        //        create an instance of WebDriver
        WebDriver driver = new ChromeDriver();

        //        max the window
        driver.manage().window().maximize();

        //        goto syntaxprojects.com
        driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S-1828606640%3A1678243523072743&authuser=0&continue=https%3A%2F%2Fmyaccount.google.com%2Fsecurity-checkup%3Fcontinue%3Dhttps%3A%2F%2Fmyaccount.google.com%2F&ec=GAlAwAE&hl=en&flowName=GlifWebSignIn&flowEntry=AddSession");

        //        click on the help button
        driver.findElement(By.xpath("//a[text()='Help']"));

        //        click on privacy
        driver.findElement(By.xpath("//a[text()='Privacy']"));

        //        get the window handle of the parent window
        String parentWindowHandle = driver.getWindowHandle();
        System.out.println(parentWindowHandle);

        //        get window handles of all the windows that have been opened up
        Set<String> windowHandles =driver.getWindowHandles();
        //        print all the window handles
        for (String wh:windowHandles){

        //  switch the focus of the driver to help window
            driver.switchTo().window(wh);

            //  check the title of the window to which our focus is right now
            String title=driver.getTitle();
            if(title.equalsIgnoreCase("Privacy Policy – Privacy &amp; Terms – Google")){
                break;
            }
        }
        // to verify we switched to the right window;
        System.out.println(driver.getTitle());
        driver.switchTo().window(parentWindowHandle);
    }
}