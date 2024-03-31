package unit_1;


 interface Sports{
    public void start();
    public void displayScore();
    public void stop();
}

class Badminton implements Sports{
    int maxScore = 30; String player1, player2;
    int p1Score,p2Score,result;
    boolean won=false,start=false;
    public Badminton(String player1, String player2){
        this.player1 = player1;
        this.player2 = player2;
    }

    @Override
    public void start() {
        System.out.println("Starting Match Between "+player1+" and "+player2);
        this.start = true;
    }
    public void displayResult(){
        if (result == 1){
            System.out.println(player1 + "Won by "+p1Score+":"+p2Score);
        }
        else if(result ==2){
            System.out.println(player2+ "Won by "+p2Score+":"+p1Score);
        }
    }

    public void increaseScore(int player ,int score){
        if (!won && start) {
            if (player == 1) {
                this.p1Score += score;
                if (this.p1Score >= maxScore) {
                    System.out.println(player1 + "Won by "+p1Score+":"+p2Score);
                    result = 1;
                    won = true;
                }
            } else if (player == 2) {
                this.p2Score += score;
                if (this.p2Score >= maxScore) {
                    System.out.println(player2 + "Won");
                    result = 2;
                    won = true;
                }
            }
        }
        else if (won){
            System.out.println("The Game is Already Over");
        }
        else if (!start){
            System.out.println("Match has not Started yet!");
        }
    }




    @Override
    public void displayScore() {
        System.out.println(player1+":"+player2);
        System.out.println(p1Score+":"+p2Score);
    }

    @Override
    public void stop() {
        this.start = false;
        result = p1Score>p2Score?1:2;
        this.displayResult();

    }
}
public class InterfaceExample {
    public static void main(String[] args) {
        Badminton match = new Badminton("Harry","Hermione");
        match.start();
    }

}
