package week2.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	

		public static void main(String[] args) { {
			
			ChromeDriver driver = new ChromeDriver();
			
			driver.get("http://leaftaps.com/opentaps/control/login");
			driver.manage().window().maximize();	
			driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.linkText("CRM/SFA")).click();
			driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.linkText("Create Lead")).click();
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Zoho");
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Suganyha");
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Viswanathan");
			driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("sugu");
			driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Computerscience");
			driver.findElement(By.id("createLeadForm_description")).sendKeys("Learn Selenium");
			driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("suganyhaviswanathan@gmail.com");
			driver.findElement(By.className("smallSubmit")).click();
			driver.findElement(By.linkText("Edit")).click();
			driver.findElement(By.id("updateLeadForm_description")).clear();
			driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Learn Automation");
			driver.findElement(By.className("smallSubmit")).click();
			System.out.println(driver.getTitle());
			
			

		
		}

	}

}
