package Class2HoldObjects;

/**
 * Created by mcamp on 7/9/17.
 */
public class ExampleMain {
    public static void main(String[] args){
// An array if we only had one thing to hold ever..
        DogList doglistObject = new DogList();
        Dog d = new Dog();
        doglistObject.add(d);
//An array if we wanted to store any type of animal..
        AnimalList animallistObject = new AnimalList();
        Fish f = new Fish();
        animallistObject.add(d);
        animallistObject.add(f);
    }



}
