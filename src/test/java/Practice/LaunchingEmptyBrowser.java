package Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

 class LaunchingEmptyBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			
			//case2:-selenium version:-4.25.0,webdrivermanager version:5.9.2
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
	}

}
