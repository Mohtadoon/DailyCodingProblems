package dcp.old.DCP;

import java.util.Scanner;

public class Nsteps {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(helper(n));
    }

    static int helper(int n)
    {
        if(n==0  ||  n==1)
            return 1;

        else
            return helper(n-1)+helper(n-2);
    }

}
