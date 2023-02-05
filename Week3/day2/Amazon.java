package Week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();

		List<Integer> test = new ArrayList<Integer>();

		driver.get("https://amazon.in");
		driver.manage().window().maximize();
		WebElement Amazon = driver.findElement(By.id("twotabsearchtextbox"));
		Amazon.sendKeys("Phone");
		Amazon.sendKeys(Keys.ENTER);
		List<WebElement> elements = driver.findElements(By.className("a-price-whole"));
		for (WebElement ele : elements) {
			String replacedValue = ele.getText().replaceAll(",", "");
			System.out.println(replacedValue);
			if (!replacedValue.isEmpty()) {
				int parseInt = Integer.parseInt(replacedValue);
				test.add(parseInt);
			}

		}
		Collections.sort(test);
		System.out.println("The min is:" + test.get(0));

	}

}
