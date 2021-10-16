package week2.day1.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("http://leaftaps.com/opentaps/control/login");
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("Demosalesmanager");
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("crmsfa");
		WebElement login = driver.findElement(By.className("decorativeSubmit"));
		login.click();
		WebElement link = driver.findElement(By.linkText("CRM/SFA"));
		link.click();
		WebElement eleContact = driver.findElement(By.linkText("Contacts"));
		eleContact.click();
		WebElement eleCreCont = driver.findElement(By.linkText("Create Contact"));
		eleCreCont.click();	
		WebElement eleFname = driver.findElement(By.id("firstNameField"));
		eleFname.sendKeys("Saravanan");
		 WebElement eleLname = driver.findElement(By.id("lastNameField"));
		 eleLname.sendKeys("T M");
		 WebElement eleFnLoc = driver.findElement(By.id("createContactForm_firstNameLocal"));
		 eleFnLoc.sendKeys("Sara");
		 WebElement eleLnLoc = driver.findElement(By.id("createContactForm_lastNameLocal"));
		 eleLnLoc.sendKeys("T M");
		 WebElement eleDept = driver.findElement(By.id("createContactForm_departmentName"));
		eleDept.sendKeys("Information Technology");
		WebElement eleDesc = driver.findElement(By.id("createContactForm_description"));
		eleDesc.sendKeys("Contact creation");
		WebElement eleEmail = driver.findElement(By.id("createContactForm_primaryEmail"));
		eleEmail.sendKeys("saravanan12bca@gmail.com");
		WebElement eleState = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select drop1=new Select(eleState);
		drop1.selectByVisibleText("New York");
		WebElement eleCont = driver.findElement(By.className("smallSubmit"));
		eleCont.click();
		WebElement eleEdit = driver.findElement(By.linkText("Edit"));
		eleEdit.click();
		WebElement eleDesc1 = driver.findElement(By.id("updateContactForm_description"));
		eleDesc1.clear();
		WebElement eleImp = driver.findElement(By.id("updateContactForm_importantNote"));
		eleImp.sendKeys("updating contact");
		WebElement eleUpd = driver.findElement(By.xpath("//input[@value=\"Update\"]"));
		eleUpd.click();
		System.out.println(driver.getTitle());
		driver.close();
	}

}
