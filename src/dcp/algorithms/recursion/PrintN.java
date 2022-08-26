package dcp.algorithms.recursion;

public class PrintN {
    public static void main(String[] args) {


        printN(10, 1);
        System.out.print("\n");
        printDes(10);

    }

    static void printN(int n, int i){

        if(n == i) {
            System.out.print(n);
            return;
        }

        System.out.print(i + " ");

        printN(n, i+1);

    }


    static void printDes(int n){
        if(n == 0){
            return;
        }

        System.out.print(n + " ");

        printDes(n-1);

    }
}
