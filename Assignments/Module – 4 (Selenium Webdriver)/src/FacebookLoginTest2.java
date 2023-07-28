//14.


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FacebookLoginTest2 {
    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Automation_Tools\\chromedriver_win32\\chromedriver.exe");

        driver = new ChromeDriver();
    }

    @DataProvider(name = "LoginData")
    public Object[][] loginData() {
        return new Object[][]{
        	{"unusepc@gmail.com", "3Jra-cZ3$9BWRa3"},
            {"fake@email.com", "password"},
            {"pc@gmail.com", "pass"}
        };
    }

    @Test(dataProvider = "LoginData")
    public void testFacebookLogin(String username, String password) {
        driver.get("https://www.facebook.com/");

        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys(username);

        WebElement passwordField = driver.findElement(By.id("pass"));
        passwordField.sendKeys(password);

        WebElement loginButton = driver.findElement(By.name("login"));
        loginButton.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
