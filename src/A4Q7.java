
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author annt0773
 */
public class A4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a scanner
        Scanner input = new Scanner(System.in);

        //ask for the speed limit
        System.out.println("Enter the speed limit");
        double sl = input.nextDouble();

        //ask for the recorded speed
        System.out.println("Enter the recorded speed of the car");
        double rs = input.nextDouble();

        //calculate the fine for 1-20
        //over the limit 1 to 20
        double Ff = 100;
        if (sl > rs) {
            System.out.println("Congratulations, you are within the speed limit!");
        }
        if (sl + 20 < rs && rs < sl) {
            System.out.println("You are speeding and your fine is " + "$" + Ff);
        }

        //calculate the fine for 21-30
        double Fs = 270;
        if (sl + 30 < rs && rs < sl + 21) {
            System.out.println("You are speeding and your fine is " + "$" + Fs);
        }

        //calculate the fine for 31+
        double Ft = 500;
        if (sl + 30 < rs) {
            System.out.println("You are speeding and your fine is " + "$" + Ft);
        }
        // TODO code application logic here
    }
}
