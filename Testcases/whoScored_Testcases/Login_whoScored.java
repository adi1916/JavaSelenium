package whoScored_Testcases;

//loginpage: https://www.whoscored.com/Accounts/Login
//user: adigithub
//pass: github_test_pass
//TODO -> read the credentials from an input file and
// -> make a method to read a certain user and extract the credentials from that file

import objectsRepoWhoScored.LoginWhoScoredPOM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_whoScored {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\dj25m\\SeleniumDrivers\\chromedriver_90.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.whoscored.com/Accounts/Login");

        LoginWhoScoredPOM loginPage=new LoginWhoScoredPOM(driver);
        loginPage.username().sendKeys("adigithub");
        loginPage.password().sendKeys("github_test_pass");
        Thread.sleep(4000);

        loginPage.submitButton().submit();
        //Thread.sleep(4000);
//TODO-> submit does not work, maybe page is detecting Selenium and blocking it

        //RediffHomepage rh=new RediffHomepage(driver);
        //rh.Search().sendKeys("rediff");
        //rh.Submit().click();


        //driver.close();
    }
}
