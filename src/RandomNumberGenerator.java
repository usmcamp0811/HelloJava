/**
 * Created by mcamp on 7/5/17.
 */
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class RandomNumberGenerator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("What is the lower bound for the random number? ");
        int min = input.nextInt();

        System.out.println("What is the upper bound for the random number? ");
        int max = input.nextInt();

        System.out.println("How many numbers do you want generated? ");
        int totalNumber = input.nextInt();

        Random random = new Random();

        IntStream stream = random.ints(totalNumber, min, max);
        stream.forEach(System.out::println);

    }
}
