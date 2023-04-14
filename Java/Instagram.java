import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation_Tools\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        Thread.sleep(3000);
        driver.get("https://www.instagram.com/");
        Thread.sleep(3000);
        driver.findElement(By.name("username")).sendKeys("vraj");
        Thread.sleep(3000);
        driver.findElement(By.name("password")).sendKeys("123456");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(3000);
        driver.close();
	}

}
