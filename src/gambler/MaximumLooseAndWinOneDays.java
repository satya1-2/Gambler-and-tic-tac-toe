package gambler;

public class MaximumLooseAndWinOneDays {
        public static int STAKE_PER_DAY = 100;
        public static int BET_PER_GAME = 1;
        public double winLoose() {
            return Math.random();
        }
        public static void main(String[] args) {
            MaximumLooseAndWinOneDays  gamble = new MaximumLooseAndWinOneDays ();
            double winLoose;
            int totalDays = 30;
            int endValue=0;
            int win=0,loss=0;

            double totalWin = 0, totalloss = 0;

            int maximum = 0, minimum = 0, playAgain = 0;
            int amount = STAKE_PER_DAY;
            while (totalDays>endValue) {
                winLoose = gamble.winLoose();
                System.out.println("win or loose : " + winLoose);
                if (winLoose < 0.5) {
                    amount++;

                    while (playAgain == 0) {
                        while (totalDays > endValue) {
                            winLoose = gamble.winLoose();
                            System.out.println("win or loose : " + winLoose);
                            if (winLoose < 0.5) {
                                amount++;
                                win++;
                                totalWin += amount;
                                System.out.println("win");
                            } else {
                                amount--;
                                loss++;
                                totalloss += amount;
                                System.out.println("loss");
                            }
                            totalDays--;
                        }
                        System.out.println("Amount = " + amount);
                        System.out.println("Wins = " + win + "  Loss = " + loss);
                        if (win > loss) {
                            System.out.println("won by : " + (totalWin - totalloss));
                        } else {
                            amount--;

                            System.out.println("Lost by : " + (totalloss - totalWin));
                        }
                        totalDays--;
                    }System.out.println("Amount = " + amount);
                    System.out.println("Maximum amount won: " + totalWin + " on day " + win);
                    System.out.println("Minimum amount loss: " + totalloss + " on day " + loss);
                    return;
                }
            }
        }

    }
