package Testcases.course_examples;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class course_8_assignmentExplicitwait {

	@Test
	public void TC8_assignmentExplicitwait () throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\IdeaImportModules\\chromedriver94\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.itgeared.com/demo/1506-ajax-loading.html");

		driver.findElement(By.xpath("//a[contains(text(),'Ajax')]")).click();

		WebDriverWait w = new WebDriverWait(driver,5);
		w.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Ajax')]")));

		String textToPrint = driver.findElement(By.xpath("//div[@id = 'results']")).getText();
		System.out.print(textToPrint);

	}
}
