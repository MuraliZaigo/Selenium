package blendpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Admin {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "F:\\Murali-Test\\Mine\\chromedriver_win32\\chromedriver.exe"); 
WebDriver driver = new ChromeDriver();

driver.get("http://94.177.199.10/blend-global-lms-trainer-portal/");
// URL

driver.findElement(By.xpath("/html/body/section/form/div/div/div/div[2]/div/div/div/p[1]/a/input")).click();
// Login page

WebElement mail = driver.findElement(By.name("email"));
mail.sendKeys("markkeny93@gmail.com");
// User name enter

WebElement pwd = driver.findElement(By.name("password"));
pwd.sendKeys("P@ssword123");
// Password enter

driver.findElement(By.xpath("/html/body/section/form/div/div/div/div[2]/div/div/div/p[5]/input")).click();
// Login click

//driver.findElement(By.className("hbar")).click();

driver.findElement(By.id("navbarDropdownMenuLink")).click();
driver.findElement(By.linkText("Dashboard")).click();
Thread.sleep(5000);

driver.findElement(By.id("navbarDropdownMenuLink")).click();
driver.findElement(By.linkText("Profile Status")).click();
Thread.sleep(5000);

driver.findElement(By.id("navbarDropdownMenuLink")).click();
driver.findElement(By.linkText("Update Profile")).click();
Thread.sleep(10000);

driver.findElement(By.id("navbarDropdownMenuLink")).click();
driver.findElement(By.linkText("Log Out")).click();
Thread.sleep(5000);

driver.findElement(By.xpath("/html/body/section/form/div/div/div/div[2]/div/div/a")).click();

driver.navigate().back();

driver.navigate().forward();

driver.findElement(By.xpath("/html/body/section/form/div/div/div/div[2]/div/div/div/p[2]/a")).click();

WebElement fname = driver.findElement(By.name("name"));
fname.sendKeys("Murali");

WebElement lname = driver.findElement(By.name("last_name"));
lname.sendKeys("Srini");

WebElement email = driver.findElement(By.name("email"));
email.sendKeys("muralisrini47@gmail.com");

WebElement phone = driver.findElement(By.name("mobile"));
phone.sendKeys("9442486674");

WebElement password = driver.findElement(By.name("password"));
password.sendKeys("P@ssword123");

WebElement cpassword = driver.findElement(By.name("password_confirmation"));
cpassword.sendKeys("P@ssword123");

driver.findElement(By.xpath("/html/body/section/form/div/div/div/div[2]/div/div/div/p[8]/input")).click();

Thread.sleep(20000);

driver.close();

//driver.navigate().to("http://94.177.199.10/blend-global-lms-trainer-portal/");
//driver.findElement(By.cssSelector("body > section > form > div > div > div > div:nth-child(2) > div > div > div > p:nth-child(1) > a > input[type=button]")).click();
//WebElement email = driver.findElement(By.name("email"));
//email.sendKeys("markkeny93@gmail.com");

//WebElement password = driver.findElement(By.name("password"));
//password.sendKeys("P@ssword123");

//driver.findElement(By.xpath("/html/body/section/form/div/div/div/div[2]/div/div/div/p[5]/input")).click();

//Thread.sleep(5000);
//driver.get("http://www.google.com");
//driver.navigate().back();
//driver.navigate().forward();

//driver.close();

	}

}
