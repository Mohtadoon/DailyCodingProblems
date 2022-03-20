package dcp.arrays.easyreview;

import java.util.HashMap;
import java.util.Map;

public class CountPairsWithGivenSum {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 5, 7, 1};
        int n =arr.length;
        int k = 6;
        System.out.println(getPairsCount(arr, n, k));
    }

    static int getPairsCount(int[] arr, int n, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for(int i = 0; i < n; i++){
            if(map.get(arr[i]) == null){
                map.put(arr[i], 1);
            }else{
                map.put(arr[i],map.get(arr[i])+1);
            }
        }

        for(int i = 0; i < n; i++){
            if(map.get(k - arr[i]) != null){
                count = count + map.get(k - arr[i]);
            }
            if(k - arr[i] == arr[i]){
                count--;
            }
        }

        return count/2;
    }
    
}


