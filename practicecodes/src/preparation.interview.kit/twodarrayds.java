package preparation.interview.kit;



import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class twodarrayds {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {

        int result = 0;
        ArrayList<Integer> arrayResult = new ArrayList();
        int resultbucket = 0;
        for(int y= 0; y <= 3 ; y++) {
            for (int i = 0; i <= 3; i++) {
                for (int x = i; x <= 2; x++) {
                    result += arr[y][x];
                }
                System.out.println(result);
                arrayResult.add(resultbucket, result);
                result = 0;
                resultbucket++;
            }
        }

        System.out.println("-------");
        resultbucket = 0;
        for(int y= 2; y <= 5 ; y++) {
            for (int i = 0; i <= 3; i++) {
                for (int x = i; x <= 2; x++) {
                    result += arr[y][x];
                }
                System.out.println(result);
                arrayResult.add(resultbucket, arrayResult.get(resultbucket) + result);
                result = 0;
                resultbucket++;
            }
        }
        System.out.println("+++++++");
        Iterator i = arrayResult.iterator();
        while (i.hasNext() ){
            System.out.println(i.next());
        }

        return 22;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\Stinz\\Documents\\OUTPUT\\output.txt"));
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

//        int result = hourglassSum(arr);
        System.out.println("highest is: "+hourglassSum(arr));
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
//
//        scanner.close();
    }
}