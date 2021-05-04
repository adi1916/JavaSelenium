package objectsRepoOddsPortal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginOddsPortalPOM {
    WebDriver driver;
    public LoginOddsPortalPOM(WebDriver driver) {
        this.driver=driver;
    }

    By username=By.xpath(".//*[@id='login-username1']");
    By Password=By.name("login-password");
    By submitButton=By.className("inline-btn-2");
    By home=By.linkText("Home");

    public WebElement username()
    {
        return driver.findElement(username);
    }
    public WebElement password()
    {
        return driver.findElement(Password);
    }
    public WebElement submitButton()
    {
        return driver.findElement(submitButton);
    }
    public WebElement homePage()
    {
        return driver.findElement(home);
    }
}