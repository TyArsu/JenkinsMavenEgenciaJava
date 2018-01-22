package kasiapractice;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class test02 {
	@Test
	public void google() {
		
		System.setProperty("webdriver.chrome.driver", "/Users/kasia/Documents/Libraries/drivers/chromedriver3");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://mvnrepository.com/");
		String mvn= driver.getTitle();
		System.out.println(mvn);
		Assert.assertEquals(true, mvn);

}
}