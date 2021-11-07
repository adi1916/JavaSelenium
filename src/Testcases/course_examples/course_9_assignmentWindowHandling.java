package Testcases.course_examples;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Iterator;
import java.util.Set;


public class course_9_assignmentWindowHandling {

	@Test
	public void TC9_assignmentWindowHandling () throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\IdeaImportModules\\chromedriver95\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");

		driver.findElement(By.linkText("Multiple Windows")).click();
		driver.findElement(By.linkText("Click Here")).click();
		Set<String> openedWindows = driver.getWindowHandles(); //[parentid,childid,subchildId]
		Iterator<String> myIterator = openedWindows.iterator();
		String parentWindowId = myIterator.next();
		String childWindowId = myIterator.next();
		driver.switchTo().window(childWindowId);
		System.out.println(driver.findElement(By.cssSelector("h3")).getText());

		driver.switchTo().window(parentWindowId);
		System.out.println(driver.findElement(By.cssSelector("h3")).getText());

	}
}
