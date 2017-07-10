/**
 * Created by mcamp on 7/8/17.
 */
public class StaticVars {
    private String fname;
    private String lname;
    private static int members = 0;

    public StaticVars(String fn, String ln){
        fname = fn;
        lname = ln;
        members++;
        System.out.printf("Constructor for %s %s, members in the group: %d\n", fname, lname, members);
    }

    public String getFname(){
        return fname;
    }

    public String getLname(){
        return lname;
    }

    public static int getMembers(){
        return members;
    }
}
