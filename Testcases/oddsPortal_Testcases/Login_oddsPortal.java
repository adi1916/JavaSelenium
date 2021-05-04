package oddsPortal_Testcases;

//loginpage: https://www.oddsportal.com/login/
//user: adigithub
//pass: github_test_pass
//TODO -> read the credentials from an input file and
// -> make a method to read a certain user and extract the credentials from that file

import objectsRepoOddsPortal.LoginOddsPortalPOM;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Login_oddsPortal {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\dj25m\\SeleniumDrivers\\chromedriver_90.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.oddsportal.com/login/");

        LoginOddsPortalPOM loginPage=new LoginOddsPortalPOM(driver);
        loginPage.username().sendKeys("adigithub");
        loginPage.password().sendKeys("github_test_pass");
        Thread.sleep(4000);

        //loginPage.submitButton().click();
        //Thread.sleep(4000);
//TODO-> submit does not work, maybe page is detecting Selenium and blocking it

//trying to use explicit Wait
        WebDriverWait explicitWait = new WebDriverWait(driver, 20);
        WebElement loggedInPage;
        loggedInPage= explicitWait.until(ExpectedConditions.elementToBeClickable(By.className("inline-btn-2")));
       System.out.println(loggedInPage);
        // loggedInPage.click();

        //RediffHomepage rh=new RediffHomepage(driver);
        //rh.Search().sendKeys("rediff");
        //rh.Submit().click();


        //driver.close();
    }
}
