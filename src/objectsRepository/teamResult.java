package objectsRepository;

import org.openqa.selenium.WebElement;

public class teamResult {
    int seasonYearStart;
    String rank;
    String teamName;
    int matchesPlayed;
    int wins;
    int draws;
    int losses;
    String goals;
    int points;

    public teamResult(int seasonYearStart,
                      String rank,
                      String teamName,
                      int matchesPlayed,
                      int wins,
                      int draws,
                      int losses,
                      String goals,
                      int points)
    {
        // "Season_year_start", "Rank", "Team_name", "Matches_played", "Wins", "Draws", "Losses", "Goals", "Points"
        this.seasonYearStart = seasonYearStart;
        this.rank = rank;
        this.teamName = teamName;
        this.matchesPlayed = matchesPlayed;
        this.wins = wins;
        this.draws = draws;
        this.losses = losses;
        this.goals = goals;
        this.points = points;
    }

    public teamResult(){
    }

    public teamResult(int iterator){
        this.seasonYearStart = iterator;
    }

    public void setProperty(String iterator, String value){
        switch (iterator) {
            case "col_rank":
                this.rank = value;
                break;
            case "col_participant_name":
                this.teamName = value;
                break;
            case "col_matches_played":
                this.matchesPlayed = Integer.parseInt(value);
                break;
            case "col_wins_regular":
                this.wins = Integer.parseInt(value);
                break;
            case "col_draws":
                this.draws = Integer.parseInt(value);
                break;
            case "col_losses_regular":
                this.losses = Integer.parseInt(value);
            case "col_goals":
                this.goals = value;
                break;
            case "col_points":
                this.points = Integer.parseInt(value);
                break;
        }
    }

}
