package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathLocator {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		// Script to create account in amazon using xpathBYAttribute
//WebDriver driver=new ChromeDriver();
//driver.get("https://www.amazon.in");
//driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
//driver.findElement(By.xpath("//a[@id='createAccountSubmit']")).click();
//driver.findElement(By.xpath("//input[@id='ap_customer_name']")).sendKeys("janani");
//driver.findElement(By.xpath("//input[@id='ap_phone_number']")).sendKeys("9360270926");
//driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("janani22");
//driver.findElement(By.xpath("//input[@id='continue']")).click();

		// script to login in facebook using xpathbycontains bcaz xpathby attribute
		// howing exception for dynamic elements
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.facebook.com");
//		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("jananirajendran22@gmail.com");
//		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Janani@2207");
//		driver.findElement(By.xpath("//button[contains(@id,'u_0')]")).click();

		// WATS to display price of REDMI 9 Activ (Coral Green, 128 GB) Mobile as an
		// output in flipkart
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.flipkart.com");
//		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys(" REDMI 9 Activ (Coral Green, 128 GB)");
//		driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();
//		WebElement ele = driver.findElement(By.xpath("//div[@class='KzDlHZ']/../..//div[@class,'Nx9bqj _4b5DiR']"));
//		String str = ele.getText();
//		System.out.println(str);
//		
		// WATS to display ratings and reviews of REDMI 9 Activ (Coral Green, 128 GB)
		// Mobile as an output in flipkart
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.flipkart.com");
//		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys(" REDMI 9 Activ (Coral Green, 128 GB)");
//		driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();
//		String str1 = driver.findElement(By.xpath("//div[@class='KzDlHZ']/..//span[@class='Wphh3N']")).getText();
//		System.out.println(str1);

		// script to display price for redbus
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in");
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Madiwala");
		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("CMBT, Chennai");
		driver.findElement(By.xpath("//i[@class='sc-cSHVUG NyvQv icon icon-datev2']")).click();
		driver.findElement(By.xpath("//text[@class='dateText']")).click();

		// Script to find any one oneplus mobile price in amazon
		// WebDriver driver = new ChromeDriver();
//		driver.get("https://www.amazon.in");
//		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("oneplus mobile");
//		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
//		String str2=driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']/../../../..//span[@class='a-price']")).getText();
//		System.out.println(str2);

	}
}
