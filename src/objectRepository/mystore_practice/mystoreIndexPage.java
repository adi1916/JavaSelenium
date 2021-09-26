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

    @FindBy(linkText="Specials")
    WebElement linkSpecials;

    @FindBy(css=".sf-menu > li:nth-child(2) > a:nth-child(1)")
    WebElement DressesCategory;

    @FindBy(className="login")
    WebElement signIn;

    public WebElement Search()
    {
    	return search;
    }
   
    public WebElement Submit()
    {
    	return submit;
    }

    public WebElement linkSpecials()
    {
        return linkSpecials;
    }

    public WebElement DressesCategory()
    {
        return DressesCategory;
    }

    public WebElement SignIn()
    {
        return signIn;
    }
}
