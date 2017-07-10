package GUIExamples;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * Created by mcamp on 7/9/17.
 */
public class GUI extends JFrame{

    private JButton regularButton;
    private JButton customButton;

    public GUI(){

        super("JFrame Constructor Title");
        setLayout(new FlowLayout());

        regularButton = new JButton("Regular Button");
        add(regularButton);

        Icon eureka = new ImageIcon(getClass().getResource("Eureka_Icon.png"));
        Icon hank = new ImageIcon(getClass().getResource("New_Hank_Joke-icon.png"));
        customButton = new JButton("Custom", hank);
        customButton.setRolloverIcon(eureka);
        add(customButton);

        HandlerClass handler = new HandlerClass();
        regularButton.addActionListener(handler);
        customButton.addActionListener(handler);

    }

    private class HandlerClass implements ActionListener{

        public void actionPerformed(ActionEvent event){
            JOptionPane.showMessageDialog(null, String.format("%s", event.getActionCommand()));
        }
    }

}
