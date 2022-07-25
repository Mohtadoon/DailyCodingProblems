package dcp.algorithms.twopointer;

public class SubArraywithgivenSum {


    public static void main(String[] args) {

        int[] a = {6, 2, 3, 4, 5};
        int k = 6;
        helper(a, k);
    }

    public static int helper(int[] a, int k) {

        int i = 0;
        int j = 0;
        int sum = 0;
        boolean flag = false;
        while (i < a.length) {

            if (sum < k) {
                sum = sum + a[j];
                j++;
            } else if (sum > k) {
                sum = sum - a[i];
                i++;
            } else if (sum == k) {
                flag = true;
                break;
            }
        }
        if (flag == false) {
            return -1;
        }

        for (int x = i; x < j; x++) {
            System.out.print(a[x] + " ");
        }

        return 0;

    }

}
