package week2.day1.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

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
		WebElement eleFname = driver.findElement(By.xpath("(//input[@name='firstName'])[3]"));
		eleFname.sendKeys("Saravanan");
		//WebElement eleLname = driver.findElement(By.xpath("(//input[@name=\"lastName\"])[3]"));
		//eleLname.sendKeys("T M");
		WebElement btnFlead = driver.findElement(By.xpath("//button[text()='Find Leads']"));
		btnFlead.click();
		WebElement eleFLink = driver.findElement(By.xpath("(//a[contains(text(),'15')])[1]"));
		eleFLink.click();
		if (driver.getTitle().equals("View Lead | opentaps CRM")) {
			System.out.println("title Matched");
		}
		WebElement btnEdit = driver.findElement(By.xpath("//a[text()='Edit']"));
		btnEdit.click();
		WebElement eleUpdName = driver.findElement(By.id("updateLeadForm_companyName"));
		eleUpdName.clear();
		eleUpdName.sendKeys("HKS");
		WebElement eleCon = driver.findElement(By.id("updateLeadForm_companyName"));
		String attribute = eleCon.getAttribute("value"); 
		WebElement eleUpd = driver.findElement(By.xpath("//input[@value=\"Update\"]"));
		eleUpd.click();
		WebElement eleCmp = driver.findElement(By.id("viewLead_companyName_sp"));
		String text = eleCmp.getText();
		String[] split = text.split(" ");
		if (split[0].equals(attribute)) {
			driver.close();
		}
		
	}
	

}
