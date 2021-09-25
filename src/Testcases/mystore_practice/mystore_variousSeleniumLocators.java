package Testcases.mystore_practice;

import objectRepository.mystore_practice.mystoreIndexPage;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class mystore_variousSeleniumLocators {

	@Test
	public void selectWebElements()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Adi\\IdeaImportModules\\chromedriver93\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");

		mystoreIndexPage idx=new mystoreIndexPage(driver);
		idx.Search().sendKeys("I want to search someth");
		//rd.Password().sendKeys("hello");


		//rd.submit().click();
		//rd.Home().click();
		//RediffHomepage rh=new RediffHomepage(driver);
		//rh.Search().sendKeys("rediff");
		//rh.Submit().click();

		
	}
}
