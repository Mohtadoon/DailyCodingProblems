package dcp.algorithms;

public class merge {
    public static int[] mergeAll(int[] a, int p, int q, int r){

        int n1 = q-p+1;
        int n2 = r-q;

        int[] L = new int[n1+1];
        int[] R = new int[n2+1];

        L[L.length-1] = Integer.MAX_VALUE;
        R[R.length-1] = Integer.MAX_VALUE;

        for(int i = 0; i<n1; i++){
            L[i] = a[p+i];
        }
        for(int j =0; j<n2; j++){
            R[j] = a[q+j+1];
        }
        int i = 0;
        int j = 0;

        for(int k = p; k <= r; k++){

            if(L[i] <= R[j]){
                a[k] = L[i];
                i++;
            }else {
                a[k] = R[j];
                j++;
            }

        }


        return a;
    }
}
