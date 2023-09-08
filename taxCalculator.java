import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

//        System.out.println("I love pepperoni pizza");
//        System.out.println("It's really good");
//        System.out.println();
        // sout + tab writes System.out.println();
        Scanner price = new Scanner (System.in);
        System.out.print("Enter price: ");
        double total = price.nextDouble();
        double tax = (total*.115);
        double totalTax = (total+tax);
        System.out.println("tax is: " + tax);
        System.out.println("The total price is: " + totalTax);


    }

}
