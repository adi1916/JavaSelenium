package Testcases.various_examples.Amazon;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;


public class amazon_1_AjaxHover {

	@Test
	public void TC1_AjaxHover() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\IdeaImportModules\\chromedriver95\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://amazon.com/");

		Actions myAction = new Actions(driver);
		WebElement moveMouse = driver.findElement(By.cssSelector("a[id = nav-link-accountList]"));

		myAction.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("Adrian").build().perform();
		myAction.moveToElement(moveMouse).build().perform();



	}
}
