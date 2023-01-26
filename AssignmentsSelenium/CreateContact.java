package AssignmentsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();	
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Democsr");  
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");   
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click(); 
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click(); 
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create Contact')]")).click();
		driver.findElement(By.xpath("//input[@id='firstNameField']")).sendKeys("Suganyha");
		driver.findElement(By.xpath("//input[@id='lastNameField']")).sendKeys("Viswanathan");
		driver.findElement(By.xpath("//input[@id='createContactForm_firstNameLocal']")).sendKeys("sugu");
		driver.findElement(By.xpath("//input[@id='createContactForm_lastNameLocal']")).sendKeys("Viswa");
		driver.findElement(By.xpath("//input[@id='createContactForm_departmentName']")).sendKeys("CSE");
		driver.findElement(By.xpath("//textarea[@id='createContactForm_description']")).sendKeys("Automation");
		driver.findElement(By.xpath("//input[@id='createContactForm_primaryEmail']")).sendKeys("sugu@gmail.com");
		WebElement element = driver.findElement(By.xpath("//select[@id='createContactForm_generalStateProvinceGeoId']"));
		Select dd= new Select(element);
		 dd.selectByValue("NY");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		driver.findElement(By.xpath("//a[@class='subMenuButton']")).click();
		driver.findElement(By.xpath("//textarea[@id='updateContactForm_description']")).clear();
		driver.findElement(By.xpath("//textarea[@id='updateContactForm_importantNote']")).sendKeys("Learn Automation");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		System.out.println(driver.getTitle());
		
		
	}

}
