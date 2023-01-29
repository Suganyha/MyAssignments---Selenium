package week2.Day1Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LoadingBrowser {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();	
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Democsr");  
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");   
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click(); 
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click(); 
		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click(); 
		driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click(); 
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Zoho");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Suganyha");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Viswanathan");
		WebElement element = driver.findElement(By.xpath("//select[@id='createLeadForm_dataSourceId']"));
		Select dd= new Select(element);
		 dd.selectByValue("Lead_Conference");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		

	}

}
