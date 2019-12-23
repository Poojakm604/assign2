package assign2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class B {
	public static void main(String[] args) {

	WebDriver driver = new ChromeDriver();
	driver.get("https://www.tripadvisor.in/");
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);

	WebElement search1 = driver.findElement(By.className("brand-global-nav-action-search-Search__searchButton--b9-IK"));
	search1.click();
	
	WebElement search2 = driver.findElement(By.id("mainSearch"));
	search2.sendKeys("Club Mahindra");
	driver.findElement(By.className("main-content")).click();
	driver.findElement(By.xpath("//*[@id=\"component_4\"]/div/div/div[1]/div[2]/a/span[2]")).click();
	driver.findElement(By.xpath("//*[@id=\"component_12\"]/div/div[2]/div/div[2]/div/div[1]/a")).click();
	WebElement search3 =driver.findElement(By.xpath("//*[@id=\"ReviewTitle\"]"));
			search3.sendKeys("nice place");
	driver.findElement(By.xpath("//*[@id=\"ReviewText\"]")).sendKeys("good ambience");
	driver.findElement(By.xpath("//*[@id=\"SUBMIT\"]")).click();

	}
}
