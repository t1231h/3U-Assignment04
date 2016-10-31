
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author annt0773
 */
public class A4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a scanner
        Scanner input = new Scanner(System.in);

        //ask for daytime minuites
        System.out.println("Number of daytime minutes?");
        double x = input.nextDouble();
        double pad = (x-100) * 0.25 ;
        double pbd = (x-250) * 0.45 ;

        //ask for evening minutes
        System.out.println("Number of evening minutes?");
        double y = input.nextDouble();
        double pae = y * 0.15;
        double pbe = y * 0.35;

        //ask for the weekend
        System.out.println("Number of weekend minutes?");
        double z = input.nextDouble();
        double paw = z * 0.20;
        double pbw = z * 0.25;

        //answer how much plan a costs
        double plana = pad + pae + paw;
        System.out.println("Plan A costs " + "$" + plana);
        //answer how much plan b costs
        double planb = pbd + pbe + pbw;
        System.out.println("Plan B costs " + "$" + planb);

        //answer which plan is better
        if (planb < plana) {
            System.out.println("Plan B is cheapest.");
        }
        if (plana < planb) {
            System.out.println("Paln A is cheapest");
        }
        if (plana == planb) {
            System.out.println("Plan A and B are the same price.");
        }
        //ask for evening minutes

        // TODO code application logic here
    }
}
