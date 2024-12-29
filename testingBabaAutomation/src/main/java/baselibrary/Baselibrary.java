package baselibrary;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.webdriver.WebDriverBrowser;

public class Baselibrary {

    @Test
	public void launchurl()
	{
		//WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
	
	}
}
