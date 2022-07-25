package ucm.java;

import java.util.Arrays;

public class insertionSort {

    public static void main(String[] args) {
        int[] arr = new int[]{3,5,3,1,2,0,39,10};

        for(int  i = 1; i < arr.length; i++){

            int key = arr[i];
            int j = i-1;


            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }

        System.out.println(Arrays.toString(arr));
    }
}
