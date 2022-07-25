package ucm.java;

import java.util.HashMap;
import java.util.Map;

public class FrequentElement {
    public static void main(String[] args) {

        int[]  a = {40,50,30,40,50,30,30};
        System.out.println(getFreq(a));
    }

    public static int getFreq(int[] a){

        Map<Integer, Integer> map = new HashMap<>();
        for(int i : a){
            if(map.containsKey(i)){
                map.put(i , map.get(i) + 1);
            }else{
                map.put(i , 1);
            }
        }

        int freqElement = a[0];
        for(int i : map.keySet()){
            if(map.get(i) > map.get(freqElement))
                freqElement = i;
        }

        return  freqElement;
    }
}
