package AssignmentsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LeafGroundAssignments {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml");
		driver.manage().window().maximize();	
		driver.findElement(By.xpath("//input[@placeholder='Babu Manickam']")).sendKeys("Suganyha");
		driver.findElement(By.xpath("//input[@value='Chennai']")).sendKeys("Coimbatore");
		WebElement ele = driver.findElement(By.xpath("//input[@disabled='disabled']"));
		ele.isDisplayed();
		driver.findElement(By.xpath("//input[@value='Can you clear me, please?']")).clear();
		driver.findElement(By.xpath("//input[@value='Can you clear me, please?']")).clear();
		WebElement space = driver.findElement(By.xpath("//input[@placeholder='Your email and tab']"));
		space.sendKeys("sugu@gmail.com");
		space.sendKeys(Keys.TAB);
		driver.findElement(By.xpath("(//div[@class='ql-editor ql-blank'])[1]"));
		WebElement text = driver.findElement(By.xpath("(//input[@class='ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all'][@name='j_idt106:thisform:age'])"));
		text.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='j_idt106:float-input']")).click();
		driver.findElement(By.xpath("//input[@name='j_idt106:auto-complete_input']")).click();
		driver.findElement(By.xpath("//input[@class='ui-inputfield ui-keyboard-input ui-widget ui-state-default ui-corner-all is-keypad']")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@title='Close the keypad']")).click();
		driver.findElement(By.xpath("//div[@data-placeholder='Enter your content']")).click();
		driver.get("https://www.leafground.com/button.xhtml");
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		driver.get("https://www.leafground.com/button.xhtml");
		driver.findElement(By.xpath("//button[@disabled='disabled']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h5[text()='Find the position of the Submit button']//..//button")).click();
		driver.get("https://www.leafground.com/radio.xhtml");
		WebElement country = driver.findElement(By.xpath("//label[text()='Select Country']"));
		Select countries = new Select(country);
		countries.selectByValue("India");
		driver.get("https://www.leafground.com/checkbox.xhtml");
		driver.findElement(By.xpath("//span[text()='Basic']")).click();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.findElement(By.xpath("//span[@class='ui-radiobutton-icon ui-icon ui-c ui-icon-bullet']")).click();
		
	}

}
