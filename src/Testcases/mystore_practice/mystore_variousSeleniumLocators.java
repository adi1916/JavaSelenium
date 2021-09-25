package Testcases.mystore_practice;

import objectRepository.mystore_practice.mystoreIndexPage;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class mystore_variousSeleniumLocators {

	@Test
	public void TC1_selectWebElementById()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\IdeaImportModules\\chromedriver93\\chromedriver.exe");
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

	@Test
	public void TC2_selectWebElementByXpath()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\IdeaImportModules\\chromedriver93\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");

		mystoreIndexPage idx=new mystoreIndexPage(driver);
		idx.Search().sendKeys("chiffon");
		idx.Submit().click();

		//rd.Password().sendKeys("hello");


		//
		//rd.Home().click();
		//RediffHomepage rh=new RediffHomepage(driver);
		//rh.Search().sendKeys("rediff");
		//rh.Submit().click();


	}

	@Test
	public void TC3_selectWebElementByLinkText()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\IdeaImportModules\\chromedriver93\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");

		mystoreIndexPage idx=new mystoreIndexPage(driver);
		idx.linkSpecials().click();

		//rd.Password().sendKeys("hello");


		//
		//rd.Home().click();
		//RediffHomepage rh=new RediffHomepage(driver);
		//rh.Search().sendKeys("rediff");
		//rh.Submit().click();


	}

	@Test
	public void TC4_selectWebElementByCss()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\IdeaImportModules\\chromedriver93\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");

		mystoreIndexPage idx=new mystoreIndexPage(driver);
		idx.DressesCategory().click();

		//rd.Password().sendKeys("hello");


		//
		//rd.Home().click();
		//RediffHomepage rh=new RediffHomepage(driver);
		//rh.Search().sendKeys("rediff");
		//rh.Submit().click();


	}
}
