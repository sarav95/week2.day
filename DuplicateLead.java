package week2.day1.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("Demosalesmanager");
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("crmsfa");
		WebElement login = driver.findElement(By.className("decorativeSubmit"));
		login.click();
		WebElement link = driver.findElement(By.linkText("CRM/SFA"));
		link.click();
		WebElement eleLead = driver.findElement(By.linkText("Leads"));
		eleLead.click();
		WebElement eleFindLead = driver.findElement(By.linkText("Find Leads"));
		eleFindLead.click();
		WebElement eleFindEmail  = driver.findElement(By.xpath("//span[text()='Email']"));
		eleFindEmail.click();
		WebElement eleEmail = driver.findElement(By.xpath("//input[@name='emailAddress']"));
		eleEmail.sendKeys("saravanan12bca@gmail.com");
		WebElement eleFL = driver.findElement(By.xpath("//button[text()='Find Leads']"));
		eleFL.click();
		WebElement eleFirst = driver.findElement(By.xpath("(//a[text()='Saravanan'])[1]"));
		String text = eleFirst.getText();
		eleFirst.click();
		WebElement btnDup = driver.findElement(By.xpath("//a[text()='Duplicate Lead']"));
		btnDup.click();
		String Tit=driver.getTitle();
		System.out.println(text);
		if (Tit.equals("Duplicate Lead | opentaps CRM")) {
			driver.findElement(By.xpath("//input[@value=\"Create Lead\"]")).click();
		}
		WebElement getFn = driver.findElement(By.id("viewLead_firstName_sp"));
		if(getFn.getText().equals(text)) {
			driver.close();
		}
	}

}
