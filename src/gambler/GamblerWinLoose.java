package gambler;

public class GamblerWinLoose {

        int STAKE_PER_DAY = 100;
        int BET_PER_GAME = 1;
        public int winLoose() {
            return (int) (Math.floor(Math.random() * 2) + 1);
        }
        public static void main(String[] args) {
            int STAKE_PER_DAY = 100;
            int BET_PER_GAME = 1;
            GamblerWinLoose gamble = new GamblerWinLoose();
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
}}
