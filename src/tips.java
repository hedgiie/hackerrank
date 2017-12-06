/**
 * Created by Stinz on 12/5/2017.
 */

import java.util.*;
import java.math.*;

public class tips {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();

        // Write your calculation code here.

        float tip = ((float) tipPercent)/100;

        double tipCost =  tip *  mealCost;
        float tax = ((float) taxPercent)/100;
        double taxCost =  tax  * mealCost;

        double totalCostSub = mealCost + tipCost + taxCost;
        // cast the result of the rounding operation to an int and save it as totalCost
        int totalCost = (int) Math.round(totalCostSub);

        // Print your result
        System.out.println("The total meal cost is "+totalCost+" dollars.");
    }
}