package leetcode_review.week1;

import java.util.HashMap;
import java.util.Map;

public class RansomString {


    public static void main(String[] args) {
        String ransomNote ="bg";
        String magazine = "efjbdfbdgfjhhaiigfhbaejahgfbbgbjagbddfgdiaigdadhcfcj";

        System.out.println(canConstruct(ransomNote, magazine));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {


        Map<Character, Integer> mapR = new HashMap<>();

        for(int i = 0; i < ransomNote.length(); i++){

            if(mapR.containsKey(ransomNote.charAt(i))){

                mapR.put(ransomNote.charAt(i), mapR.get(ransomNote.charAt(i)) + 1);
            }else{
                mapR.put(ransomNote.charAt(i) , 1);
            }

        }


        System.out.println(mapR);


        for(int i = 0; i < magazine.length(); i++){

            if(mapR.containsKey(magazine.charAt(i))){
                mapR.put(magazine.charAt(i), mapR.get(magazine.charAt(i)) - 1);
            }
        }


        for(char c : mapR.keySet()){

            if(mapR.get(c) <= 0){
                return false;
            }

        }

        return true;

    }
}
