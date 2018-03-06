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
    public Team[] createTeams() {
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

        Team[] theTeams = {team1, team2};
        return theTeams;
    }

    //Method that creates a game
    public Game[] createGames(Team[] teams) {
        Game game = new Game();
        game.homeTeam = teams[0];
        game.awayTeam = teams[1];
        Game[] games = {game};
        return games;
    }

//        System.out.println("Members of "+team1.team_name+":");
//        for (Player player : team1.team_roster){
//            System.out.println(player.player_name);
//        }
//        System.out.println("");
//        System.out.println("Members of "+team2.team_name+":");
//        for (Player player : team2.team_roster){
//            System.out.println(player.player_name);
//        }

//        //Create three goals and assign them player, time and team
//        Goal goal1 = new Goal();
//        Goal goal2 = new Goal();
//        Goal goal3 = new Goal();
//
//        goal1.player = game.homeTeam.team_roster[0];
//        goal1.team = game.homeTeam;
//        goal1.time = 10.00;
//
//        goal2.player = game.awayTeam.team_roster[0];
//        goal2.team = game.awayTeam;
//        goal2.time = 30.00;
//
//        goal3.player = game.awayTeam.team_roster[2];
//        goal3.team = game.awayTeam;
//        goal3.time = 45.00;
//
//        Goal goals[] = new Goal[]{goal1, goal2, goal3};
//        game.goals = goals;
//
//        //search for the *Olg*
//        System.out.println("");
//        for (Player player : team2.team_roster) {
//            if (player.player_name.matches(".*Olg.")) {
//                System.out.println("Found " + player.player_name);
//            }
//        }
//
//        //display members of a team required way
//        for (Player player : team1.team_roster){
//            String first_name = player.player_name.substring(player.player_name.indexOf(" "));
//            String last_name = player.player_name.substring(0, player.player_name.indexOf(" "));
//            System.out.println(first_name+", "+last_name);
//        }

        //another method
        //Lastname, Firstname
//        StringBuilder familyNameFirst = new StringBuilder();
//        for (Player thePlayer: team1.playerArray)
//            String[] name = thePlayer.playerName.split(" ");
//            familyNameFirst.append(name[1]);
//            familyNameFirst.append(", ");
//            familyNameFirst.append(name[0]);
//            System.out.println(familyNameFirst);
//            familyNameFirst.delete(0,familyNameFirst.length());
       }

