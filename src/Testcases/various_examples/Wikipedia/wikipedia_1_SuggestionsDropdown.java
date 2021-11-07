package Testcases.various_examples.Wikipedia;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class wikipedia_1_SuggestionsDropdown {

	@Test
	public void TC1_SuggestionsDropdown() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\IdeaImportModules\\chromedriver93\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://en.wikipedia.org/");

		driver.findElement(By.xpath("//input[@id='searchInput']")).sendKeys("Giannis");
		Thread.sleep(2000);
		List<WebElement> searchOptions = driver.findElements(By.cssSelector("div[class='suggestions-results'] a"));
		for (WebElement searchIt: searchOptions){
			if(searchIt.getAttribute("title").equalsIgnoreCase("Giannis Antetokounmpo") ){
				searchIt.click();
				break;
			}
		}

	}
}
