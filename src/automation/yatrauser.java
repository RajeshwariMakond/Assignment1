package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class yatrauser {
	public static WebDriver driver=null;
	
	public yatrauser(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public static void login() throws InterruptedException
	{
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//*[@id='userSignInStrip']/a")).click();  //Click on My Account
		
		driver.findElement(By.xpath("//*[@id='signInBtn']")).click();          //Click on Sign-in button
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath(".//*[@id='emailId']")).sendKeys("g.makond@gmail.com");      //Login-Credentials
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Rajeshwari123");
		driver.findElement(By.xpath("//*[@id='signInBtn']")).clear();                            //Click on to sign-in 
	}
	

}
