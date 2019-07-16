import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WFSTest 
{
	
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\Javaprogramming\\codingchallange\\coding-challange\\SeleniumCodingChallangeSeries\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://acc-man-accenturemanila-trn.wfsaas.com/workforce/Desktop.do");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("pencinas");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Workforce1");
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		driver.switchTo().frame("EntryFrame");
		WebElement element= driver.findElement(By.xpath("(//div[text()='Time Entry']//following::ul/li/a)[1]"));
		element.click();
		driver.switchTo().frame("mainFrame");
		driver.findElement(By.xpath("//span[contains(text(),'.Exempt')]//parent::a//parent::div")).click();
		driver.findElement(By.xpath("//span[contains(text(),'.Exempt')]//following::li[1]")).click();
		driver.switchTo().frame("mainFrame");
		driver.findElement(By.xpath("//span[contains(text(),'Mon')]//following::td[2]//input")).sendKeys("clock");
		}
		
		
		
		
		
		
	}
	


