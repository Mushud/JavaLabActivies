import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Activity3
 */
public class Activity3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] quizScores  = new double[10];

        System.out.println("Enter the number of Scores: ");
        int scores = input.nextInt();
        int total =0;
        
        if(scores <= 10){
            for (int i = 0; i < scores; i++) {
                System.out.println("Enter score for student " + (i+1));
                quizScores[i] = input.nextDouble();
                total += quizScores[i];
            }

            double average = total/(double)scores;
            String avg = new DecimalFormat("#.##").format(average);
            System.out.println("Total Average is " + avg);
        }else{
            System.out.println("Number of scores Exceeds total Array!!");
        }

        input.close();
    }
}