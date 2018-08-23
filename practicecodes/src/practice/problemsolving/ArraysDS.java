package practice.problemsolving;

// Problem Statemment
// https://drive.google.com/file/d/1KNQ_pYOjclH82XbYfQs8afDg5x31eh2F/view?usp=sharing

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/*Arrays - DS
        An array is a type of data structure that stores elements of the same type in a contiguous block of
        memory. In an array, , of size , each memory location has some unique index, (where ),
        that can be referenced as (you may also see it written as ).
        Given an array, , of integers, print each element in reverse order as a single line of space-separated
        integers.
        Note: If you've already solved our C++ domain's Arrays Introduction challenge, you may want to skip
        this.
        Input Format
        The first line contains an integer, (the number of integers in ).
        The second line contains space-separated integers describing .
        Constraints
        Output Format
        Print all integers in in reverse order as a single line of space-separated integers.
        Sample Input 0
        4
        1 4 3 2
        Sample Output 0
        2 3 4 1*/


public class ArraysDS {

    // Complete the reverseArray function below.
    static int[] reverseArray(int[] a) {
       int[] data = new int[a.length];
        int temp=0;
        int x=0;
        for(int i = a.length - 1; i >= 0; i--){
            temp = a[i];
            data[x] = temp;
            x++;
        }
        return data;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[arrCount];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < arrCount; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int[] res = reverseArray(arr);

        for (int i = 0; i < res.length; i++) {
//            bufferedWriter.write(String.valueOf(res[i]));
            System.out.print(String.valueOf(res[i]));
            if (i != res.length - 1) {
//                bufferedWriter.write(" ");
                System.out.print(" ");
            }
        }

//        bufferedWriter.newLine();

//        bufferedWriter.close();

        scanner.close();
    }
}
