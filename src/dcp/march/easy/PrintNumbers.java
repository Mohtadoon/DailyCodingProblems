package dcp.march.easy;

public class PrintNumbers {

    public static void main(String[] args) {
        helper(100, 0);
    }

    static void helper(int n, int i){
        if( i > n){
            return;
        }
        System.out.print(i + " ");
        helper(n, i+1);
    }
}

