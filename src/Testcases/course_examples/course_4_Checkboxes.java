package Testcases.course_examples;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class course_4_Checkboxes {

	@Test
	public void TC4_Checkboxes() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\IdeaImportModules\\chromedriver93\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Thread.sleep(2000);
		Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).click();

		List<WebElement> allCheckboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));

		Assert.assertEquals(allCheckboxes.size(), 6 );
		/*
		for (WebElement aCheckbox: allCheckboxes){
			aCheckbox.click();
			Thread.sleep(1000);
			}
		 */

	}
}
