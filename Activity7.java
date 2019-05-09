/**
 * Activity7
 */

import java.util.*;

import javax.swing.JOptionPane;

public class Activity7 {

    public static void main(String[] args) {
        Scanner scan  = new Scanner (System.in);
        int numerator, denominator;
        int quotient;

        try {
            String s = JOptionPane.showInputDialog(null, "Enter the numator");
            numerator = Integer.parseInt(s);
            s = JOptionPane.showInputDialog(null, "Enter the denominator");
            denominator = Integer.parseInt(s);

            quotient = numerator / denominator;

            JOptionPane.showMessageDialog(null, numerator + " / " + denominator +" = "+ quotient, "Quotient", 1);
        } catch (ArithmeticException e) {
             System.out.println("Exception");
            JOptionPane.showMessageDialog(null ,"Answer = " +0, e.getLocalizedMessage(), 1);
        }
       

        scan.close();
    }
}