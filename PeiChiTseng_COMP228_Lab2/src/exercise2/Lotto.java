package exercise2;


import javax.swing.JOptionPane;
import java.util.Random;

public class Lotto {
    private int[] number = new int[3];

    public Lotto() {
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            number[i] = random.nextInt(9)+1;
        }
    }

    public int[] getNumbers() {
        return number;
    }

    public int getSum(){
        return number[0] + number[1] + number[2];
    }
}
