package week2.day1.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeadCreate {

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
		WebElement eleSour = driver.findElement(By.id("createLeadForm_dataSourceId"));
		eleSour.sendKeys("Direct Mail");
		WebElement eleMarkCamp = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		eleMarkCamp.sendKeys("Car and Driver");

		WebElement locFname = driver.findElement(By.id("createLeadForm_firstNameLocal"));
		locFname.sendKeys("Saravanan");
		WebElement locLname = driver.findElement(By.id("createLeadForm_lastNameLocal"));
		locLname.sendKeys("Mohan");
		WebElement eleSalutation = driver.findElement(By.id("createLeadForm_personalTitle"));
		eleSalutation.sendKeys("Mrs.");
		WebElement eleBirth = driver.findElement(By.name("birthDate"));
		eleBirth.sendKeys("10/5/21");
		WebElement eleTitle = driver.findElement(By.id("createLeadForm_generalProfTitle"));
		eleTitle.sendKeys("software Tester");
		WebElement eleDept = driver.findElement(By.id("createLeadForm_departmentName"));
		eleDept.sendKeys("ComputerScience");
		WebElement eleRevenue = driver.findElement(By.id("createLeadForm_annualRevenue"));
		eleRevenue.sendKeys("500000");
		WebElement eleIndu = driver.findElement(By.id("createLeadForm_industryEnumId"));
		eleIndu.sendKeys("IND_HARDWARE");
		WebElement eleNoOfEmp = driver.findElement(By.id("createLeadForm_numberEmployees"));
		eleNoOfEmp.sendKeys("10");
		WebElement eleOwner = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		eleOwner.sendKeys("Partnership");
		WebElement eleSicCode = driver.findElement(By.id("createLeadForm_sicCode"));
		eleSicCode.sendKeys("EMP015252323");
		WebElement eleTicsym = driver.findElement(By.id("createLeadForm_tickerSymbol"));
		eleTicsym.sendKeys("ANC0000");
		WebElement eleDes = driver.findElement(By.id("createLeadForm_description"));
		eleDes.sendKeys("creationLead");
		WebElement eleImpNote = driver.findElement(By.id("createLeadForm_importantNote"));
		eleImpNote.sendKeys("Creation of Lead use this ");
		WebElement eleCouCode = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
		eleCouCode.sendKeys("91");
		WebElement eleAreacode = driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode"));
		eleAreacode.sendKeys("435");
		WebElement elePhone = driver.findElement(By.id("createLeadForm_primaryPhoneNumber"));
		elePhone.sendKeys("8610049174");
		WebElement eleExt = driver.findElement(By.id("createLeadForm_primaryPhoneExtension"));
		eleExt.sendKeys("91");
		WebElement eleAskFor = driver.findElement(By.id("createLeadForm_primaryPhoneAskForName"));
		eleAskFor.sendKeys("sarav");
		WebElement elePriEmail = driver.findElement(By.id("createLeadForm_primaryEmail"));
		elePriEmail.sendKeys("saravanan12bca@gmail.com");
		WebElement eleWeburl = driver.findElement(By.id("createLeadForm_primaryWebUrl"));
		eleWeburl.sendKeys("https://www.google.com");
		WebElement eleGenToName = driver.findElement(By.id("createLeadForm_generalToName"));
		eleGenToName.sendKeys("Saravanan T M");
		WebElement eleAttnName = driver.findElement(By.id("createLeadForm_generalAttnName"));
		eleAttnName.sendKeys("saravanan");
		WebElement eleAdd1 = driver.findElement(By.id("createLeadForm_generalAddress1"));
		eleAdd1.sendKeys("23/14,IyyankarStreet");
		WebElement eleAdd2 = driver.findElement(By.id("createLeadForm_generalAddress2"));
		eleAdd2.sendKeys("Kumbakonam");
		WebElement eleCity = driver.findElement(By.id("createLeadForm_generalCity"));
		eleCity.sendKeys("Kumabkonam");
		WebElement eleCountry = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		eleCountry.sendKeys("India");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
//		WebElement eleState = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
//		eleState.click();
//		driver.findElement(By.linkText("GOA")).click();

		WebElement eleGenPos = driver.findElement(By.name("generalPostalCode"));
		eleGenPos.sendKeys("Kumbakonam-HO");
		WebElement elePosExt = driver.findElement(By.id("createLeadForm_generalPostalCodeExt"));
		elePosExt.sendKeys("612001");
		System.out.println(firstName.getAttribute("value"));
		driver.findElement(By.name("submitButton")).click();
		System.out.println("Title: " + driver.getTitle());
		if (driver.getTitle().equals("View Lead | opentaps CRM")) {
			System.out.println("the page title is correct");
		} else {
			System.out.print("the Page title is not correct");
		}

	}

}
