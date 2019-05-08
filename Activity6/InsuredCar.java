

/**
 * InsuredCar
 */
public class InsuredCar extends Vehicle implements Insured {

    

    public InsuredCar(int power, int numberoFWheels){
        super(power, numberoFWheels);
        setPrice();
        setCoverage();
    }
    @Override
    public double getCoverage() {
        return this.coverage;
    }

    @Override
    public void setCoverage() {
        coverage = 0.9 * price;
    }

   
    @Override
    public String toString() {
        String all = "The Amount of the car is Ghc" + price +"\nThe car's Power is "+ power + "\nNumber of Wheels is " + numberOfWheels
                        + "\nThe percentage price is "+ getCoverage();
        return all;
    }



    
}