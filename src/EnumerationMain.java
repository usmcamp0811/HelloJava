/**
 * Created by mcamp on 7/8/17.
 */
import java.util.EnumSet;

public class EnumerationMain {
    public static void main(String[] args){
//        loops through the constants
        for(Enumeration people: Enumeration.values())
            System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getYear());

        System.out.println("\nAnd now for the range of constants!!!\n");

        for(Enumeration people: EnumSet.range(Enumeration.tony, Enumeration.mark))
            System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getYear());
    }

}
