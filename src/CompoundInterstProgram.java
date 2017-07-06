/**
 * Created by mcamp on 7/5/17.
 */
import java.util.Scanner;
// This class will compute compound interest by first asking the user for some inputs
// Then output the interest for each time step up to the last time step.
public class CompoundInterstProgram {
    public static void main(String[] args) {
//        A=P(1+R)^t
        double amount;
        System.out.println("Enter the principal:");
        Scanner input = new Scanner(System.in);
        double principal = input.nextDouble();

        System.out.println("Enter the rate:");
//        Scanner R_input = new Scanner(System.in);
        double rate = input.nextDouble();

        System.out.println("Enter the time:");
//        Scanner T_input = new Scanner(System.in);
        double time = input.nextDouble();

        for(int period=1;period<=time;period++){
            amount = principal*Math.pow(1 + rate, period);
            System.out.println(period + "  $" + amount);
        }
    }
}
