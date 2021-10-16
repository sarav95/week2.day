package week2.day1.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ButtonPage {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		WebElement btnHome = driver.findElement(By.id("home"));
		btnHome.click();
		WebElement btnRe = driver.findElement(By.xpath("//a[@href=\"pages/Button.html\"]"));
		btnRe.click();
		WebElement btnPos = driver.findElement(By.id("position"));
		Point location = btnPos.getLocation();
		System.out.println("X value is:"+location.x+"Y value is:"+location.y);
		WebElement eleColor = driver.findElement(By.id("color"));
		String color = eleColor.getCssValue("background-color");
		System.out.println(color);
		WebElement eleSize = driver.findElement(By.id("size"));
		System.out.println(eleSize.getSize());
	}

}
