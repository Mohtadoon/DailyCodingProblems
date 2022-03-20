package dcp.arrays.easyreview;

import java.util.Arrays;
import java.util.Map;

public class ClosestSumOfThreeElements {

    public static void main(String[] args) {

        int[] a = new int[]{-1, 2, 1, -4};
        int p = 1;

        System.out.println(Arrays.toString(getMinSum(a, p)));

    }


   //O(n3)
    private static int[] getArrayOfSum(int[] a, int p) {
        int diff = Integer.MAX_VALUE - p;
        int[] temp = new int[3];
        for (int i = 0; i < a.length - 2; i++) {
            for (int j = i + 1; j < a.length - 1; j++) {
                for (int k = j + 1; k < a.length; k++) {

                    int sum = a[i] + a[j] + a[k];
                    int currentdiff = Math.abs(sum - p);
                    if (Math.abs(sum - p) < diff) {
                        diff = currentdiff;
                        temp[0] = a[i];
                        temp[1] = a[j];
                        temp[2] = a[k];
                    }
                }
            }

        }
        return temp;
    }

    //O(n2)
    private static int[] getMinSum(int[] a, int p) {
        Arrays.sort(a);
        int closestSum = Integer.MAX_VALUE;
        int[] temp = new int[3];
        for(int k = 0; k < a.length; k++){

            int i = k + 1;
            int j = a.length-1;


            while(i < j){

                int sum = a[k] + a[i] + a[j];

                if(Math.abs(sum - p) < Math.abs(closestSum - p)){
                    closestSum = Math.abs(sum-p);
                    temp[0] = a[k];
                    temp[1] = a[i];
                    temp[2] = a[j];
                }

                if(closestSum < p){
                    i++;
                }else {
                    j--;
                }
            }
        }
        return temp;
    }


}
