//12.


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class FacebookLoginParameterizedTest {
    private WebDriver driver;
    private String username;
    private String password;

    public FacebookLoginParameterizedTest(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Automation_Tools\\chromedriver_win32\\chromedriver.exe");

        driver = new ChromeDriver();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testData() {
        return Arrays.asList(new Object[][]{
                {"unusepc@gmail.com", "3Jra-cZ3$9BWRa3"},
                {"fake@email.com", "password"},
                {"pc@gmail.com", "pass"}
        });
    }

    @Test
    public void testFacebookLogin() {
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

    @After
    public void tearDown() {
        driver.quit();
    }
}
