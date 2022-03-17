package dcp.arrays.easyreview;

import java.util.ArrayList;
import java.util.List;

public class DuplicatesCheckWithoutMap {


    public static void main(String args[])
    {
        //int numRay[] = { 0, 4, 3, 2, 7, 8, 2, 3, 1 };
        int numRay[] = { 0, 1, 1};
        int n = numRay.length;

        for(int i=0; i < numRay.length; i++){
            numRay[numRay[i] % n] = numRay[numRay[i] % n] + n;
        }

        for(int i=0; i < numRay.length; i++){
            if(numRay[i] / n > 1){
                System.out.println(i + " ");
            }
        }

    }

}
