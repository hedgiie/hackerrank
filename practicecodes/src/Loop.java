import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Loop {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int result = 0;
        for(int i = 1; i <= 10; i++){
            result = n * i;
            System.out.println(n+" x "+i+" = "+result);
        }
    }
}