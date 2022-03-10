package dcp.old.DCP;
import java.util.Arrays;

public class test {

    public static void main(String[] args) {
        int[] A = new int[]{1,1,0,1};
        int[] B = new int[]{1,1,0,1};

        System.out.println(Arrays.toString(getSumArrayBits(A, B)));
    }
    // Taking two n bit array A and B
    public static int[] getSumArrayBits(int[] A, int[] B){
        int n =A.length;
        int[] C = new int[n+1];   // initializing new array c with size n+1 containing n+1 bits of the sum
        boolean carry = false;    // carry variable initializing with false
        int i = n-1;              // initializing i with last index of n bit array integers
        while(i >= 0){            // looping until i==0 and handling Least Significant in each iteration

            //if any carry is present reverting the actual result and storing it in c and updating the carry
            //i.e As 1+1=0 and if carry is present reverting the result bit '0' to '1'
            //and finally updating the carry flag based on result (if sum is not 0 it means there is a carry)
            if(A[i] == 1 && B[i] == 1){  //in this case handling the bit addition case 1 + 1
                C[i+1] = carry ? 1 : 0;
                if(C[i+1] == 0) carry = !carry;
            }
            //similarly handling 1 + 0 or 0 + 1
            if((A[i] == 1 && B[i] == 0) || (A[i] == 0 && B[i] == 1)){
                C[i+1] = carry ? 0 : 1;  //not updating the carry in this case
            }
            //similarly handling 0 + 0
            if(A[i] == 0 && B[i] == 0){
                C[i+1] = carry ? 1 : 0;
                if(C[i+1] == 1) carry = !carry;
            }

            if(i == 0) C[i] = carry ? 1 : 0;

            i--;
        }
        return C;
    }
}
