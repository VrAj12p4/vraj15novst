//5.


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogoXPathExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Automation_Tools\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");

        WebElement logoImage = driver.findElement(By.xpath("//img[contains(@class, 'fb_logo')]"));

        String logoImageUrl = logoImage.getAttribute("src");

        System.out.println("Facebook Logo Image URL: " + logoImageUrl);

        driver.quit();
    }
}
