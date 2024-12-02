package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class acti {

	public static void main(String[] args) {
		// script to login facebook without using click method:
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.facebook.com");
//		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("jananirajendran22@gmail.com");
//		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Janani@2207");
//		driver.findElement(By.xpath("//button[contains(@id,'u_0')]")).sendKeys(Keys.ENTER);

		//WATS to enter text in firstname and remove the text using only backspace 
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.facebook.com");
//		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
//		WebElement ele = driver.findElement(By.xpath("//input[@name='firstname']"));
//		ele.sendKeys("janani");
//		ele.sendKeys(Keys.CONTROL + "a");
//		ele.sendKeys(Keys.BACK_SPACE);
		
		
//WATS to enter text in username and copy the text  and paste in password tab by without inspect
		WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com");
		WebElement ele=driver.findElement(By.id("email"));
		ele.sendKeys("jananirajendran22@gmail.com");
		ele.sendKeys(Keys.CONTROL+"a");
		ele.sendKeys(Keys.CONTROL+"c");
		ele.sendKeys(Keys.TAB+""+Keys.CONTROL+"v");
		
		
	}

}
