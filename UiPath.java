package week2.day1.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UiPath {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://acme-test.uipath.com/login/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		WebElement eleEmail = driver.findElement(By.xpath("//input[@id='email']"));
		eleEmail.sendKeys("kumar.testleaf@gmail.com");
		WebElement elePwd = driver.findElement(By.xpath("//input[@id='password']"));
		elePwd.sendKeys("leaf@12");
		WebElement btnLog = driver.findElement(By.xpath("//button[@type='submit']"));
		btnLog.click();
		System.out.println(driver.getTitle());
		WebElement btnLogout = driver.findElement(By.xpath("//a[text()='Log Out']"));
		btnLogout.click();
		driver.close();
	}
	

}
