package dcp.march.easy;

import java.util.Arrays;

public class ZerosOnesRearrangeTwoPointerApproach {

    public static void main(String[] args) {
        int[] a = {0,1,0,1,0,0,0,1,1,1};

        int i = 0;
        int j = a.length-1;
        while(i < j){

            if( a[i] > a[j]){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }

            if(a[i] == a[j]){
                if(a[i] == 0){
                    i++;
                }else{
                    j--;
                }
            }
            else {
                i++;
                j--;
            }
        }

        System.out.println(Arrays.toString(a));
    }


}
