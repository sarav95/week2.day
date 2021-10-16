package week2.day1.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditPage {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		WebElement eleEmail = driver.findElement(By.id("email"));
		eleEmail.sendKeys("saravanan12bca@gmail.com");
		WebElement textApp = driver.findElement(By.xpath("//input[@value='Append ']"));
		String App = textApp.getAttribute("value");
		textApp.clear();
		textApp.sendKeys(App+"text");
		WebElement textVal = driver.findElement(By.xpath("//input[@value=\"TestLeaf\"]"));
		String val = textVal.getAttribute("value");
		System.out.println(val);
		WebElement eleClear = driver.findElement(By.xpath("//input[@value=\"Clear me!!\"]"));
		eleClear.clear();
		WebElement eleDis = driver.findElement(By.xpath("//input[@disabled=\"true\"]"));
		if (eleDis.isEnabled()) {
			System.out.println("the textbox edit field is enabled");	
		}
		else {
			System.out.println("the textbox edit field is disabled");
		}
			
		driver.close();
		
		
	}

}
