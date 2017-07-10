/**
 * Created by mcamp on 7/8/17.
 */
public class Object2String2 {
    private String name;
    private Object2String birthday;

    public Object2String2(String theName, Object2String theDate){
        name = theName;
        birthday = theDate;

    }

    public String toString(){
        return String.format("My name is %s, my birthday is %s", name, birthday);
    }
}
