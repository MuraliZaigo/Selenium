package admin_panel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dashboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "F:\\Murali-Test\\Mine\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("http://94.177.199.10/blend-global-lms-trainer-portal/admin");
		
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("admin@blendglobal.com");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("12345678");
		
		driver.findElement(By.id("remember")).click();
		
		driver.findElement(By.xpath("//*[@id=\"loginform\"]/div[5]/button")).click();
		
		driver.findElement(By.xpath("//*[@id=\"main-menu-navigation\"]/li[3]/a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"user_list\"]/div/div[2]/div/div[2]/span/span[4]/a/input")).click();
		
		driver.findElement(By.linkText("Back")).click();
		
		driver.findElement(By.xpath("//*[@id=\"user_list\"]/div/div[2]/div/div[2]/span/span[4]/a/input")).click();
		
		WebElement firstname = driver.findElement(By.name("name"));
		firstname.sendKeys("Zaigo");
		
		WebElement lastname = driver.findElement(By.name("last_name"));
		lastname.sendKeys("Test");
		
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("zaigotest@gmail.com");
		
		WebElement Mobile = driver.findElement(By.name("mobile"));
		Mobile.sendKeys("9019019019");
		
		WebElement pwd = driver.findElement(By.name("password"));
		pwd.sendKeys("P@ssword123");
		
		WebElement c_pwd = driver.findElement(By.name("confirm_password"));
		c_pwd.sendKeys("P@ssword123");
		
		driver.findElement(By.cssSelector("#multi-column\\  > div > div > div > form > div > div > button")).click();
		
		WebElement middlename = driver.findElement(By.name("middle_name"));
		middlename.sendKeys("Infotech");
		
		WebElement exp = driver.findElement(By.name("total_experience"));
		exp.sendKeys("3.6 years of experience in QA");
		
		//WebElement photo = driver.findElement(By.name("photo_upload"));
		//photo.sendKeys("Zaigo");
		
		WebElement curr_address = driver.findElement(By.name("address"));
		curr_address.sendKeys("No. 20, Nowhere street, Alagar Nagar");
		
		WebElement curr_address1 = driver.findElement(By.name("address1"));
		curr_address1.sendKeys("Chennai, Tamilnadu");

/*		WebElement country = driver.findElement(By.name("country_val"));
		country.sendKeys("No. 20, Nowhere street, Alagar Nagar"); */
		
/*		WebElement state = driver.findElement(By.name("state_val"));
		state.sendKeys("No. 20, Nowhere street, Alagar Nagar"); */

/*		WebElement city = driver.findElement(By.name("city_val"));
		city.sendKeys("No. 20, Nowhere street, Alagar Nagar"); */

		WebElement pin = driver.findElement(By.name("zipcode"));
		pin.sendKeys("980980");

		driver.findElement(By.id("check")).click();
		
		/* driver.findElement(By.className("dropdown")).click();
		
		driver.findElement(By.xpath("//*[@id=\"user_list\"]/div/div[3]/div[1]/table/tbody/tr[5]/td[7]/div/div/span[1]/a")).click(); */
		
		
	}

}
