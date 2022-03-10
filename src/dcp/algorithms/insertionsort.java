package dcp.algorithms;

import java.util.Arrays;

public class insertionsort {


    public static void main(String[] args) {


        int[] a = new int[]{4,5,2,1,6,8,3};

//        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(insert(a)));
    }

    public static int[] insert(int[] a){

        for(int j= 1; j <= a.length-1; j++){
            int i = j-1;
            int key = a[j];
            while(i >= 0 && a[i] > key){
               a[i+1] = a[i];
               i= i-1;
            }
            a[i+1] = key;
        }
        return a;
    }
}
