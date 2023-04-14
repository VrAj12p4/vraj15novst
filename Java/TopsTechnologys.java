import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TopsTechnologys {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation_Tools\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        Thread.sleep(3000);
        driver.get("https://careercenter.tops-int.com/");
        Thread.sleep(3000);
        driver.findElement(By.name("user_name")).sendKeys("9316318052");
        Thread.sleep(3000);
        driver.findElement(By.name("user_password")).sendKeys("9316318052");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@value='login']")).click();
        Thread.sleep(3000);
        driver.close();
	}

}
