import javax.swing.*;

public class hello {
    public static int rollDice(int n) {

        int dice1 = n();
        int dice2 = n();
        int count = 1;
        while (!(dice1 == dice2)) {
            dice1 = n();
            dice2 = n();
            count = count + 1;
        }
            return count;
        }
        public static void main(String args[]) {
        int player1 = rollDice(6);
        int player2 = rollDice(6);
        System.out.println("player1 " +player1);
        System.out.println("player2 " +player2);

}
}



