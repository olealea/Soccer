package soccer;

public class League {
    public static void main(String[] args) {
        //Instantiate a League Object
        League league = new League();

        //Create games and teams through methods
        Team[] teams = league.createTeams();
        Game[] games = league.createGames(teams);

        //Play a game and print the description (statistics)
        Game game = games[0];
        game.playGame();
        System.out.println(game.getStatistics());
    }

    //Method to create two teams
    private Team[] createTeams() {
        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();
        Player player4 = new Player();
        Player player5 = new Player();
        Player player6 = new Player();

        player1.player_name = "Prutean Eugeniu";
        player2.player_name = "Popovici Valentina";
        player3.player_name = "Petrov Anastasia";
        player4.player_name = "Darii Olga";
        player5.player_name = "Davidich Eric";
        player6.player_name = "Dante Aligheri";

        //Instantiate and name two teams
        Team team1 = new Team();
        Team team2 = new Team();

        team1.team_name = "Pelmeni";
        team2.team_name = "Dumplings";

        //Assign each member to a team
        team1.team_roster = new Player[]{player1, player2, player3};
        team2.team_roster = new Player[]{player4, player5, player6};

        Team[] teams = {team1, team2};
        return teams;
    }

    //Method that creates a game
    private Game[] createGames(Team[] teams) {
        Game game = new Game();
        game.homeTeam = teams[0];
        game.awayTeam = teams[1];
        Game[] games = {game};
        return games;
    }
}

