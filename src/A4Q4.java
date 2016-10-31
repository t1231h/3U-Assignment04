
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author annt0773
 */
public class A4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a scanner
        Scanner input = new Scanner(System.in);

        //ask for the food cost
        System.out.println("How much does the food for the prom cost?");
        //read the number
        double food = input.nextDouble();

        //ask for the DJ cost
        System.out.println("How much does the DJ cost?");
        //read the number
        double DJ = input.nextDouble();

        //ask for the hall cost
        System.out.println("How much does it cost to rent the hall?");
        //read the number
        double hall = input.nextDouble();

        //ask for teh decoration cost
        System.out.println("How much does decorations cost?");
        //read the number
        double deco = input.nextDouble();

        //ask for the staff cost
        System.out.println("How much does it cost for staff?");
        //read the number
        double staff = input.nextDouble();

        //ask for the miscellaneous cost
        System.out.println("How much for miscellaneous cost?");
        //read the number
        double mis = input.nextDouble();

        //calculate the total cost
        double total = food + DJ + hall + deco + staff + mis;
        double ticket = total / 35;
        ticket = Math.ceil(ticket);
        
        //state the whole cost
        System.out.println("The tatal cost is $" + total + "." +
        "You will need to sell "+ ticket + " tickets to break even.");
        // TODO code application logic here
    }
}
