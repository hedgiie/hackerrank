import java.io.*;
import java.util.*;

public class  Day26NestedLogic{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN.
        Print output to STDOUT. Your class should be named Solution. */
        int dayExpectedReturn, dayReturn = 0;
        int monthExpectedReturn, monthReturn = 0;
        int yearExpectedReturn, yearReturned = 0;

        Scanner in = new Scanner(System.in);
        dayReturn = in.nextInt();
        monthReturn = in.nextInt();
        yearReturned = in.nextInt();

        dayExpectedReturn = in.nextInt();
        monthExpectedReturn = in.nextInt();
        yearExpectedReturn = in.nextInt();

        boolean yearFlag = false;
        boolean dayFlag = false;
        boolean monthFlag = false;

        // for on-time and early return
        if( dayDifference(dayExpectedReturn, dayReturn) >= 0 &&
                monthDifference(monthExpectedReturn, monthReturn) >= 0 &&
                yearDifference(yearExpectedReturn, yearReturned) >= 0){

            System.out.println("0");

        }

        // returned early by many years
        if (yearDifference(yearExpectedReturn, yearReturned) >= 0){
            yearFlag = true;
            System.out.println("0");
        }

        // if returned next year
        if (yearDifference(yearExpectedReturn, yearReturned) < 0){
            yearFlag = true;
            System.out.println("10000");
        }

        // for month
        if ( monthDifference( monthExpectedReturn, monthReturn ) < 0
                && yearFlag == false
                && dayFlag == false){

            monthFlag = true;
           int monthTotal =  500 * monthDifference( monthExpectedReturn, monthReturn );
            System.out.println( Math.abs(monthTotal) );

        }

        // for day
        if (dayDifference(dayExpectedReturn, dayReturn ) < 0
                && yearFlag == false
                && monthFlag == false){

            dayFlag = true;
            int dayTotal =  15 * dayDifference( dayExpectedReturn, dayReturn );
            System.out.println( Math.abs(dayTotal) );

        }
    }

    static int dayDifference(int dayExpectedReturn, int dayReturned){
        return dayExpectedReturn - dayReturned;
    }

    static int monthDifference(int monthExpectedReturn, int monthReturned){
        return  monthExpectedReturn - monthReturned;
    }

    static int yearDifference(int yearExpectedReturn, int yearReturned){
        return  yearExpectedReturn - yearReturned;
    }
}