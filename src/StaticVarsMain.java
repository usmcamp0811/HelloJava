/**
 * Created by mcamp on 7/8/17.
 */
public class StaticVarsMain {
    public static void main(String[] args){
        StaticVars member1 = new StaticVars("Matt","Camp");
        StaticVars member2 = new StaticVars("Dwight","Temple");
        StaticVars member3 = new StaticVars("Mark","Poole");
        StaticVars member4 = new StaticVars("Bryant","Golay");

        System.out.println();
        System.out.println(member1.getFname());
        System.out.println(member1.getLname());
        System.out.println(member1.getMembers());

        System.out.println();
        System.out.println(member2.getFname());
        System.out.println(member2.getLname());
        System.out.println(member2.getMembers());

//        for static methods you can do this...
        System.out.println("\nMembers of the group: " + StaticVars.getMembers());

    }
}
