/**
 * Created by mcamp on 7/8/17.
 */
import javax.swing.JFrame;


public class JFrameGUImain {

    public static void main(String[] args) {

        JFrameGUI window = new JFrameGUI();
//        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(275,180);
        window.setVisible(true);

        EventHandling interactiveWindow = new EventHandling();
        interactiveWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        interactiveWindow.setSize(350, 100);
        interactiveWindow.setVisible(true);

    }
}
