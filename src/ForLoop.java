/**
 * Created by mcamp on 7/5/17.
 */
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

    }
}
