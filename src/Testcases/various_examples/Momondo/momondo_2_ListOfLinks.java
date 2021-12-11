package Testcases.various_examples.Momondo;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;
import java.util.Iterator;
import java.util.List;
import java.util.Set;


public class momondo_2_ListOfLinks {

	@Test
	public void TC2_ListOfLinks() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\IdeaImportModules\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://momondo.com");

		try{
			Thread.sleep(2000);
		}
		catch(InterruptedException ie){
		}

		driver.findElement(By.xpath("//button[@title='Accept']")).click();


		System.out.println("Number of links on page = " + driver.findElements(By.xpath("//a")).size() );

		WebElement footerDriver = driver.findElement(By.tagName("footer"));

		System.out.println("Number of links in footer = " + footerDriver.findElements(By.tagName("a")).size() );

		List<WebElement> allLinksFooter = footerDriver.findElements(By.tagName("a"));

		//Traversing through the list and printing its text along with link address
		for(WebElement link:allLinksFooter){
			System.out.println(link.getText() + " - " + link.getAttribute("href"));
		}

		//check links are opening 1 by 1 in new tab
		for(int i=0; i < footerDriver.findElements(By.tagName("a")).size(); i++)
		{
			String clickOnLinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			footerDriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkTab);
			//Thread.sleep(2000);
		}

		//get Title name of each opened tab
		Set<String> allTabs = driver.getWindowHandles();
		Iterator<String> myIterator = allTabs.iterator();

		while(myIterator.hasNext())
		{
			driver.switchTo().window(myIterator.next());
			System.out.println(driver.getTitle());
		}
	}


}

