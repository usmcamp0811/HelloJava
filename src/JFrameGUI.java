/**
 * Created by mcamp on 7/8/17.
 */
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JFrameGUI extends JFrame {

    private JLabel item1;

    public JFrameGUI() {
//        adds title
        super("The title bar");
//        Gives default layout
        setLayout(new FlowLayout());

        item1 = new JLabel("This is a sentece.");
        item1.setToolTipText("This is a mouse over box");
        add(item1);



    }

}
