package dcp;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class sumOfSubsets {

    public static void main(String[] args) {

        int a[]={1,2,3,4,15,3};

        System.out.println(Arrays.toString(subsetWriter(a,10,0)));

    }

    public static int[] subsetWriter(int[] a, int sum, int i)
    {

        Deque<Integer> stack=new LinkedList<>();
        subSet(a,sum,0,stack);
        int out[]=new int[stack.size()];

        for(int k=0;k<out.length;k++)
            while (!stack.isEmpty()) {
                out[k] = stack.pop();
                k++;
            }

        return out;
    }


    public static boolean subSet(int[] a,int sum,int i,Deque<Integer> stack)
    {
        if(sum==0)
            return true;

        if(sum<0 || i>=a.length )
            return false;

        for(;i<a.length;i++)
        {
            stack.push(a[i]);

            if(subSet(a, sum - a[i], i + 1, stack))
                return true;

            stack.pop();
        }

        return  subSet(a,sum,i+1,stack);

    }


}
