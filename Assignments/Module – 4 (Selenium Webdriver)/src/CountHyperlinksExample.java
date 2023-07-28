//9.


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountHyperlinksExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Automation_Tools\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://demo.guru99.com/test/web-table-element.php");

        java.util.List<WebElement> hyperlinks = driver.findElements(By.tagName("a"));

        System.out.println("Total Hyperlinks on the page: " + hyperlinks.size());

        driver.quit();
    }
}
