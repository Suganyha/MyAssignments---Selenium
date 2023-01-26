package AssignmentsSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

		@SuppressWarnings("deprecation")
		public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@class='_6ltg']/a")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Suganyha");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Viswanathan");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9600939992");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("test12test12A");
		WebElement days = driver.findElement(By.xpath("//select[@id='day']"));
		Select dates = new Select(days);
		dates.selectByValue("7");
		WebElement months = driver.findElement(By.xpath("//select[@id='month']"));
		Select month = new Select(months);
		month.selectByValue("12");
		WebElement years = driver.findElement(By.xpath("//select[@id='year']"));
		Select year = new Select(years);
		year.selectByValue("1994");
		driver.findElement(By.xpath("//input[@name='sex'][@value='1']")).click();
		}

}
