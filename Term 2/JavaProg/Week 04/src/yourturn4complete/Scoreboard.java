package yourturn4complete;

public class Scoreboard {

    private String homeTeamName;
    private String visitingTeamName;
    private int homeTeamScore;
    private int visitingTeamScore;

    public Scoreboard(String homeTeamName, String visitingTeamName) {
        this.homeTeamName = homeTeamName;
        this.visitingTeamName = visitingTeamName;
        homeTeamScore = 0;
        visitingTeamScore = 0;
    }

    public String getHomeTeamName()
    {
        return homeTeamName;
    }

    public String getVisitingTeamName()
    {
        return visitingTeamName;
    }

    public int getHomeTeamScore()
    {
        return homeTeamScore;
    }

    public int getVisitingTeamScore()
    {
        return visitingTeamScore;
    }

    public void addHomeTeamGoal()
    {
        homeTeamScore++;
    }

    public void addVisitingTeamGoal()
    {
        visitingTeamScore++;
    }

    public String getScore()
    {
        String returnString = homeTeamName + ": " + homeTeamScore + "   " + visitingTeamName + ": " + visitingTeamScore;
        return returnString;
    }
}
