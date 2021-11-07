package Testcases.Momondo;

import objectRepository.mystore_practice.mystoreIndexPage;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.Assert.assertTrue;


public class momondo_1_Dropdown {

	@Test
	public void TC1_Dropdown()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\IdeaImportModules\\chromedriver93\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://momondo.com");

		try{
			Thread.sleep(2000);
		}
		catch(InterruptedException ie){
		}
		driver.findElement(By.xpath("//button[contains(@id,'accept')]")).click();

		WebElement Dropdown = driver.findElement(By.xpath("//*[@class='S9tW-chevron']"));
		Dropdown.click();


	}


}

