package Testcases.mystore_practice;

import objectRepository.mystore_practice.mystoreIndexPage;
import objectRepository.mystore_practice.mystoreSignInPage;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertTrue;


public class mystore_3_validateSearchParentChild {

	@Test
	public void TC1_validateSignInErrorMessage()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\IdeaImportModules\\chromedriver93\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");

		mystoreIndexPage idx=new mystoreIndexPage(driver);
		idx.DressesCategory().click();
		driver.findElement(By.xpath("//ul[contains(@class,'product_list')]/li[2]/div/div/div/a/img")).click();
		String returnedProduct = driver.findElement(By.xpath("//p[@id='product_reference']/span")).getText();
		assertTrue(returnedProduct.contains("demo_4"));
	}


}
