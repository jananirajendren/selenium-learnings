package Listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dateofbirth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	WebDriver driver = new ChromeDriver();
//	driver.get("https://www.facebook.com/");
//driver.findElement(By.linkText("Create new account")).click();
//WebElement day = driver.findElement(By.id("day"));
//Select s = new Select(day);
//s.selectByIndex(5);
//WebElement month = driver.findElement(By.id("month"));
//Select s1 = new Select(month);
//s1.selectByValue("3");
//WebElement year = driver.findElement(By.id("year"));
//Select s2 = new Select(year);
//s2.selectByVisibleText("2010");

//WATS to select country in fatcow application
//WebDriver driver = new ChromeDriver();
//driver.get("http://www.fatcowhosting.com/");
//WebElement country = driver.findElement(By.id("countrySelect"));
//Select s1 = new Select(country);
//s1.selectByVisibleText("Australia");

//script to verify date filed is multiseletabke or not in facebook?
//WebDriver driver = new ChromeDriver();
//driver.get("https://www.facebook.com/");
//driver.findElement(By.linkText("Create new account")).click();
//WebElement day = driver.findElement(By.id("day"));
//Select s=new Select(day);
//boolean b = s.isMultiple();
//if(b)
//{
//	System.out.println("Date filed is multiselectable");
//}
//else
//{
//	System.out.println("Date filed is not multiselectable");	
//}

//WATS to display total no. of options present in listbox AS an output in FB year field
//WebDriver driver = new ChromeDriver();
//driver.get("https://www.facebook.com/");
//driver.findElement(By.linkText("Create new account")).click();
//WebElement year = driver.findElement(By.id("year"));
//	Select s=new Select(year);
//	List<WebElement> list = s.getOptions();
//	int count = list.size();
//	System.out.println("Total no of options in year field listbox is "+count);
//	
	
	//WATS to select country australia in fatcow application if it is existing in listbox
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.fatcowhosting.com/");
	WebElement country = driver.findElement(By.id("countrySelect"));
	country.click();	
	Select s1 = new Select(country);
	List<WebElement> list = s1.getOptions();
	for(int i=0;i<list.size();i++)
	{
		WebElement rv = list.get(i);
		String str = rv.getText();
		if(str.contains("Australia"))
				{
				s1.selectByIndex(i);
		break;
		}
	}
	}}
// WATS to display selected option as an output in single selectable listbox in FB month field
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.facebook.com");
//		driver.findElement(By.linkText("Create new account")).click();
//		WebElement ref=driver.findElement(By.id("month"));
//		Select s=new Select(ref);
//		List<WebElement> list = s.getOptions();
//		for(int i=0;i<list.size();i=i+2)
//		{
//			s.selectByIndex(i);
//			
//		}
//		WebElement rv = s.getFirstSelectedOption();
//		System.out.println(rv.getText());


//	}
//	}
