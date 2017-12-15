import java.io.*;
import java.util.*;

public class Day10BinaryNumbers {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
//        System.out.println(Integer.toBinaryString(n));
       String result=  Integer.toBinaryString(n);
       int totalConsecutive = 0;
       int maxConsecutive = 0;
       for (int cntr= 0; cntr < result.length(); cntr++){
           if(result.charAt(cntr) == '1'){
               totalConsecutive++;
               if(totalConsecutive > maxConsecutive){
                   maxConsecutive = totalConsecutive;
               }
           }else{
               totalConsecutive = 0;
           }
       }
        System.out.println(maxConsecutive);

    }
}
