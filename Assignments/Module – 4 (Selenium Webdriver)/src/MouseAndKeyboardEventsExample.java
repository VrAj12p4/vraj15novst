//7.


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAndKeyboardEventsExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Automation_Tools\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.guru99.com/");

        Actions actions = new Actions(driver);

        WebElement seleniumLink = driver.findElement(By.linkText("Selenium"));
        actions.moveToElement(seleniumLink).perform();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement searchBox = driver.findElement(By.name("search"));
        actions.click(searchBox).sendKeys("Java").perform();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();
    }
}
