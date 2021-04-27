package oddsPortal_Testcases;

//loginpage: https://www.oddsportal.com/login/
//user: adigithub
//pass: github_test_pass
//TODO -> read the credentials from an input file and
// -> make a method to read a certain user and extract the credentials from that file

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_oddsPortal {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\dj25m\\SeleniumDrivers\\chromedriver_90.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.oddsportal.com/soccer/england/league-two/standings/");
        //TODO -> create loginpagePOM for oddsPortal
    }
}
