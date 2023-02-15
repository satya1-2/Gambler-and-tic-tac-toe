package gambler;


 class Gamblingucbuilder {
    int STAKE_PER_DAY = 100;
    int BET_PER_GAME = 1;

    public int winLoose() {
        return (int) (Math.floor(Math.random() * 2) + 1);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to gambling simulation");
        Gamblingucbuilder gamble = new Gamblingucbuilder();
        int winLoose = gamble.winLoose();
        int gambler_Amount = 0;
        if (winLoose == 1) {
            System.out.println(winLoose + " You win the bet");
            gambler_Amount++;
        } else {
            System.out.println(winLoose + " You loose the bet");
            gambler_Amount--;
        }

    }
}