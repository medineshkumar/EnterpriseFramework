package genericClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browser {

	static WebDriver driver;

	public static WebDriver startBrowser(String browserName, String url) {

		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\dinesh.r\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("disable-infobars");
			driver = new ChromeDriver(options);
			driver.manage().window().maximize();
		} else if (browserName.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", "C:\\Users\\Dinesh.r\\Desktop\\internetexplorer.exe");
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
		} else if (browserName.equalsIgnoreCase("firefox")) {			
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\dinesh.r\\geckodriver.exe");
		/*	driver = new MarionetteDriver();*/
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}
		driver.get(url);
		return driver;
	}

	public static WebDriver launchApp(String url) {
		driver.get(url);
		return driver;
	}

	public static void closeBrowser() {
		driver.close();
		driver.quit();
	}

}
