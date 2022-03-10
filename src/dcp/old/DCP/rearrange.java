package dcp.old.DCP;

import java.util.Arrays;

public class rearrange {

    public static void main(String[] args) {
        char arr[]={'R','G','B','G','R','B','R','G','G','R','R'};

        System.out.println(arrange(arr));
    }


    static char[] arrange(char[] arr)
    {
        Arrays.sort(arr);

        for (int i=0,j=arr.length-1;i<j;i++,j--)
        {
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        return arr;
    }

}
