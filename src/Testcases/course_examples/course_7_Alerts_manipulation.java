package Testcases.course_examples;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class course_7_Alerts_manipulation {

	@Test
	public void TC7_Alerts_manipulation () throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\IdeaImportModules\\chromedriver93\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(2000);

		driver.findElement(By.id("name")).sendKeys("Adi Dinu");
		driver.findElement(By.cssSelector("[id='alertbtn']")).click();
		String alertText = driver.switchTo().alert().getText();
		Assert.assertTrue(alertText.contains("Adi Dinu"));
		Thread.sleep(3000);
		driver.switchTo().alert().accept();

		driver.findElement(By.id("confirmbtn")).click();
		Thread.sleep(3000);
		alertText = driver.switchTo().alert().getText();
		Assert.assertFalse(alertText.contains("Adi Dinu"));
		driver.switchTo().alert().dismiss();

	}
}
