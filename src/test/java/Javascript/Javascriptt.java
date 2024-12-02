package Javascript;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascriptt {

	public static void main(String[] args) throws IOException, InterruptedException {

		// WATS to login FB using javascript
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.facebook.com/");
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("document.getElementById('email').value='admin'");
//		js.executeScript("document.getElementById('pass').value='admin'");
//		WebElement rv = driver.findElement(By.name("login"));
//		js.executeScript("arguments[0].click();",rv);
//		
//		WebDriver driver = new ChromeDriver();
//		driver.get("file:///D:/STUDY/selenium/disble%20element.html");
//		WebElement ele = driver.findElement(By.id("user"));
//	JavascriptExecutor js = (JavascriptExecutor) driver;
//	js.executeScript("document.getElementById('user).value='admin'");

		// script to take screenshot of google webpage using javascript

		try {
			Files.createDirectories(Paths.get("selenium/screenshots"));
		} catch (IOException e) {
			e.printStackTrace();
		}

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		TakesScreenshot ss = (TakesScreenshot) driver;
		File src = ss.getScreenshotAs(OutputType.FILE);
		File destination = new File("selenium/screenshots/googlewebpage.png");
		FileUtils.copyFile(src, destination);
		driver.close();

	}

}
