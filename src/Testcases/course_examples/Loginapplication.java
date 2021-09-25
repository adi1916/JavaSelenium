package Testcases.course_examples;

import objectRepository.course_examples.RediffHomepage;
import objectRepository.course_examples.RediffLoginpage;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Loginapplication {
// Login page class implemented in normal page object pattern style
	
	// Home page class implemented in Page object factory methdos
	@Test
	public void Login()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Adi\\IdeaImportModules\\chromedriver93\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		RediffLoginpage rd=new RediffLoginpage(driver);
		rd.Emaild().sendKeys("hello");
		rd.Password().sendKeys("hello");


		//rd.submit().click();
		rd.Home().click();
		RediffHomepage rh=new RediffHomepage(driver);
		rh.Search().sendKeys("rediff");
		rh.Submit().click();

		
	}
}