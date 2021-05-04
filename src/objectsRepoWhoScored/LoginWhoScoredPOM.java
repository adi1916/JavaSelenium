package objectsRepoWhoScored;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginWhoScoredPOM {
    WebDriver driver;
    public LoginWhoScoredPOM(WebDriver driver) {
        this.driver=driver;
    }

    By username=By.xpath(".//*[@id='usernameOrEmailAddress']");
    By Password=By.name("password");
    By submitButton=By.name("login");

//TODO-> how do you read <a href="/"> ?
//By home=By.linkText("Home");
// public WebElement homePage()
// {
//     return driver.findElement(home);
// }

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

}