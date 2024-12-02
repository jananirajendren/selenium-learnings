package Handlingdropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// script to select About fatcow in fatcoe app?

		
		
//		WebDriver driver = new ChromeDriver();
//		driver.get("http://www.fatcowhosting.com/");
//	
//	 driver.findElement(By.linkText("Around the Farm")).click();
//
//driver.findElement(By.linkText("About FatCow")).click();

//WATS to perform foll. actions
//1: Open Irctc app
//2: Move mouse cursor to More option
//3: Select any one of the dropdown option

//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.irctc.co.in/nget/train-search");
//		driver.manage().window().maximize();
//		Actions a = new Actions(driver);
//		WebElement ele = driver.findElement(By.linkText("MORE"));
//		a.moveToElement(ele).perform();
//		driver.findElement(By.xpath("//ul[@class='box-shadow more']/li[2]")).click();
	
//	script to write drag and drop
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://only-testing-blog.blogspot.com/2014/09/drag-and-drop.html");
//		Actions a = new Actions(driver);
//		WebElement drag = driver.findElement(By.id("dragdiv"));
//	WebElement drop = driver.findElement(By.id("dropdiv"));	
//	//a.dragAndDrop(drag, drop).perform();
//	a.dragAndDropBy(drag, 100, 200).perform();
	
	
	//script using keydown and keyup methods?
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Actions a = new Actions(driver);
		WebElement password = driver.findElement(By.id("email"));
		a.keyDown(Keys.SHIFT).perform();
		a.sendKeys(password,"janani").perform();
		a.keyUp(Keys.SHIFT).perform();
		a.sendKeys(password,"manager").perform();
	
		
		
		
	}
}
