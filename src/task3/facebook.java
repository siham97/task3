package task3;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class facebook{
	static WebDriver driver;
public static void main (String args[]) {
	System.setProperty("webdriver.gecko.driver", "c:\\geckodriver.exe");
	driver=new FirefoxDriver();
	driver.get("http://facebook.com");
	driver.manage().window().maximize();
	driver.findElement(By.xpath(".//*[@id='u_0_a']")).sendKeys("siham");
	/*driver.findElement(By.xpath(".//*[@id='u_0_c']")).sendKeys("Abubaker");
	driver.findElement(By.xpath(".//*[@id='u_0_f']")).sendKeys("0598307540");


	driver.findElement(By.xpath(".//*[@id='u_0_m']")).sendKeys("0598307540");*/
	Select sel= new Select(driver.findElement(By.xpath(".//*[@id='month']")));
	sel.selectByIndex(3);
	/*Select se= new Select(driver.findElement(By.xpath(".//*[@id='day']")));
	
	se.selectByIndex(3);
	Select el= new Select(driver.findElement(By.xpath(".//*[@id='year']")));
	el.selectByIndex(15);
	driver.findElement(By.xpath(".//*[@id='u_0_7']")).click();
*/
	driver.findElement(By.xpath(".//*[@id='u_0_s']")).click();

}
}
