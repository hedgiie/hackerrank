import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Difference{
    private int[] elements;
    public int maximumDifference;
    // Add your code here
    public  Difference(int elements[]){
        this.elements = elements;
    }

    public void computeDifference(){
        int maxDiff = 0;
        for (int cntr = 0; cntr < elements.length; cntr++){
            for (int cntr2  = 1; cntr2 < elements.length; cntr2++){
                int ans = elements[cntr] - elements[cntr2];
//                System.out.println( Math.abs(ans) );
                ans = Math.abs(ans);
                if (maxDiff < Math.abs( ( elements[cntr] - elements[cntr2] ) ) ){
                    maxDiff = ans;
                }
            }
        }
        maximumDifference = maxDiff;
    }
} // End of Difference class

public class Day14Scope {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
