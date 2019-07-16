import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InnovaPost 
{
	
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\Javaprogramming\\codingchallange\\coding-challange\\SeleniumCodingChallangeSeries\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://hcm17preview.sapsf.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
	
	

}
