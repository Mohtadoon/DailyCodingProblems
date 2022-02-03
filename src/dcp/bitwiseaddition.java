package dcp;

import java.util.Arrays;

public class bitwiseaddition {

    public static void main(String[] args) {
        int[] A = new int[]{1,1,0,1};
        int[] B = new int[]{1,1,0,1};
        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(B));
        int n = A.length;
        System.out.println(n+1);
        int[] C = new int[n+1];
        int carry =0;
        for (int i=n-1; i>=0;i--) {
            switch (A[i] + B[i] + carry) {
                case 0:
                    C[i+1] = 0;
                    carry = 0;
                    break;
                case 1:
                    C[i+1] = 1;
                    carry = 0;
                    break;
                case 2:
                    C[i+1] = 0;
                    carry = 1;
                    break;
                case 3:
                    C[i+1] = 1;
                    carry = 1;
                    break;
                default:
                    break;
            }
        }

        C[0] = carry;
        System.out.println(Arrays.toString(C));
    }
}
