package week2.day1.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkPage {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		WebElement eleLink = driver.findElement(By.xpath("(//a[text()='Go to Home Page'])[1]"));
		eleLink.click();
		WebElement reHome = driver.findElement(By.xpath("//a[@href=\"pages/Link.html\"]"));
		reHome.click();
		WebElement btnlink = driver.findElement(By.xpath("//a[@href=\"Button.html\"]"));
		System.out.println(btnlink.getAttribute("href"));
	}
	

}
