package Testcases.mystore_practice;

import objectRepository.mystore_practice.mystoreIndexPage;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.assertTrue;


public class mystore_5_staticDropdown {

	@Test
	public void TC5_validateIdentifyElementByText()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\IdeaImportModules\\chromedriver93\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		mystoreIndexPage idx=new mystoreIndexPage(driver);
		idx.DressesCategory().click();

		WebElement staticDropdown = driver.findElement(By.xpath("//*[@id='selectProductSort']"));
		Select dropdown = new Select(staticDropdown);

		String dropdownValue = dropdown.getFirstSelectedOption().getText();
		assertTrue(dropdownValue.equals("--"));

	}


}
