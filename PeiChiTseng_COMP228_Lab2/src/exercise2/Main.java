package exercise2;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int userNumber = Integer.parseInt(JOptionPane.showInputDialog(null, "Choose a number between 3 and 27:", "Lotto Game", JOptionPane.QUESTION_MESSAGE));
        int maxRolls = 5;
        boolean userWins = false;

        for (int i = 0; i < maxRolls; i++) {
            Lotto lotto = new Lotto();
            int sum = lotto.getSum();
            String message = "Lotto numbers: " + lotto.getNumbers()[0] + ", " + lotto.getNumbers()[1] + ", " + lotto.getNumbers()[2] + "\nSum: " + sum;
            JOptionPane.showMessageDialog(null, message, "Lotto Roll " + (i + 1), JOptionPane.INFORMATION_MESSAGE);

            if (userNumber == sum) {
                userWins = true;
                JOptionPane.showMessageDialog(null, "You win!", "Lotto Game", JOptionPane.INFORMATION_MESSAGE);
                break;
            }
        }

        if (!userWins) {
            JOptionPane.showMessageDialog(null, "You didn't win!", "Lotto Game", JOptionPane.INFORMATION_MESSAGE);
        }
    }

}
