import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoblaze {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation_Tools\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        Thread.sleep(3000);
        driver.get("https://www.demoblaze.com/");
        Thread.sleep(3000);
        driver.findElement(By.id("login2")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("loginusername")).sendKeys("Vraj Patel");
        Thread.sleep(3000);
        driver.findElement(By.id("loginpassword")).sendKeys("123456");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
        Thread.sleep(3000);
        driver.close();
	}

}
