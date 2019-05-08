import java.util.Scanner;

/**
 * Activity5
 */
public class Activity5 extends Party{

    public static void main(String[] args) {
        int guests;
        Party party = new Party();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number of Guests");
        guests = scan.nextInt();
        party.setNumberOfGuests(guests);

        System.out.println("Number of guests " + guests);
        party.displayPartyInvitation();

        scan.close();
    }
}