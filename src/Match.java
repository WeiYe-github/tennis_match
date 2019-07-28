public class Match {


    public Match() {
    }

    public void pointWonByFirst(Player player1,Player player2){
        int[] scoreArray ={0,15,30,40};
        int count = player1.getCount();
        ++count;
        player1.setCount(count);
        if(count <= 3) {
            player1.setSmallScore(scoreArray[count]);
            player1.setCount(count);
            return;
        }
        if(count >= 4 && (count - player2.getCount()>=2) ){
            player1.setSmallScore(0);
            player2.setSmallScore(0);
            player1.setCount(0);
            player2.setCount(0);
            player1.setBigScore(player1.getBigScore()+1);
            return;
        }
    }

    public String score(Player player1,Player player2){
        if (player1.getCount() >= 3 && ( player1.getCount() == player2.getCount() ))
            return player1.getBigScore() + "-" + player2.getBigScore() + ",Deuce";
        if (player1.getCount() > 3 && ( player1.getCount() - player2.getCount() ==1 ) )
            return player1.getBigScore() + "-" + player2.getBigScore() + ",Advantage " + player1.getPlay();
        return player1.getBigScore() + "-" + player2.getBigScore() + "," + player1.getSmallScore() + "-" + player2.getSmallScore();
    }
}
