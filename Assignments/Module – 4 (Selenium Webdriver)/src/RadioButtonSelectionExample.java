//4.


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonSelectionExample {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable.
        System.setProperty("webdriver.chrome.driver", "C:\\Automation_Tools\\chromedriver_win32\\chromedriver.exe");

        // Create a new instance of ChromeDriver.
        WebDriver driver = new ChromeDriver();

        // Navigate to the provided URL.
        driver.get("http://demo.guru99.com/test/radio.html");

        // Find all radio buttons on the webpage.
        java.util.List<WebElement> radioButtons = driver.findElements(By.xpath("//input[@type='radio']"));

        // Loop through the radio buttons and select each one.
        for (WebElement radioButton : radioButtons) {
            // Check if the radio button is already selected or not.
            if (!radioButton.isSelected()) {
                radioButton.click();
            }

            // Wait for a few seconds to see the selection.
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Close the browser.
        driver.quit();
    }
}
