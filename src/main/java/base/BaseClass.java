package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseClass {
	


	public static WebDriver driver;
	public static Properties prop;
	public BaseClass() throws IOException
	{

		prop = new Properties();
		FileInputStream file = new FileInputStream("C:\\Users\\admin29\\Desktop\\dummy\\FirstMavenProject\\Config\\Config1.properties");
		prop.load(file);
	
	}
	@SuppressWarnings("deprecation")
	public static void initialization()
	{
		ChromeOptions options  = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		 driver = new ChromeDriver(options);
		 driver.manage().window().maximize();
		 driver.get(prop.getProperty("url"));
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}

}
