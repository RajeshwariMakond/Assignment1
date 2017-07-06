package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class logout {
	public static WebDriver driver = null;
	public logout(WebDriver driver)
	{
		 	this.driver=driver;
	}

	public static void logoutyatra() throws InterruptedException
	{
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id='userLoginBlock']/a")).click();
		driver.findElement(By.xpath("//*[@id='logOut']")).click();
	}
}
