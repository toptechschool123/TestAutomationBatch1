package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
	
		
		driver.get("https://testenvironment.toptechschool.us/");
		
		driver.manage().window().maximize();
		
WebElement MyAccount =driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]"));
MyAccount.click();


WebElement Login =driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a"));
Login.click();

WebElement Email =driver.findElement(By.id("input-email"));
Email.sendKeys("najib.sakha7@gmail.com");
WebElement password =driver.findElement(By.name("password"));
password.sendKeys("Nj@sk0306");

driver.findElement(By.id("signinbtn")).click();
	}

}
