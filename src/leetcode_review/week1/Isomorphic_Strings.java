package leetcode_review.week1;

import java.util.HashMap;
import java.util.Map;

public class Isomorphic_Strings {


    public static void main(String[] args) {
        String s = "egg";
        String t = "add";

        System.out.println(isIsomorphic(s,t));

    }


    public static boolean isIsomorphic(String s, String t) {


        if(s.length() != t.length()){
            return false;
        }

        Map<Character, Character> replacement = new HashMap<>();
        Map<Character, Boolean> checked = new HashMap<>();



        for(int i = 0; i< s.length(); i++){

            if(replacement.containsKey(s.charAt(i))){

                if(replacement.get(s.charAt(i)) != t.charAt(i)){
                    return false;
                }

            }else{

                if(checked.containsKey(t.charAt(i)) && checked.get(t.charAt(i))){
                    return false;
                }

                replacement.put(s.charAt(i), t.charAt(i));
                checked.put(t.charAt(i), true);

            }


        }

        return true;


    }


}
