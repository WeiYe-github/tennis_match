
public class Main{

    public static void main(String[] args) {
        Match match = new Match();
        Player player1 = new Player();
        Player player2 = new Player();
        player1.setPlay("player1");
        player2.setPlay("player2");

        //test
        match.pointWonByFirst(player1,player2);
        System.out.println(match.score(player1,player2));

        match.pointWonByFirst(player2,player1);
        System.out.println(match.score(player1,player2));

        match.pointWonByFirst(player1,player2);
        match.pointWonByFirst(player1,player2);
        System.out.println(match.score(player1,player2));

        match.pointWonByFirst(player2,player1);
        System.out.println(match.score(player1,player2));

        match.pointWonByFirst(player2,player1);
        System.out.println(match.score(player1,player2));

        match.pointWonByFirst(player1,player2);
        System.out.println(match.score(player1,player2));

        match.pointWonByFirst(player1,player2);
        System.out.println(match.score(player1,player2));
    }


}
