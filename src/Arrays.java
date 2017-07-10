/**
 * Created by mcamp on 7/8/17.
 */
import java.util.Random;


public class Arrays {
    public static void main(String[] args) {
        int test_array[] = new int[10]; // the 10 is the size of the array

        test_array[0] = 87;
        test_array[1] = 33;
        test_array[9] = 65;

        System.out.println(test_array[0]);

//        Array initializer
        int test_array2[] = {2, 5, 6, 7, 8};

//        Array Table
        System.out.println("Index\tValue");

        for(int counter=0;counter<test_array2.length;counter++) {
            System.out.println(counter + "\t\t" + test_array2[counter]);
        }


        int sum = 0;
        double avg;


        for(int counter=0;counter<test_array.length;counter++){
            sum += test_array[counter];

        }
        avg = sum / test_array.length;
        System.out.println("The sum of test_array is " + sum + " and the average is " + avg);


        Random rand = new Random();
        int freq[]=new int[7];

        for(int roll=1;roll<1000;roll++){
            ++freq[1+rand.nextInt(6)];
        }

        System.out.println("Face\tFrequency");
        for(int counter=1;counter<freq.length;counter++){
            System.out.println(counter + "\t\t" + freq[counter]);
        }

        int matt[] = {323,324,5,5,67,8,9};
        int total=0;

        for(int x: matt){
            total += x;
        }
        System.out.println("Original Array total:");
        System.out.println(total);

        add5(matt);

        total=0;

        for(int x: matt){
            total += x;
        }
        System.out.println("New Array total:");
        System.out.println(total);


        System.out.println("Multi-dimensional Arrays");
        int firstarray[][] = {{1,23,4,56,7,8,9},{3,42,5,6,7,31,2}};
        int secondarray[][] = {{30,23,443,5}, {434,3}, {4,5,6}};

        System.out.println("Printing the firstarray");
        display(firstarray);

        System.out.println("");

        System.out.println("Printing the secondarray");
        display(secondarray);

        System.out.println("Average of some numbers: " + average(5.3 ,54.5, 54.53, 23, 45));




    }

    public static void add5(int x[]){
        for(int counter=0;counter<x.length;counter++)
            x[counter]+=5;
    }

    public static void display(int x[][]){
        for(int row=0;row<x.length;row++){
            for(int col=0;col<x[row].length;col++){
                System.out.print(x[row][col]+"\t");
            }
            System.out.println(); // for putting each row on a new line
        }
    }

    public static double average(double...numbers){
        double total=0;
        for(double x:numbers)
            total+=x;
        return total/ numbers.length;
    }
}
