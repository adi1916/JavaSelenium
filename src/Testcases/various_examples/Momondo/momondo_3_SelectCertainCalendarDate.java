package Testcases.various_examples.Momondo;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;
import java.util.Set;


public class momondo_3_SelectCertainCalendarDate {

	@Test
	public void TC3_SelectCertainCalendarDate() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\IdeaImportModules\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://momondo.com");

		try{
			Thread.sleep(2000);
		}
		catch(InterruptedException ie){
		}

		//by-pass conditions acceptance pop-up
		driver.findElement(By.xpath("//button[@title='Accept']")).click();

		//click on Calendar
		driver.findElement(By.xpath("//div[@class='zEiP-formField zEiP-dates']")).click();

		//select all Calendar days
		List<WebElement> myDates = driver.findElements(By.cssSelector("div[class='mkUa mkUa-pres-default']"));
		int myCount = driver.findElements(By.cssSelector("div[class='mkUa mkUa-pres-default']")).size();
		System.out.println("Number of days= " + myCount);


	}


}

