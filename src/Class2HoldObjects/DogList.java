package Class2HoldObjects;

/**
 * Created by mcamp on 7/9/17.
 */
public class DogList {
    private Dog[] thelist = new Dog[5];
    private int i=0;

    public void add(Dog d){
        if(i<thelist.length){
            thelist[i]=d;
            System.out.println("Dog added at index " + i);
            i++;
        }
    }
}
