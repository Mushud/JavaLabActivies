

import java.awt.Container;

import javax.swing.JApplet;
import javax.swing.JLabel;

/**
 * JGreet
 */
public class JGreet extends JApplet {

    Container cont = getContentPane();
    JLabel greet = new JLabel("Greetings!");
    public void init(){
        cont.add(greet); 
    }
}