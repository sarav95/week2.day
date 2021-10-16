package week2.day1.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		WebElement eleFirName = driver.findElement(By.xpath("//input[@name=\"UserFirstName\"]"));
		eleFirName.sendKeys("SARAVANAN");
		WebElement eleLasName = driver.findElement(By.xpath("//input[@name=\"UserLastName\"]"));
		eleLasName.sendKeys("T M");
		WebElement eleWorkEmail = driver.findElement(By.xpath("//input[@name=\"UserEmail\"]"));
		eleWorkEmail.sendKeys("saravanan12bca@gmail.com");
		WebElement eleJobTitle = driver.findElement(By.xpath("//select[@name='UserTitle']"));
		Select dropd1=new Select(eleJobTitle);
		dropd1.selectByValue("Sales_Manager_AP");
		WebElement eleCompName = driver.findElement(By.xpath("//input[@name='CompanyName']"));
		eleCompName.sendKeys("Accenture");
		WebElement eleEmp = driver.findElement(By.xpath("//select[@name='CompanyEmployees']"));
		Select dropd2=new Select(eleEmp);
		dropd2.selectByVisibleText("1 - 15 employees");
		WebElement eleUphone = driver.findElement(By.xpath("//input[@name='UserPhone']"));
		eleUphone.sendKeys("9043907963");
		WebElement eleCountry = driver.findElement(By.xpath("//select[@name='CompanyCountry']"));
		Select dropd3=new Select(eleCountry);
		dropd3.selectByVisibleText("Iceland");
		driver.close();
	}
	

}
