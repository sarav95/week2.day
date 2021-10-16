package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("Demosalesmanager");
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("crmsfa");
		WebElement login = driver.findElement(By.className("decorativeSubmit"));
		login.click();
		WebElement link = driver.findElement(By.linkText("CRM/SFA"));
		link.click();
		WebElement lead = driver.findElement(By.linkText("Leads"));
		lead.click();
		WebElement creatLead = driver.findElement(By.linkText("Create Lead"));
		creatLead.click();
		WebElement companyName = driver.findElement(By.id("createLeadForm_companyName"));
		companyName.sendKeys("Accenture");
		WebElement firstName = driver.findElement(By.id("createLeadForm_firstName"));
		firstName.sendKeys("Saravanan");
		WebElement lastName = driver.findElement(By.id("createLeadForm_lastName"));
		lastName.sendKeys("T M");
		WebElement locFname = driver.findElement(By.id("createLeadForm_firstNameLocal"));		
		locFname.sendKeys("Saravanan");
		WebElement eleSource = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dropdown=new Select(eleSource);
		dropdown.selectByVisibleText("Direct Mail");
		
		WebElement eleIndustry = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select dropdown1=new Select(eleIndustry);
		dropdown1.selectByIndex(7);
		
		WebElement eleOwner = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select dropdown2=new Select(eleOwner);
		dropdown2.selectByValue("OWN_PARTNERSHIP");
		
		WebElement eleCamp = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		eleCamp.sendKeys("Affiliate Sites");
	}

}
