package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class hotelbook {
	public static WebDriver driver=null;
	public hotelbook(WebDriver driver)
	{
		 	this.driver=driver;
	}
	
	public static void travelhotelbook() throws InterruptedException
	{
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[text()='HOTELS']")).click();
		
		Thread.sleep(5000);
		
		
		driver.findElement(By.xpath("//input[@name='BE_hotel_destination_city']")).sendKeys("Bangalore");
		Thread.sleep(5000);
		driver.findElement(By.xpath("html/body/div[16]/ul/div[2]/div/li[4]")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath(".//*[@id='BE_hotel_form']/div[1]/div[2]/ul/li[2]/i")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("html/body/div[14]/div[3]/div[2]/div/div/div[1]/div[2]/div/table/tbody/tr[4]/td[4]/a/span")).click();
		
		driver.findElement(By.xpath(".//*[@id='BE_hotel_form']/div[1]/div[2]/ul/li[4]/i")).click();
		driver.findElement(By.xpath("html/body/div[14]/div[3]/div[2]/div/div/div[1]/div[2]/div/table/tbody/tr[5]/td[5]/a/span")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("html/body/div[1]/section[1]/section[2]/div[2]/div[2]/form/div[1]/div[3]/i")).click();
		driver.findElement(By.xpath("html/body/div[1]/section[1]/section[2]/div[2]/div[2]/form/div[1]/div[3]/div/div[1]/div[2]/div[2]/div[1]/span[2]")).click();
		driver.findElement(By.xpath("html/body/div[1]/section[1]/section[2]/div[2]/div[2]/form/div[1]/div[3]/div/div[1]/div[3]/div[2]/div[1]/span[2]")).click();
		driver.findElement(By.xpath("html/body/div[1]/section[1]/section[2]/div[2]/div[2]/form/div[1]/div[3]/div/div[3]/span")).click();
		driver.findElement(By.xpath("html/body/div[1]/section[1]/section[2]/div[2]/div[2]/form/div[1]/div[4]/input")).click();
		
		Thread.sleep(5000);
		
		driver.navigate().back();
		
	}

	

}
