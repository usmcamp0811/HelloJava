/**
 * Created by mcamp on 7/8/17.
 */
public class FinalMain {
    public static void main(String[] args) {
        Final finalObject = new Final(10);

        for(int i=0; i<5;i++){
            finalObject.add();
            System.out.printf("%s", finalObject);
//            finalObject.NUMBER = 15;  <<-- cant do this
        }
    }
}
