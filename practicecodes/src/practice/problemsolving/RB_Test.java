package practice.problemsolving;

/*
* Given:
*   A string
* Requirement:
*   Print how many character occurence for each character from a given string  */


import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class RB_Test {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("pekpek");
        HashMap hm = new HashMap<Character, Integer>();
        for(int i = 0 ; i < str.length(); i++){
            Character c = str.charAt(i);
            if(hm.containsKey(c)){
                Integer count = (Integer) hm.get(c);
                hm.replace(c, ++count);
            }else{
                hm.put(c, 1);
            }
        }

        System.out.println(Arrays.asList(hm)); //
        System.out.println(Collections.singletonList(hm));
    }
}
