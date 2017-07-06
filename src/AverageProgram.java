/**
 * Created by mcamp on 7/5/17.
 */
import java.util.Scanner;

class AverageProgram {
    public static void main(String[] args) {
        System.out.println("Input 10 grades to return an average grade:");
        Scanner input = new Scanner(System.in);
        int total = 0;
        int grade;
        int average;
        int counter = 0;

        while (counter < 10){
            grade = input.nextInt();
            total = total + grade;
            counter++;
        }
        average = total/10;
        System.out.println("Your average is " + average);
    }

}
