package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnabled {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		boolean ele = driver.findElement(By.id("twotabsearchtextbox")).isEnabled();
		if (ele) {
			System.out.println("search field is enabled");
		} else {
			System.out.println("search fieldis disabled");
		}
	}
}
