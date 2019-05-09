import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * Activity8
 */
public class Activity8 {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Frame with Components");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(500, 500));
        
        JLabel label = new JLabel("Welcome, This is label");
        label.setBounds(30, 10, 400, 10);

        JButton button = new JButton("Hello");
        button.setBounds(30, 30, 100, 40);
       
        frame.add(label);
        frame.add(button);
        frame.setLayout(null);
        frame.setVisible(true);
        
    }
}