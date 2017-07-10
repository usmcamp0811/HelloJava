/**
 * Created by mcamp on 7/9/17.
 */
public class Polymorphism {
    public static void main(String[] args) {
//        InheritanceParent test = new InheritanceB();
    InheritanceParent polymorphic_variable[] = new InheritanceParent[2];
    polymorphic_variable[0] = new InheritanceA();
    polymorphic_variable[1] = new InheritanceB();

    for(int x=0;x<2;++x){
        polymorphic_variable[x].food();
    }

    System.out.println("\n\n\nPolymorphic return arguments.... \n");
    PolymorphismExtra example = new PolymorphismExtra();

    InheritanceParent foo = new InheritanceParent();
    InheritanceA bar = new InheritanceA();
    example.digest(foo);
    example.digest(bar);

    }



}
