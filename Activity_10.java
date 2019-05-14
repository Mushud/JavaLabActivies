//Start Java code

import javax.swing.*;
import java.awt.*;

public class JGreet extends JApplet {
    Container cont = getContentPane();
    JLabel greet = new JLabel("Greetings!");
    public void init(){
        cont.add(greet); 
    }
}

//End of java code


//HTML code for applet

<html lang="en">
    <object code="JGreet.class" width="450" height="100"></object>
</html>
