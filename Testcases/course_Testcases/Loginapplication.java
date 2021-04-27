package course_Testcases;

import course_PageObjectModel.RediffHomepage;
import course_PageObjectModel.RediffLoginpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Loginapplication {
// Login page class implemented in normal page object pattern style
	
	// Home page class implemented in Page object factory methdos
	@Test
	public void Login()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dj25m\\SeleniumDrivers\\chromedriver_90.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		RediffLoginpage rd=new RediffLoginpage(driver);
		rd.Emaild().sendKeys("hello");
		rd.Password().sendKeys("hello");
		//rd.submit().click();
		rd.newAccount().click();
		//RediffHomepage rh=new RediffHomepage(driver);
		//rh.Search().sendKeys("rediff");
		//rh.Submit().click();
		
	}
	
}
