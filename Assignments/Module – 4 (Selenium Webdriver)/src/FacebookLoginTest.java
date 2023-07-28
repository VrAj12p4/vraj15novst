//11.


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginTest {
	private WebDriver driver;

	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation_Tools\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
	}

	@Test
	public void testFacebookLogin() {
		driver.get("https://www.facebook.com/");

		driver.findElement(By.id("email")).sendKeys("unusepc@gmail.com");

		driver.findElement(By.id("pass")).sendKeys("3Jra-cZ3$9BWRa3");

		driver.findElement(By.name("login")).click();

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
