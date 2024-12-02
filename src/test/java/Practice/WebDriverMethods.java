package Practice;

import java.sql.DriverAction;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
//launching empty browser
		WebDriver driver = new ChromeDriver();
		
		//method 1:get()
		//driver.get("https://www.facebook.com");
		
		//method 2:getTitle()
		//String title = driver.getTitle();
		//System.out.println(title);
		
		//metthod 3:getCurrentUrl()
		//String url = driver.getCurrentUrl();
	//	System.out.println(url);
		
		//method 4:getPageSource()
	//	String src = driver.getPageSource();
	//	System.out.println(src);
		
		//method 5:manage()
		//Options opt = driver.manage();
		//Window win = opt.window();
		//win.maximize();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");

		Thread.sleep(3000);
		driver.manage().window().minimize();
		Thread.sleep(3000);
   driver.manage().window().fullscreen();
		Thread.sleep(3000);
		
	   //method 6:close()
		//driver.close();
		
		//method 7:quit()
		//driver.quit();
		
		//method:getSize()
		driver.get("https://www.facebook.com");
		//before maximize
		Dimension size = driver.manage().window().getSize();
		System.out.println(size);
		System.out.println("Browser size= "+size.getHeight());
		System.out.println("Browser size= "+size.getWidth());
		
		driver.manage().window().maximize();
		//after maximize
		System.out.println(driver.manage().window().getSize());
		System.out.println(driver.manage().window().getSize().getHeight());
		System.out.println(driver.manage().window().getSize().getWidth());
		Thread.sleep(2000);
		
		//method:setSize
		driver.manage().window().setSize(new Dimension(800,800));
		
		//method:getPosition
		Point position = driver.manage().window().getPosition();
		System.out.println(position);
		System.out.println("X coordinate = "+position.getX());
		System.out.println("Y coordinate = "+position.getY());
		
		//method:setPosition
		driver.manage().window().setPosition(new Point(200,100));
		
		//method:to("url")
		//driver.navigate().to("https://www.amazon.in");
		
		//method:to(URL url)
		//driver.navigate().to(new URL("https://www.amazon.in"));

		
		
		
		
	}

}
