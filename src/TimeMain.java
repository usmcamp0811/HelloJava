/**
 * Created by mcamp on 7/8/17.
 */
import java.util.Random;

public class TimeMain {
    public static void main(String[] args) {
        Time timeObject = new Time();

        System.out.println("Default 24hr Time: " + timeObject.to24hrClock());
        System.out.println("Default 12hr Time: " + timeObject.to12hrClock());
        System.out.println("\nSetting random time...");
        timeObject.setRandomTime();
        System.out.println("\nRandom time on a 24hr Clock: " + timeObject.to24hrClock());
        System.out.println("\nRandom time on a 12hr Clock: " + timeObject.to12hrClock());


    }
}
