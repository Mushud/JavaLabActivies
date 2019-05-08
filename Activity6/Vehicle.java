

import java.util.*;

/**
 * Vehicle
 */
public class Vehicle {
    int power;
    int numberOfWheels;
    double coverage;

    double price;

    public Vehicle (int power, int numberOfWheels){
        this.power = power;
        this.numberOfWheels = numberOfWheels;
    }

    public void setPrice(){
       int giveAccess = 0;

       while(giveAccess == 0){
           Scanner scan = new Scanner(System.in);
           System.out.println("Enter the price of Vehicle: ");
           
           double price = scan.nextDouble();
           if(price < 60000){
               this.price = price;
               giveAccess = 1;
               break;
           }
           System.out.println("Price can't be more than 600000");
            
           scan.close();
       }
    }

}