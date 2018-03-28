package task3;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class test2{
static WebDriver driver;
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "c:\\geckodriver.exe");
		driver=new FirefoxDriver();
	}

	@After
	public void tearDown() throws Exception {
		//diver.quit();
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("siham.soso33@yahoo.com");
		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("78963214");
		driver.findElement(By.xpath(".//*[@id='u_0_2']")).click();

	}

}
