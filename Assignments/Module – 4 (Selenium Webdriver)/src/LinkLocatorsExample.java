//1.


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkLocatorsExample {
    public static void main(String[] args) {
        
        System.setProperty("webdriver.chrome.driver", "C:\\Automation_Tools\\chromedriver_win32\\chromedriver.exe");

        
        WebDriver driver = new ChromeDriver();

        
        driver.manage().window().maximize();

        
        driver.get("https://www.saucedemo.com/");


        WebElement usernameField = driver.findElement(By.id("user-name"));
        usernameField.sendKeys("standard_user");

        
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("secret_sauce");

        
        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();

        
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        
        driver.quit();
    }
}
