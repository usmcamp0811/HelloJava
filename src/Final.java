/**
 * Created by mcamp on 7/8/17.
 */
public class Final {
    private int sum;
//    Constants are in CAPS
//    you cant modify final variables
//    can set value here with NUMBER = X or in the constuctor
//    private final int NUMBER = 44;
    private final int NUMBER;

    public Final(int x){
        NUMBER = x;
    }
    public void add(){
        sum+=NUMBER;
    }
    public String toString(){
        return String.format("sum = %d\n", sum);
    }
}
