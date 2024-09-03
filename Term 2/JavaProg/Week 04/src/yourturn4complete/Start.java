package yourturn4complete;

public class Start {
    public static void main(String[] args)
    {

        /*⁡⁢⁣⁢Read Me!⁡
          Write the code that will make the code below compile and give an output of:
        
          Leafs: 2   Canadians: 1
         */

        Scoreboard board = new Scoreboard("Leafs", "Canadians");
        board.addHomeTeamGoal();
        board.addHomeTeamGoal();
        board.addVisitingTeamGoal();
        System.out.println(board.getScore());
    }
}
