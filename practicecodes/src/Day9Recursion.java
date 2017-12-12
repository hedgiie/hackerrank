import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day9Recursion {
    static int factorial(int n) {
        // Complete this function
        int fact = 1;
        for(int i = 1; i <= n; i++)
        {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int result = factorial(n);
        System.out.println(result);
    }
}
