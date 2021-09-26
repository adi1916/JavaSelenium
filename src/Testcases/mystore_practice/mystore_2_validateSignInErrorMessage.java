package Testcases.mystore_practice;

import objectRepository.mystore_practice.mystoreIndexPage;
import objectRepository.mystore_practice.mystoreSignInPage;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertTrue;


public class mystore_2_validateSignInErrorMessage {

	@Test
	public void TC1_validateSignInErrorMessage()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\IdeaImportModules\\chromedriver93\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");

		mystoreIndexPage idx=new mystoreIndexPage(driver);
		idx.SignIn().click();

		mystoreSignInPage login=new mystoreSignInPage(driver);
		login.EmailAddress().sendKeys("Hello");
		login.Password().sendKeys("Hello");
		login.SubmitLogin().click();


		String returnedError = login.SignInAlert().getText();
		assertTrue(returnedError.contains("Invalid email address"));
	}


}
