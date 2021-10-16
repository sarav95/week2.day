package week2.day1.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		WebElement eleCretAcct = driver.findElement(By.linkText("Create New Account"));
		eleCretAcct.click();
		WebElement eleFname = driver.findElement(By.name("firstname"));
		eleFname.sendKeys("Rani");
		WebElement eleLname = driver.findElement(By.name("lastname"));
		eleLname.sendKeys("K");
		WebElement eleEmail = driver.findElement(By.name("reg_email__"));
		eleEmail.sendKeys("saravanan12bca@gmail.com");
		WebElement eleReEmail = driver.findElement(By.name("reg_email_confirmation__"));
		eleReEmail.sendKeys("saravanan12bca@gmail.com");
		WebElement elePwd = driver.findElement(By.id("password_step_input"));
		elePwd.sendKeys("Range@56");
		WebElement eleBday = driver.findElement(By.name("birthday_day"));
		Select dropDown1=new Select(eleBday);
		dropDown1.selectByValue("30");
		WebElement eleBmon = driver.findElement(By.name("birthday_month"));
		Select dropDown2=new Select(eleBmon);
		dropDown2.selectByValue("7");
		WebElement eleByear = driver.findElement(By.name("birthday_year"));
		Select dropDown3=new Select(eleByear);
		dropDown3.selectByValue("1995");
		WebElement eleRaFe = driver.findElement(By.xpath("//input[@value='1']"));
		eleRaFe.click();
		
	}

}
