package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class flightbook {
	
	public static WebDriver driver=null;
	
	public flightbook(WebDriver driver)
	{
		 	this.driver=driver;
	}

	public  static void travelbook() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@name='flight_origin_city']")).sendKeys("New Delhi, India (DEL)");
		driver.findElement(By.xpath("//input[@name='flight_destination_city']")).sendKeys("Bangalore, India (BLR)");
		
		
		driver.findElement(By.xpath(".//*[@id='BE_flight_form']/div/div[2]/ul/li[3]/i")).click();
		driver.findElement(By.xpath(".//*[@id='a_2017_3_21']/span[1]")).click();
		
		driver.findElement(By.xpath(".//*[@id='BE_flight_ret_cal']/i")).click();
		driver.findElement(By.xpath(".//*[@id='a_2017_3_31']/span[1]")).click();
		
		driver.findElement(By.xpath(".//*[@id='BE_flight_paxInfoBox']/i")).click();
		driver.findElement(By.xpath(".//*[@id='msdrpdd20_msdd']/div[1]/span[2]")).click();
		driver.findElement(By.xpath(".//*[@id='msdrpdd21_msdd']/div[1]/span[2]")).click();
		
		driver.findElement(By.xpath("//*[text()='Done']")).click();
		driver.findElement(By.xpath(".//*[@id='BE_flight_flsearch_btn']")).click();
		
		Thread.sleep(5000);
		
		driver.navigate().back();
		
		
	}
	
}
