import java.util.Scanner;

public class example {

    // Write a program to create an application in which the user enters two values
    // to be divided. The
    // application catches an exception if either of the entered values is not an
    // integer

    public static void main(String[] args) {
        int n1, n2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter values n1, n2 respectively");
        try {
            n1 = scanner.nextInt();
            n2 = scanner.nextInt();
            System.out.println(n1 / n2);
        } catch (Exception e) {
            System.out.print("Invalid input entered, please enter an integer");

        }

        scanner.close();

    }
}
