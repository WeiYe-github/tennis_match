public class Player {

    private String play;
    private int bigScore;
    private int smallScore;
    private int count=0;

    public Player() {
    }

    public Player(String play, int bigScore, int smallScore, int count) {
        this.play = play;
        this.bigScore = bigScore;
        this.smallScore = smallScore;
        this.count = count;
    }

    public String getPlay() {
        return play;
    }

    public void setPlay(String play) {
        this.play = play;
    }

    public int getBigScore() {
        return bigScore;
    }

    public void setBigScore(int bigScore) {
        this.bigScore = bigScore;
    }

    public int getSmallScore() {
        return smallScore;
    }

    public void setSmallScore(int smallScore) {
        this.smallScore = smallScore;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
