package baseClass;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {
	
	public static WebDriver driver;
	
	public static void open_Browser(String url) throws InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\resources\\chromedriver.exe");
		 driver = new ChromeDriver();
		 
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 
		 driver.get(url);
		 
		 Thread.sleep(2000);
	}

}
