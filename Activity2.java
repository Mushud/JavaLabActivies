import java.util.Scanner;

/**
 * Activity2
 */
public class Activity2 {
    
    private static  final int  CLOTHING_CODE = 1;
    private static final int  OTHER_TYPE =2;

    private static final String CLOTHING_PRICER = "Regina";
    private static final String OTHER_PRICER = "Marco"; 
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Sacks Fifth Avenue");
        System.out.println("Which are you donating to?");
        System.out.println("Choose 1 for Clothing Donation and 2 for any other donation type: ");

        int donationType = scanner.nextInt();
        checkDonationType(donationType);
        
        scanner.close();
    }

    public static void checkDonationType(int donationType) {
        if(donationType == CLOTHING_CODE){
            System.out.println(CLOTHING_PRICER + " handles such donations");
            System.out.println("Thank You");
        }else if (donationType == OTHER_TYPE){
            System.out.println(OTHER_PRICER + " handles such donations");
        } else 
            System.out.println("Invalid Donation Type \n Thank You");
    }
}