package Practice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethods {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		// WebDriver driver = new ChromeDriver();

		// method 1:get()
		// driver.get("https://www.google.com");
		// driver.navigate().to("https://www.facebook.in");
		// driver.navigate().back();
		Thread.sleep(3000);

		// driver.navigate().forward();
		Thread.sleep(3000);

		// driver.navigate().refresh();
		// method:setsize
		// Dimension d = new Dimension(300,500);
		// driver.manage().window().setSize(d);
		// driver.manage().window().setSize(new Dimension(300,500));
		// method:setPosition
		// Ponit p = new Point(190,300);
		// driver.manage().window().setPosition(p);
		// driver.manage().window().setPosition(new Point(190,300));
		// driver.manage().window().maximize();
		// driver.manage().window().fullscreen();
		// driver.manage().window().minimize();
		// driver.close();

		WebDriver driver = new ChromeDriver();

		// method 1:get()
		driver.get("https://www.google.com");
		driver.navigate().to("https://www.facebook.in");
		driver.navigate().back();
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println(title);
		if(title.contains("Google"))
		{
		System.out.println("Google page displayed");
		}
		else
		{
		System.out.println("Google page not displayed");
		
		}
		driver.manage().window().setSize(new Dimension(400, 400));
		driver.manage().window().setPosition(new Point(300, 400));
		driver.manage().window().maximize();
		driver.navigate().forward();
		Thread.sleep(2000);
		String title1 = driver.getTitle();
		System.out.println(title1);
		if(title1.contains("Facebook"))
		{
		System.out.println("Facebook page displayed");
		}
		else
		{
		System.out.println("facebook page not displayed");
		}
		
		driver.navigate().refresh();
		driver.close();
		
	}

}
