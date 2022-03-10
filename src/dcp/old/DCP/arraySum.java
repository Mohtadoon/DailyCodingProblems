package dcp.old.DCP;

import java.util.HashSet;
import java.util.Set;

////Better TIme COMPLEXITY

public class arraySum {

    public static void main(String... args) {
        int[] arr = { 10, 15, 3, 7 ,7,4};
        System.out.println(check(arr, 18));
    }

    public static boolean check(int[] arr, int k) {
        if (arr == null || arr.length < 2)
            return false;

        Set<Integer> S = new HashSet<>();

        for (int i=0;i<arr.length;i++) {
            if (S.contains(arr[i]))
                return true;
            S.add(k - arr[i]);
        }

        return false;
    }

}