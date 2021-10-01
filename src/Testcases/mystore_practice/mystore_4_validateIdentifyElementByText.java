package Testcases.mystore_practice;

import objectRepository.mystore_practice.mystoreIndexPage;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertTrue;


public class mystore_4_validateIdentifyElementByText {

	@Test
	public void TC4_validateIdentifyElementByText()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\IdeaImportModules\\chromedriver93\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");

		mystoreIndexPage idx=new mystoreIndexPage(driver);
		idx.DressesCategory().click();
		driver.findElement(By.xpath("//*[contains(text(),'Printed Chiffon Dress')]")).click();
	}


}
