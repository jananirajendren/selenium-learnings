package Autosuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Auto {

	public static void main(String[] args) throws InterruptedException {
		// WATS to select any one of the autosuggestion options in google webpage
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.google.com");
//		driver.findElement(By.id("APjFqb")).sendKeys("selenium");
//		Thread.sleep(2000);
//		List<WebElement> ref = driver.findElements(By.xpath("//div[@aria-label='selenium ide']"));
//		int a = ref.size();
//		for (int i = 0; i < ref.size(); i++) {
//			WebElement ele = ref.get(i);
//			ele.click();

		//// WATS to display no of suggesions are showing and select any one of the
		//// autosuggestion options in amazon
//			WebDriver driver = new ChromeDriver();
//			driver.get("https://www.amazon.in");
//			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("headphones");
//			Thread.sleep(2000);
//			List<WebElement> list = driver.findElements(By.xpath("//div[@class='left-pane-results-container')]"));
//			int a=list.size();
//			System.out.println(a);
//			List<WebElement> ref = driver.findElements(By.xpath("//div[@aria-label='headphones wireless with mic']"));
//		int s = ref.size();
//			for (int i = 0; i < ref.size(); i++) {
//				WebElement ele = ref.get(i);
//			ele.click();
//			
		// WATS to enter "nike" in flipkart search field and display all autosuggestion
		// text as an output
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("nike");
		Thread.sleep(2000);
		List<WebElement> nike = driver.findElements(By.xpath("//li[@class='_3D0G9a']"));
		int s = nike.size();
		System.out.println(s);
		for (int i = 0; i < nike.size(); i++) {
			WebElement ele = nike.get(i);
			String str = ele.getText();
			System.out.println(str);

		}
	}

}
