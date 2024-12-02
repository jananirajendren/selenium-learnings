package Webdriver;

import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.facebook.com");
//		WebElement ele = driver.findElement(By.id("email"));
//		Dimension d = ele.getSize();
//		int height = d.getHeight();
//		int width = d.getWidth();
//		System.out.println("Email id height is: " + height);
//		System.out.println("Email id width is: " + width);

		// AssignQues: WATS to verify email and pwd fields length is same or not in FB
		// app

		 WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		 
    WebElement ele = driver.findElement(By.id("email"));
    WebElement pass = driver.findElement(By.id("pass"));
    ele.sendKeys("jananirajendran22@gmail.com");
	String str = ele.getAttribute("value");
	pass.sendKeys("jananirajendran22@gmail.com");
	String str1 = ele.getAttribute("value");
    if (str==str1) {
        System.out.println("The length of the email and password fields are the same.");
    } else {
        System.out.println("The length of the email and password fields are different.");
    }

	
		

		// script to get location and size of email in FB
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.facebook.com");
//		WebElement ele = driver.findElement(By.id("email"));
//		Rectangle rec = ele.getRect();
//		System.out.println(rec.getHeight());
//		System.out.println(rec.getWidth());
//		System.out.println(rec.getX());
//		System.out.println(rec.getY());

//script to displau email filed entered text as an op in FB

//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.facebook.com");
//		WebElement ele=driver.findElement(By.id("email"));
//		ele.sendKeys("jananirajendran22@gmail.com");
//		String str = ele.getAttribute("value");
//		System.out.println(str);

		// Ques: WATS to display default text as an output & also verify text field
		// contains default text or not in flipkart application

//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.flipkart.com");
//		WebElement ele = driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']"));
//		String str=ele.getAttribute("title");
//		System.out.println("default text of search field is :"+str);
//		boolean ele1 = driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']")).isDisplayed();
//		if (ele1) {
//			System.out.println("default search field text is displayed");
//		} else {
//			System.out.println("default search field text is not displayed");
//		}
}}