public class Game {
    //instance variables
    private String gameName;
    private int players;
    private int score;

    public Game(String name, int numOfPlayers){
        this.gameName = name;
        this.players = numOfPlayers;
        score = 0;
    }

    public void addPlayer(){
        players++;
    }

    public void increaseScore(int increase){
        score += increase;
    }
    public double averageScorePerPlayer(){
        double average = (double) score/players;
        return average;
    }

    public boolean isGameOver(){
        if (score>9){
            return true;
        }else{
            return false;
        }
    }
//all the gets
    public int getScore() {
        return score;
    }

    public int getPlayers() {
        return players;
    }

    public String getGameName() {
        return gameName;
    }
}
