package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class masterpage {
	
	public static yatrauser user = null;
	public static flightbook flight = null;
	public static hotelbook hotel = null;
	public static logout signout = null;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Radar_Automation\\Drivers\\Gecko driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		

		driver.get("https://www.yatra.com/");
		
		user = new yatrauser(driver);
		flight = new flightbook(driver);
		hotel = new hotelbook(driver);
		signout = new logout(driver);
		
		

	}

}
