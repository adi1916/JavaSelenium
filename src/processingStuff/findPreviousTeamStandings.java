package processingStuff;

import objectsRepository.LeagueTwoStandingsPF;
import objectsRepository.teamResult;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class findPreviousTeamStandings {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Adi\\SeleniumDrivers\\chromedriver_88.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.oddsportal.com/soccer/england/league-two/standings/");
        LeagueTwoStandingsPF iterateOnPage=new LeagueTwoStandingsPF(driver);
        HashMap<Integer, List<teamResult> > fullYear = new HashMap<Integer, List<teamResult>>();

        for (int iteratorSeasonYearStart : iterateOnPage.seasonYearStartList()) {
            String searchForSeason = iteratorSeasonYearStart + "/" + StringUtils.leftPad(String.valueOf((iteratorSeasonYearStart % 100 + 1) % 100), 2, "0");
            //examples: 2001/00, 2000/01
            WebElement element = driver.findElement(By.linkText(searchForSeason));
            element.click();

            String currentUrl = driver.getCurrentUrl();
            driver.get(currentUrl);

            List<WebElement> listCheck =   driver.findElements(By.linkText("MAIN"));
            if (listCheck.size() > 0) {
                element = iterateOnPage.mainPage(); ;
            } else {
                element = iterateOnPage.standingsPage();
            }
            element.click();

            currentUrl = driver.getCurrentUrl();
            driver.get(currentUrl);

            //wait for page to load and find desired elements
            driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

            HashMap<String, List<WebElement> > columnStandings = new HashMap<String, List<WebElement>>();
            int noOfTeams = 0;
            for (String iteratorClassName : iterateOnPage.listTableHeaderNames()) {
                columnStandings.put(iteratorClassName, driver.findElements(By.className(iteratorClassName)));
                noOfTeams =  driver.findElements(By.className(iteratorClassName)).size();
            }


            List<teamResult> yearStandings = new ArrayList<teamResult>();
            //set values for all teams in a year
            for (int i = 1; i < noOfTeams; i++) {
                //set all characteristics for a certain team in Standings
                teamResult rowTeam = new teamResult(iteratorSeasonYearStart);

                for (String iteratorClassName : iterateOnPage.listTableHeaderNames()) {
                    List<WebElement> listIterator = columnStandings.get(iteratorClassName);
                    rowTeam.setProperty(iteratorClassName, listIterator.get(i).getText()  );
                }
                yearStandings.add(rowTeam);
            }
            System.out.println(yearStandings);
            //add yearStandings to all years result
            fullYear.put(iteratorSeasonYearStart, yearStandings);
        }

    }
}