package objectsRepoOddsPortal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeagueTwoStandingsPF {
    //final int seasonYearStart[] = {2019, 2018, 2017, 2016, 2015, 2014, 2013, 2012, 2011, 2010, 2009, 2008, 2007, 2006, 2005, 2004, 2003, 2002, 2001, 2000, 1999, 1998};
    final int seasonYearStart[] = {2000, 1999, 1998};
    final String listTableHeaderNames[] = {"col_rank", "col_participant_name", "col_matches_played", "col_wins_regular", "col_draws", "col_losses_regular", "col_goals", "col_points"};

    WebDriver driver;
    public LeagueTwoStandingsPF(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText="MAIN")
    WebElement mainPage;

    @FindBy(linkText="STANDINGS")
    WebElement standingsPage;

    public WebElement standingsPage()
    {
        return standingsPage;
    }
    public WebElement mainPage()
    {
        return mainPage;
    }
    public int[] seasonYearStartList()
    {
        return seasonYearStart;
    }
    public String[] listTableHeaderNames()
    {
        return listTableHeaderNames;
    }
}