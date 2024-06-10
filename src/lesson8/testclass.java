package lesson8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testclass {
	
	@Test
	public void myfirstTest() {
		String URL = "https://www.almosafer.com/en";
		
		WebDriver driver = new ChromeDriver();
		driver.get(URL);
		
		boolean web = driver.getCurrentUrl().contains("en");
		System.out.println(web);
		
		String URL1=  driver.getTitle().toUpperCase();
		System.out.println(URL1);
		
		char URL12=  driver.getTitle().toLowerCase().charAt(0);
		System.out.println(URL12);
	}
}
