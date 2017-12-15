import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day112DArrays {
    public static void main(String[] args) {
        int greatest =0;
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
//                arr[i][j] = in.nextInt();
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("-----------");
        int[] resultTopA = new int[16];
        int groupOf4 = 0;
        int resultCntr=0;
        int sum=0;
        for (int upAGroupRow = 0 ; upAGroupRow < 4; upAGroupRow++){
            groupOf4 = 0;

            for (int upAGroupCol = 0; upAGroupCol < 6 ; upAGroupCol++ ){
                int treeCntr = 0;
                for (int inGroup = upAGroupCol ; inGroup < 6; inGroup++) {
                    treeCntr++;

//                    System.out.print(arr[upAGroupRow][inGroup] + " ");
//                    sum += arr[upAGroupRow][inGroup];

//                    if( treeCntr > 3 ){
//                        resultTopA[resultCntr++] = sum;
//                        System.out.println(" => "+sum);
//                        sum = 0;
//                        break;
//                    }
                    System.out.print(arr[upAGroupRow][inGroup] + " ");
                    sum += arr[upAGroupRow][inGroup];
                    if( treeCntr > 2 ){
                        resultTopA[resultCntr++] = sum;
                        System.out.println(" => "+sum);
                        sum = 0;
                        break;
                    }
//                    if(groupOf4 == 3){
//                        resultTopA[resultCntr++] = sum;
//                        System.out.println(" => "+sum);
//                    }
//                    treeCntr++;
                }
                groupOf4++;
                if(groupOf4 >= 4) {

                    break;
                }

                System.out.print("   ");
            }

            System.out.println("");
        }
        System.out.println("xxxxxxxxxxxxxxxxxxx");
        resultCntr = 0;
        sum=0;
        int resultbottomA[] = new int[16];
        for (int upAGroupRow = 2 ; upAGroupRow < 6; upAGroupRow++){
            groupOf4 = 0;
            for (int upAGroupCol = 0; upAGroupCol < 6 ; upAGroupCol++ ){
                int treeCntr = 0;
                for (int inGroup = upAGroupCol ; inGroup < 6; inGroup++) {
                    treeCntr++;
//                    if(treeCntr > 3){
//                        resultbottomA[resultCntr++] = sum;
//                        System.out.println(" => "+sum);
//                        sum = 0;
//                        break;
//                    }
                    System.out.print(arr[upAGroupRow][inGroup] + " ");
                    sum += arr[upAGroupRow][inGroup];
                    if(treeCntr > 2){
                        resultbottomA[resultCntr++] = sum;
                        System.out.println(" => "+sum);
                        sum = 0;
                        break;
                    }

                }
                groupOf4++;
                if(groupOf4 >= 4) {
                    break;
                }
                System.out.print("   ");
            }
            System.out.println("");
        }
        System.out.println("========================");
        int[] resultMidA = new int[16];
        resultCntr = 0;
        for (int col=1; col <=4; col++){
            for (int row=1; row <=4; row++){
                resultMidA[resultCntr++] = arr[col][row];
                System.out.print(arr[col][row]+" ");
            }
            System.out.println("");
        }

        for (resultCntr = 0; resultCntr < 16 ; resultCntr++){
            System.out.print(resultCntr+" | "+resultTopA[resultCntr]+" "+resultbottomA[resultCntr]+" "+resultMidA[resultCntr]);
            int result = resultTopA[resultCntr] +  resultbottomA[resultCntr] + resultMidA[resultCntr];
            System.out.print("  result: "+ result);
            if(greatest < result){
                greatest = result;
            }
            System.out.println("");
        }
        System.out.println(greatest);
    }
}
