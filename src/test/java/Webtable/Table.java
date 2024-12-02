package Webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

	public static void main(String[] args) {
//WATS to display WebTable content as an output 
//	WebDriver driver = new ChromeDriver();
//		driver.get("file:///C:/Users/testuser/Desktop/webtable.html");
//		List<WebElement> ref = driver.findElements(By.xpath("//tr"));
//	int a=ref.size();
//	System.out.println(a);
//	
//		for (int i = 0; i < a; i++) {
//			WebElement ele = ref.get(i);
//			String str = ele.getText();
//	System.out.println(str);}
//	}}

	// WATS to display player name with runs in cric buzz app
WebDriver driver = new ChromeDriver();
driver.get("https://www.cricbuzz.com");
driver.findElement(By.xpath("//div[@id='match_menu_container']//li[5]")).click();
driver.findElement(By.linkText("Scorecard")).click();



	//AssignQues: WATS to verify sum of marks is equal to toal marks displayed in web table or not 
//WebDriver driver = new ChromeDriver();
//driver.get("file:///C:/Users/testuser/Desktop/webtable.html");
// boolean marks = driver.findElement(By.xpath("//tr/td[3]")).isDisplayed();
// boolean sumofmarks = driver.findElement(By.xpath("//tr[7]/td[3]")).isDisplayed();
//
//if(marks=sumofmarks)
//{
//	System.out.println("sumof marks is equal to total marks");
//}
//else
//{
//	System.out.println("sumof marks is not equal to total marks");}
//
//

}}
	