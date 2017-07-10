/**
 * Created by mcamp on 7/8/17.
 */
public class Object2String {
    private int month;
    private int day;
    private int year;

    public Object2String(int m, int d, int y){
        month = m;
        day = d;
        year = y;

        System.out.printf("The constructor for this %s\n", this);
    }

    public String toString(){
        return String.format("%d/%d/%d", month, day, year);
    }
}
