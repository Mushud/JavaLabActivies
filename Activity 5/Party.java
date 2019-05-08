/**
 * Party
 */
public class Party {

    private int numberofGuests;

    public  void setNumberOfGuests(int n){
        this.numberofGuests = n;
    }

    public int getNumberofGuests(){
        return this.numberofGuests;
    }

    public void displayPartyInvitation(){
        System.out.println("You've been invited");
    }


}