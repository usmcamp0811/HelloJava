/**
 * Created by mcamp on 7/5/17.
 */
import java.util.ArrayList;

public class ForLoop {
    public static void main(String[] args) {
        System.out.println("Start at 1m goto 10, count by 1");
        for(int counter=1;counter<=10;counter++) {
            System.out.println(counter);
        }
        System.out.println("\nStart at 7, goto 21, count by 3");
        for(int counter=7;counter<=21;counter+=3) {
            System.out.println(counter);
        }
        Integer x, y;
        System.out.println("\nLoop through two different variables");
        for(x = 0, y = 0; y <= 20; x++, y +=2) {
            System.out.println(x + ", " + y);
        }
        System.out.println("\nIteration over an ArrayList of integers");
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        for(Integer i : list){
            System.out.println(i);
        }
        String hello = "Iteration over a String of words.";
        System.out.println("\n" + hello);
        for (char c : hello.toCharArray()) {
            System.out.println(c);
        }

    }
}
