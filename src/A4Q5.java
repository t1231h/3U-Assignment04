
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author annt0773
 */
public class A4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a scanner
        Scanner input = new Scanner(System.in);

        //ask name
        System.out.println("Please enter your name");
        String name = input.nextLine();

        //ask for the what first test was out of and the mark
        System.out.println("What was the first test out of?");
        double ft = input.nextDouble();
        System.out.println("What mark did you get?");
        double fm = input.nextDouble();

        //ask what the second test was out of and the mark
        System.out.println("What was the second test out of?");
        double st = input.nextDouble();
        System.out.println("What mark did you get?");
        double sm = input.nextDouble();

        //ask what the third test was out of and the mark
        System.out.println("What was teh third test out of?");
        double tt = input.nextDouble();
        System.out.println("What mark did you get?");
        double tm = input.nextDouble();

        //ask what the fourth test was out of and the mark
        System.out.println("What was the fourth test out of?");
        double fot = input.nextDouble();
        System.out.println("What mark did you get?");
        double fom = input.nextDouble();

        //ask what the fifth test was out fo and the mark
        System.out.println("What was the fifth test out of?");
        double fit = input.nextDouble();
        System.out.println("What mark dud you get?");
        double fim = input.nextDouble();

        //show the mark
        System.out.println("Test Scores for " + name);
        //test 1
        double test1 = fm / ft * 100;
        System.out.println("Test 1: " + test1 + "%");
        //test 2
        double test2 = sm / st * 100;
        System.out.println("Test 2: " + test2 + "%");
        //test 3
        double test3 = tm / tt * 100;
        System.out.println("Test 3: " + test3 + "%");
        //test 4
        double test4 = fom / fot * 100;
        System.out.println("Test 4: " + test4 + "%");
        //test 5 
        double test5 = fim / fit * 100;
        System.out.println("Test 5: " + test5 + "%");

        //the average
        double ave = (test1 + test2 + test3 + test4 + test5) / 5;
        System.out.println("Average: " + ave);
        // TODO code application logic here
    }
}
