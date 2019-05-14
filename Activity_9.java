import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.*;

public class Activity_9 extends JFrame implements ActionListener {
    String movingQuote = new String("Hello Graphics");
    JButton moveButton = new JButton("Click Me!");
    int x= 10, y=50;
    final int gap=20, size=400;

    public Activity_9()
    {
        Container con = getContentPane();
        con.setBackground(Color.BLACK
        );
        con.setLayout(new FlowLayout());
        con.add(moveButton);
        moveButton.addActionListener(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(size,size);
    }
    public void actionPerformed(ActionEvent e)
    {
        Graphics pen= getGraphics();
        pen.setColor(Color.WHITE);
        pen.drawString(movingQuote, x+=gap, y+=gap);
    }
    public static void main (String args[])
    {
        Activity_9 dexoangle= new Activity_9();
        dexoangle.setVisible(true);
        dexoangle.setSize(800,600);
        dexoangle.setResizable(false);

    }

}
