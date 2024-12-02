package Webdriver;

import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleComponents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// script todisplay tot no ofimages in flipkart
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.flipkart.com");
//		List<WebElement> ref = driver.findElements(By.xpath("//img"));
//		int a = ref.size();
//		System.out.println("Total no.of.images in flipkart is: " + a);

		// script to display total no. of links Text as an output in google webpage

//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.google.com");
//		List<WebElement> ref = driver.findElements(By.tagName("a"));
//		for (int a = 0; a < ref.size(); a++) {
//			WebElement rv = ref.get(a);
//			String str = rv.getText();
//			System.out.println(str);
//			for (WebElement rv :ref) {
//			}
//            System.out.println(rv.getText());
//		}

		// WATS to print every link href attribute property value as an output in google
		// webpage
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.google.com");
//		List<WebElement> ref = driver.findElements(By.tagName("a"));
//		for (WebElement rv : ref) {
//			@Nullable
//			String str = rv.getAttribute("href");
//			System.out.println(str);

		// Script to display all the images and their "source attribute prop value" as
		// an output in flipkart?
//			WebDriver driver = new ChromeDriver();
//			driver.get("https://www.flipkart.com");
//			 List<WebElement> ref = driver.findElements(By.tagName("img"));
//			 int a = ref.size();
//			 System.out.println("Total no of images in flipkart is :"+a);
//			 for (WebElement rv : ref) {
//					@Nullable
//					String str = rv.getAttribute("src");
//					System.out.println(str);
		// }

		// WATS to verify firstname and surname field are in same position or not in FB
		// app
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		WebElement firstname = driver.findElement(By.name("firstname"));
		WebElement surname = driver.findElement(By.name("lastname"));
		Point p = firstname.getLocation();
		int x = p.getX();
		int y = p.getY();
		if (x == y) {
			System.out.println("firstname and surname field are in same position");
		} else {
			System.out.println("firstname and surname field are not in same position");

		}
		


	}

}
