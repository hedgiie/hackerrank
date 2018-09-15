package practice.problemsolving;

// Problem Statement
// https://drive.google.com/open?id=1YXNc-LOU23_ri0Lxa6yaGDH-6UASh7IX

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class LeftRotation {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        String[] nd = scanner.nextLine().split(" ");
//
//        int n = Integer.parseInt(nd[0]);
//
//        int d = Integer.parseInt(nd[1]);
//
//        int[] a = new int[n];
//
//        String[] aItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        int index = 0;
//        int counter = 0;
//        for (int i = 0; i < n; i++) {
//            int aItem = Integer.parseInt(aItems[i]);
////            System.out.print(aItem+" ");
//            counter = i;
//            for(int x = d; x > 0 ; x--){
//                counter--;
//                if(counter < 0){
//                    counter = d;
//                }
//            }
//            a[counter] = aItem;
//        }
////        System.out.println("---------");
//        for (int i = 0; i < n; i++) {
//            System.out.print(a[i]+" ");
//        }
//
//        scanner.close();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int d = scan.nextInt();
        int[] array = new int[n];
        for(int i=0; i<n;i++) {
            array[(i+n-d)%n] = scan.nextInt();
        }
        for(int i=0; i<n;i++) {
            System.out.print(array[i] + " ");
        }
    }
}
