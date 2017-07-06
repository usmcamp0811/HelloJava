/**
 * Created by mcamp on 7/6/17.
 */
public class SwitchUp {
    public static void main(String[] args) {
        int grade = 85;

        int tempgrade = grade / 10;
        switch(tempgrade) {
            case 10:
            case 9:
                System.out.println('A');
                break;
            case 8:
                System.out.println('B');
                break;
            case 7:
                System.out.println('C');
                break;
            case 6:
                System.out.println('D');
                break;
            default:
                System.out.println('F');
        }
    }
}
