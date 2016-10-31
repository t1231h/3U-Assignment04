
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author annt0773
 */
public class A4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a scanner
        Scanner input = new Scanner(System.in);

        //ask for numbers
        System.out.println("please enter the measurement in inches you wish to convert");

        //read number
        double number = input.nextDouble();
        
        //multiply the number 2.54
        double cm = number * 2.54;
        
        //answer the question
        System.out.println(number + " inches is the same as " + cm + "cm");

        // TODO code application logic here
    }
}
