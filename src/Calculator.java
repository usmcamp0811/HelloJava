import java.util.Scanner;


public class Calculator {
	public static void main(String args[]){
		Scanner calc = new Scanner(System.in);
		double num1, num2, answer;
		System.out.println("Enter First Number:");
		num1 = calc.nextDouble();
		System.out.println("Enter Second Number:");
		num2 = calc.nextDouble();
		System.out.print("Answer:");
		System.out.println(num1 + num2);
	}
}
