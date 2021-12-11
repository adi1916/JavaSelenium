package Testcases.course_examples;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;


public class course_11_assignment {

	@Test
	public void TC11_assignment() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\IdeaImportModules\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("checkBoxOption1")).click();

		List<WebElement> allCheckboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));

		for(WebElement myIterator:allCheckboxes){
			if (myIterator.isSelected())
			{
				System.out.println(myIterator.getAttribute("value") + " - " + myIterator.getAttribute("name") + " :" + myIterator.isSelected());
				String myOption = myIterator.getAttribute("value");
				Select mySelect = new Select(driver.findElement(By.id("dropdown-class-example")));
				mySelect.selectByValue(myOption);
				driver.findElement(By.id("name")).sendKeys(myOption);
				driver.findElement(By.id("alertbtn")).click();
				System.out.println(driver.switchTo().alert().getText());
				String theAlertText = driver.switchTo().alert().getText();
				driver.switchTo().alert().dismiss();
				Assert.assertEquals(theAlertText, "Hello " + myOption + ", share this practice page and share your knowledge" );
			}
		}
	}
}
