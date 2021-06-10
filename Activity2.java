import java.util.Scanner;

/**
 * Activity2
 */
public class Activity2 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Sacks Fifth Avenue");
        System.out.println("Which are you donating to?");
        System.out.println("Choose 1 for Clothing Donation and 2 for any other donation type: ");

        int donationType = scanner.nextInt();
        if(donationType == 1){
            System.out.println("Reginina handles such donations");
            System.out.println("Thank You");
        }else if (donationType == 2){
            System.out.println("Marko handles such donations");
        } else 
            System.out.println("Invalid Donation Type \n Thank You");
        
        scanner.close();
    }

   
}
