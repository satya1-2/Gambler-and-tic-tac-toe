package gambler;

public class After20DaysCalculatingWin {
    public static int STAKE_PER_DAY = 100;
    public static int BET_PER_GAME = 1;

    public double winLoose() {
        return Math.random();
    }

    public static void main(String[] args) {
        int STAKE_PER_DAY = 100;
        int BET_PER_GAME = 1;

        int winamount = 0;
        int WinLoose = 0;
        for (winamount = 0; winamount <= 50; winamount++) {
            WinLoose = (int) (Math.floor(Math.random() * 2) + 1);

            if (WinLoose == 1) {
                System.out.println(WinLoose + " You win the bet");
                WinLoose++;
                After20DaysCalculatingWin gamble = new After20DaysCalculatingWin();
                int totalDays = 20;
                int endValue = 0;
                int win = 0, loss = 0;
                int amount = STAKE_PER_DAY;
                while (totalDays > endValue) {
                    double winLoose = gamble.winLoose();
                    System.out.println("win or loose : " + winLoose);
                    if (winLoose < 0.5) {
                        amount++;

                    } else {
                        System.out.println(winLoose + " You loose the bet");
                        winLoose--;
                        amount--;

                    }

                }
                totalDays--;
                System.out.println("Amount = " + amount);
            }
        }
    }
}