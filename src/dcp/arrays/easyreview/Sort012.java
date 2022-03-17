package dcp.arrays.easyreview;

import java.util.Arrays;

public class Sort012 {

    public static void main(String[] args) {
        int[] a = new int[]{0, 2, 1, 2, 0};
        sort0122(a,a.length);
        System.out.println(Arrays.toString(a));
    }

    //solution 1
    public static void sort012(int a[], int n)
    {
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        for(int i=0; i<n; i++){

            if(a[i] == 0) count0++;
            if(a[i] == 1) count1++;
            if(a[i] == 2) count2++;

        }

        int k = 0;
        while(count0 > 0 && k < n){
            a[k] = 0;
            k++;
            count0--;
        }

        while(count1 > 0 && k < n){
            a[k] = 1;
            k++;
            count1--;
        }

        while(count2 > 0 && k < n){
            a[k] = 2;
            k++;
            count2--;
        }


    }

    //solution 2 using dutch national flag algorithm
    public static void sort0122(int a[], int n){

        int low =0, mid = 0, high = n-1;


        while(mid<= high){

            if(a[mid] == 0){
                swap(a, mid, low);
                mid++;
                low++;
            }
            else if(a[mid] == 1){
                mid++;
            } else{
                swap(a, mid, high);
                high--;
            }

        }

    }

    static void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
