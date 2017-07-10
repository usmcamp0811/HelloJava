import java.util.Random;

/**
 * Created by mcamp on 7/8/17.
 */
public class Time {
    private int hour;
    private int minute;
    private int second;

//    overloading constructers...
    public Time(){
        this(0,0,0);
    }
    public Time(int h){
        this(h,0,0);
    }
    public Time(int h, int m){
        this(h,m,0);
    }
    public Time(int h, int m, int s){
        setTime(h,m,s);
    }

    public void setTime(int h, int m, int s){
        setHour(h);
        setMinute(m);
        setSecond(s);
    }

    public void setHour(int h) {
        hour = ((h>=0 && h<24) ? h : 0);
    }

    public void setMinute(int m) {
        minute = ((m>=0 && m<60) ? m : 0);
    }

    public void setSecond(int s) {
        second = ((s>=0 && s<60) ? s : 0);
    }

    public int getHour(){
        return hour;
    }
    public int getMinute(){
        return minute;
    }
    public int getSecond(){
        return second;
    }

    public String to24hrClock(){
        return String.format("%02d:%02d:%02d", hour, minute, second);

    }

    public String to12hrClock(){
        String AM_PM = ((hour>=12)? "PM":"AM");
        hour = ((hour==0||hour==12)? 12:hour%12);
        return String.format("%d:%02d:%02d %s", hour, minute, second, AM_PM);
    }

    public void setRandomTime(){
        Random rand = new Random();

        int h = rand.nextInt(24);
        int m = rand.nextInt(60);
        int s = rand.nextInt(60);

        setTime(h,m,s);
    }




}
