package gambler;

public class WinOrLoose50Persent {
    public int winLoose() {
        return (int) (Math.floor(Math.random() * 2) + 1);
    }
//    public int winLoose() {
//        return (int) (Math.floor(Math.random() * 2) + 1);
//    }

    public static void main(String[] args) {
        int STAKE_PER_DAY = 100;
        int BET_PER_GAME = 1;
        WinOrLoose50Persent gamble = new WinOrLoose50Persent();
        int winLoose = gamble.winLoose();
        int gambler_Amount = 0;
        if (winLoose == 1) {
            System.out.println(winLoose + " You win the bet");
            System.out.println(STAKE_PER_DAY+1  );
            gambler_Amount++;
        } else {
            System.out.println(winLoose + " You loose the bet");
            System.out.println(STAKE_PER_DAY-1);
            gambler_Amount--;
        }
        //  Gamblingucbuilder gamble = new Gamblingucbuilder();
        // int winLoose = gamble.winLoose();
        int winamount = 0;
        winLoose = 0;
        for (winamount = 0; winamount <= 50; winamount++){
            winLoose = (int) (Math.floor(Math.random() * 2) + 1);

            if (winLoose == 1) {
                System.out.println(winLoose + " You win the bet");
                winLoose++;

            } else {
                System.out.println(winLoose + " You loose the bet");
                winLoose--;

            }

        }
    }
}