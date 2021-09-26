package objectRepository.mystore_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class mystoreSignInPage {

	WebDriver driver;
	public mystoreSignInPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

    @FindBy(css="#email")
    WebElement emailAddress;

    @FindBy(xpath="//input[@id='passwd']")
    WebElement password;

    @FindBy(css="#SubmitLogin")
    WebElement submitLogin;

    @FindBy(xpath = "//div[@class='alert alert-danger']")
    WebElement signInAlert;



    public WebElement EmailAddress()
    {
        return emailAddress;
    }

    public WebElement Password()
    {
        return password;
    }

    public WebElement SubmitLogin()
    {
        return submitLogin;
    }

    public WebElement SignInAlert()
    {
    return signInAlert;
    }

}
