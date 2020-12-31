package blendpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Admin2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "F:\\Murali-Test\\Mine\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("http://94.177.199.10/blend-global-lms-trainer-portal/admin");
		
		WebElement mail = driver.findElement(By.id("email"));
		mail.sendKeys("admin@blendglobal.com");
		
		//WebElement pwd = driver.findElement(By.id("password"));
		//pwd.sendKeys("12345678");

		driver.findElement(By.id("password")).sendKeys("12345678");
		
		driver.findElement(By.id("remember")).click();
		
		Thread.sleep(5000);
		
		mail.submit();
		
		//mail.clear();
		//pwd.clear();
		
		//driver.findElement(By.className("login100-form-btn")).click();
		
		//driver.getCurrentUrl();
		
		//driver.getPageSource();
		
		//driver.getTitle();
		
		//System.out.println("The title is ...");
		
	}

}
