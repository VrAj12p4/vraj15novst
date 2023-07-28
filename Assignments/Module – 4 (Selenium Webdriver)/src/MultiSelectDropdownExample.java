//2.


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropdownExample {
    public static void main(String[] args) {
        
        System.setProperty("webdriver.chrome.driver", "C:\\Automation_Tools\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        WebElement dropdownElement = driver.findElement(By.className("product_sort_container"));

        Select dropdown = new Select(dropdownElement);
        
        if (dropdown.isMultiple()) {
        
            dropdown.selectByIndex(0); 
            dropdown.selectByIndex(2); 
            dropdown.selectByIndex(4); 
        }

        
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        
        driver.quit();
    }
}
