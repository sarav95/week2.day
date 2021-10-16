package week2.day1.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

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
		WebElement elePhone = driver.findElement(By.xpath("//span[text()='Phone']"));
		elePhone.click();
		WebElement eleCtCode = driver.findElement(By.xpath("//input[@name='phoneCountryCode']"));
		eleCtCode.sendKeys("91");
		WebElement elePhoArea = driver.findElement(By.xpath("//input[@name='phoneAreaCode']"));
		elePhoArea.sendKeys("435");
		WebElement elePhoNum = driver.findElement(By.xpath("//input[@name='phoneNumber']"));
		elePhoNum.sendKeys("8610049174");
		WebElement btnFindLead = driver.findElement(By.xpath("//button[text()='Find Leads']"));
		btnFindLead.click();
		WebElement eleFL = driver.findElement(By.xpath("(//a[contains(text(),'175')])[1]"));
		String Led = eleFL.getText();
		eleFL.click();
		WebElement btnDel = driver.findElement(By.xpath("//a[text()='Delete']"));
		btnDel.click();
		WebElement elefind = driver.findElement(By.xpath("//a[text()='Find Leads']"));
		elefind.click();
		WebElement eleL = driver.findElement(By.xpath("//input[@name='id']"));
		eleL.sendKeys(Led);
		WebElement btnFiL = driver.findElement(By.xpath("//button[text()='Find Leads']"));
		btnFiL.click();
		WebElement eleNF = driver.findElement(By.xpath("//div[text()='No records to display']"));
		eleNF.getText();
		if (eleNF.getText().equals("No records to display")) {
			driver.close();
		}
			
		}
		
		
	}
	

