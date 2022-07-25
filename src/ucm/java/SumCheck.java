package ucm.java;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SumCheck {

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,4,4,6,7};
        int sum = 8;

        Map map = new HashMap<Integer, Integer>();

        map.keySet();
        Arrays.sort(arr);

        int i = 0;
        int j = arr.length - 1;

        while (i < j){

            if(arr[i] + arr[j] == sum){
                System.out.println("true");
                return;
            }
            else if(arr[i] + arr[j] > sum){
                j--;
            }else{
                i++;
            }

        }
        System.out.println("false");
    }

}
