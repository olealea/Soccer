package soccer;

import utility.GameUtils;

public class Game {
   public Team homeTeam;
   public Team awayTeam;
   public Goal[] goals;

   public void playGame(int max_goals) {
      //Create an array containing a random number of goals (but <max) && use Math.random (why *, +1 ?!?!?!)
      int nrGoals = (int) (Math.random() * max_goals + 1);
      Goal[] goals = new Goal[nrGoals];
      this.goals = goals;

      //call GameUtil's addGameGoals() method && use proper import
      GameUtils.addGameGoals(this);
   }

   //Override the playGame method to no arg method
   public void playGame() {
      playGame(6);
   }

   //Mathod that prints statistics for each goal scored
   public String getStatistics() {
      StringBuilder sb = new StringBuilder();
      System.out.println("");
      for (Goal goal : goals) {
         System.out.println("The player " + goal.player.player_name + " of "
                 + goal.team.team_name + " marked a goal on minute " + goal.time);
      }
      return sb.toString();
   }
}
