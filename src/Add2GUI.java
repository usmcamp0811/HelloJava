/**
 * Created by mcamp on 7/8/17.
 */
import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;

public class Add2GUI {
    public static void main(String[] args){

        String fn = JOptionPane.showInputDialog("Enter first number.");
        String sn = JOptionPane.showInputDialog("Enter second number.");

        int num1 = Integer.parseInt(fn);
        int num2 = Integer.parseInt(sn);
        int sum = num1 + num2;

        JOptionPane.showMessageDialog(
                null,
                "The answer is " + sum,
                "Add Two",
                JOptionPane.PLAIN_MESSAGE);


    }
}
