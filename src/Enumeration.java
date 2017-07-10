/**
 * Created by mcamp on 7/8/17.
 */
//Enumerations are constants that are also objects

public enum Enumeration {
    matt("Java Student", "32"),
    bryant("Java Master", "30"),
    tony("Marine", "38"),
    candace("Wife", "30"),
    mark("Boss", "38"),
    suzie("Godl standard of dogs", "8");

    private final String desc;
    private final String year;

//    Enumeration Constructer
    Enumeration(String description, String age){
        desc = description;
        year = age;
    }

    public String getDesc(){
        return desc;
    }

    public String getYear(){
        return year;
    }



}
