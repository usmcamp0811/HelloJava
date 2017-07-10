package Class2HoldObjects;

/**
 * Created by mcamp on 7/9/17.
 */
public class AnimalList {
//This array can only hold 5 unique objects.. change 5 if you have more things to hold..
    private Animal[] thelist = new Animal[5];
    private int i = 0;

    public void add(Animal a){
        if(i<thelist.length){
            thelist[i] = a;
            System.out.println("Animal added at index " + i);
            i++;
        }
    }

}
