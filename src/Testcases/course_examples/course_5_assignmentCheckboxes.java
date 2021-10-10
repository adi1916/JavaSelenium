package Testcases.course_examples;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class course_5_assignmentCheckboxes {

	@Test
	public void TC5_assignmentCheckboxes() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\IdeaImportModules\\chromedriver93\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id*='checkBoxOption1']")).click();
		Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id*='checkBoxOption1']")).click();
		Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());

		List<WebElement> allCheckboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		Assert.assertEquals(allCheckboxes.size(), 3 );
		/*
		for (WebElement aCheckbox: allCheckboxes){
			aCheckbox.click();
			Thread.sleep(1000);
			}
		 */

	}
}
