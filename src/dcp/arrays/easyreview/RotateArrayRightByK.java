package dcp.arrays.easyreview;

import java.util.Arrays;

public class RotateArrayRightByK {


    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5, 6, 7};
        //int[] a = {1, 2};
        int k = 3;
        System.out.println(Arrays.toString(rotate1(a, k)));

    }

    //O(n) tO(n)
    static int[] rotate(int[] a, int k) {

        int[] result = new int[a.length];
        if (k > a.length) {
            k = k % a.length;
        }


        for (int i = 0; i < k; i++) {
            result[i] = a[a.length - k + i];
        }

        for (int i = 0, j = k; i < a.length - k; i++, j++) {
            result[j] = a[i];
        }

        return result;
    }


    //T : O(n) S : O(1);

    //reverse first half  (0,l-1)
    //reverse second half (l, n-1)
    //reverse whole array (0, n-1)
    static int[] rotate1(int[] a, int k) {

        int l = k % a.length;

        reverse(a, 0, l - 1);
        reverse(a, l, a.length - 1);
        reverse(a, 0, a.length - 1);
        return a;
    }

    static int[] reverse(int[] a, int i, int j) {
        while (i < j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
        return a;
    }


    //T : O(n*k) S: O(1)


    static int[] rotate2(int[] a, int k){
        k = k % a.length;
        for(int i = 0; i < k; i++){
            for(int j = a.length-1; j > 0; j--){
                int temp = a[j-1];
                a[j-1] = a[j];
                a[j] = temp;
            }
        }
        return a;
    }


}
