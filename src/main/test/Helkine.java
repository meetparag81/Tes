import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Helkine 
{
	private static String secondwindowhandle;
	private static String firstwindowhanddle;

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "G:\\Javaprogramming\\codingchallange\\coding-challange\\SeleniumCodingChallangeSeries\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://performancemanager8.successfactors.com/login?company=BPOCUSTOM10");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("bparag");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("pBorprg@81");
		driver.findElement(By.xpath("//input[@name='login']")).click();
		driver.findElement(By.xpath("(//bdi[text()='Home'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@role='listbox'][1]//a[text()='Goals']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Add Goal']")).click();
		String Parent = driver.getWindowHandle();
		driver.findElement(By.xpath("//ul[@id='27:wrapperList']//li/a[text()='Create a New Goal']")).click();
		Set<String>Windows= driver.getWindowHandles();
		firstwindowhanddle=driver.getWindowHandle();
		Windows.remove(firstwindowhanddle);
		for(String handle:Windows)
		{
			if(!handle.equals(firstwindowhanddle))
			{
				  secondwindowhandle=handle;
				break;
			}
		}
		driver.switchTo().window(secondwindowhandle);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Library Goal']")).click();
		driver.findElement(By.xpath("//a[text()='Administration'][1]")).click();
		driver.findElement(By.xpath("//a[text()='Administrative Support'][1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Administrative Support'][2]//following::input[13]")).click();
		driver.findElement(By.xpath("//a[text()='Administrative Support'][2]//following::button[text()='Add Selected']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[text()='Edit your goal below.']//following::input[@name='fbo5_edit0_xdone']")).sendKeys("10");
		driver.findElement(By.xpath("//td[text()='Edit your goal below.']//following::button[3]")).click();
	
	}

}
