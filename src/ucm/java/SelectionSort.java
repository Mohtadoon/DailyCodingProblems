package ucm.java;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {


        int[] arr = new int[]{7,6,4,2,1,10};

        selectionSort(arr);

        System.out.println(Arrays.toString(arr));
    }


    static int[] selectionSort(int[] a){

        for(int i = 0; i < a.length - 1 ; i++){
            for(int j = i+1; j < a.length; j++){
                if(a[j] < a[i]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }

}
