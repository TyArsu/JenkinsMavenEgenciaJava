package kasiapractice;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class test01 {
	
	@Test
	public void google1() {
		
		System.setProperty("webdriver.chrome.driver", "/Users/kasia/Documents/Libraries/drivers/chromedriver3");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://mvnrepository.com/");
		String mvn= driver.getTitle();
		System.out.println(mvn);
		Assert.assertEquals(true, mvn);
	}

}
