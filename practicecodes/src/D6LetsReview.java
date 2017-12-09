import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.*;
import java.util.*;

public class D6LetsReview {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int item = sc.nextInt();
        String[] names = new String[item];
//        System.out.println(names.length);
        // for storing string into array as a test data entry
        for(int counter = 1 ; counter <= names.length ; counter ++){
            Scanner scn = new Scanner(System.in);
//            Strin item = sc.nextLine();
            String test = scn.nextLine();
            names[counter - 1] = test;
//            System.out.println(counter+" "+test.length());
        }
//        StringTokenizer oddString = new StringTokenizer("");
//        StringTokenizer evenString = new StringTokenizer("");
//
//        StringTokenizer[] namesResult = new StringTokenizer[item];

        String oddString = "";
        String evenString = "";
        String namesResult[] = new  String[item];

        for(int counter = 0 ; counter < names.length ; counter ++){
            String sample = names[counter];

            for (int cntr = 0; cntr < sample.length(); cntr++) {
                // this is odd
                if (cntr % 2 != 0) {
                    oddString += sample.charAt(cntr);

                } else { // for even number
                    evenString += sample.charAt(cntr);
                }
            }
//            namesResult[counter] = oddString+" "+evenString;
            namesResult[counter] = evenString+" "+oddString;
            oddString = "";
            evenString = "";
        }

        for(int counter = 0 ; counter < names.length ; counter ++) {
            System.out.println(namesResult[counter].toString());
        }
    }
}