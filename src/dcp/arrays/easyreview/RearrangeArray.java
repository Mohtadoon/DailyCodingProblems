package dcp.arrays.easyreview;

import java.io.*;
import java.util.*;

public class RearrangeArray {
    public static void main(String[] args) throws IOException {
        int arr[] = new int[]{5, 3, -3, -4, 0, 2, -1, 4, -7, 2};
        System.out.println(Arrays.toString(newRearrange(arr,10)));
    }


    public static int[] newRearrange(int[] arr, int n){
        int temp[] = new int[n];
        int j = 0;

        for (int i = 0; i < n; i++)
            if (arr[i] >= 0)
                temp[j++] = arr[i];

        if (j == n || j == 0)
            return arr;

        for (int i = 0; i < n; i++)
            if (arr[i] < 0)
                temp[j++] = arr[i];

        for (int i = 0; i < n; i++)
            arr[i] = temp[i];

        return arr;
    }
}