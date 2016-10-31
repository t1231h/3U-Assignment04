
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author annt0773
 */
public class A4Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //new scanner
        Scanner input = new Scanner(System.in);

        double sum = 1;
        //ask for sum of dice
        while (sum < 100) {
            //ask for sum of dice
            System.out.println("Enter sum of dice");
            double num = input.nextDouble();
            //if the sum of dice is zero
            if (num == 0) {
                System.out.println("You Quit!");
            }

            sum = num + sum;
            //snakes
            if (sum == 54) {
                sum = 19;
            }
            if (sum == 90) {
                sum = 38;
            }
            if (sum == 99) {
                sum = 77;
            }

            //ladders
            if (sum == 9) {
                sum = 34;
            }
            if (sum == 40) {
                sum = 64;
            }
            if (sum == 67) {
                sum = 86;
            }
            
            if (sum > 100) {
               sum= sum-num;
            }
            //answer where you are on now
            System.out.println("You are now on square " + sum);

            //answers
            if (sum == 100) {
                System.out.println("You win!");
            }
        }

    }
    // TODO code application logic here
}
