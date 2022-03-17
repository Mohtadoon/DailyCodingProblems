package dcp.arrays.easyreview;


/*Given an array of size N-1 such that it only contains
distinct integers in the range of 1 to N.
 Find the missing element.
 */
public class FindMissingElement {


    public static void main(String[] args) {

        int[] array = new int[]{1,2,3,5};
        int n = 5;
        System.out.println(missingNumber(array, n));
    }

    static int missingNumber(int array[], int n) {

        int sum = (n * (n + 1)) / 2;

        for(int i = 0; i < n-1; i++){

            sum = sum - array[i];

        }

        return sum;

    }
}
