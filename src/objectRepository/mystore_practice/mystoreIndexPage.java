package objectRepository.mystore_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class mystoreIndexPage {

	WebDriver driver;
	public mystoreIndexPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

  @FindBy(id="search_query_top")
  WebElement search;
  
  @FindBy(xpath="//button[@type='submit']")
  WebElement submit;
    public WebElement Search()
    {
    	return search;
    }
   
    public WebElement Submit()
    {
    	return submit;
    }
	
}
