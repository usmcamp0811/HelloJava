/**
 * Created by mcamp on 7/8/17.
 */
public class Object2StringMain {

    public static void main(String[] args) {
        Object2String constructer = new Object2String(4,5,6);
        Object2String2 stringsObject = new Object2String2("Matt", constructer);

        System.out.println(stringsObject);
    }
}
