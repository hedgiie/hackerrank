package practice.problemsolving;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class DynamicArray {

    // Complete the dynamicArray function below.
//    static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
//        return new LinkedList();
//
//    }

    static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
        int lastAnswer = 0;
        ArrayList<ArrayList<Integer>> seqList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            seqList.add(new ArrayList<Integer>());
        }

        List<Integer> seq = new ArrayList<>();
        List<Integer> lastAnswerList = new ArrayList<>();
        for (int i = 0; i < queries.size(); i++) {
            int x = queries.get(i).get(1);
            int y = queries.get(i).get(2);
            int type = queries.get(i).get(0);
            int index = (x ^ lastAnswer) % n;
            seq = seqList.get(index);
            if (type == 1) {
                seqList.get(index).add(y);
            }
            else if (type == 2) {
                y = (queries.get(i).get(2)) % seq.size();
                lastAnswer = seqList.get(index).get(y);
                lastAnswerList.add(lastAnswer);
                //System.out.println(lastAnswer);
            }
        }
        return lastAnswerList;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nq = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(nq[0]);

        int q = Integer.parseInt(nq[1]);

        List<List<Integer>> queries = new ArrayList<>();

        IntStream.range(0, q).forEach(i -> {
            try {
                queries.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        List<Integer> result = dynamicArray(n, queries);

//        bufferedWriter.write(
//                result.stream()
//                        .map(Object::toString)
//                        .collect(joining("\n"))
//                        + "\n"
//        );

        System.out.println(
                result.stream()
                        .map(Object::toString)
                        .collect(joining("\n"))
                        + "\n"
        );

        bufferedReader.close();
//        bufferedWriter.close();

        ////////////////

    }
}