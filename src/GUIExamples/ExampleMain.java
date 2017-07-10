package GUIExamples;
import javax.swing.JFrame;
/**
 * Created by mcamp on 7/9/17.
 */
public class ExampleMain {
    public static void main(String[] args){

        GUI run = new GUI();
        run.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        run.setSize(300, 200);
        run.setVisible(true);
    }

}
