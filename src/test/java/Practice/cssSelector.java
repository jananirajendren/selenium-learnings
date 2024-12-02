package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.findElement(By.cssSelector("span[id='nav-link-accountList-nav-line-1']")).click();
		driver.findElement(By.cssSelector("a[id='createAccountSubmit']")).click();
		driver.findElement(By.cssSelector("input[id='ap_customer_name']")).sendKeys("janani");
		driver.findElement(By.id("ap_phone_number")).sendKeys("9360270926");
		driver.findElement(By.id("ap_password")).sendKeys("janani22");
		driver.findElement(By.id("continue")).click();
	}
}
