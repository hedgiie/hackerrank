import java.io.*;
import java.util.*;

public class Day7Arrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }
        for(int counter = arr.length - 1; counter >= 0; counter--){
            System.out.print(arr[counter]);
            if (counter >= 1){
                System.out.print(" ");
            }
        }
        in.close();
    }
}
