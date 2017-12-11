//Complete this code or write your own from scratch
import com.sun.javafx.collections.MappingChange;

import java.util.*;
import java.io.*;

public class Day8DictionariesandMaps {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap phonebook = new HashMap();
        for(int i = 0; i <= n; i++){
            String namePhone = in.nextLine();
            if (i == 0)
                continue;

//            int phone = in.nextInt();
            String np[] = namePhone.split(" ");
            phonebook.put(np[0], np[1]);
        }
//        for(int i = 0; i < n; i++){
//            phonebook.forEach();
//        }

//        HashMap<String, HashMap> selects = new HashMap<String, HashMap>();

//        for(Map.Entry<String, HashMap> entry : phonebook.entrySet()) {
//            String key = entry.getKey();
//            HashMap value = entry.getValue();
//            System.out.println(key+" "+value);
//        }

//        while(in.hasNext()){
//            String s = in.next();
//            // Write code here
//        }

        phonebook.forEach((key, value) -> {
            System.out.println("Key : " + key + " Value : " + value);
        });
        in.close();
    }
}
