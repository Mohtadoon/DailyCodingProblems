package dcp.old.DCP;

class helpMinimum {


    int min(int x, int y, int z) {
        if (x < y)
            return (x < z) ? x : z;
        else
            return (y < z) ? y : z;
    }

    int minCost(int cost[][], int m,
                int n) {
        if (n < 0 || m < 0)
            return Integer.MAX_VALUE;


        else if (m == 0 && n == 0)
            return cost[m][n];


        return cost[m][n] + min(minCost(cost, m - 1, n - 1), minCost(cost, m - 1, n), minCost(cost, m, n - 1));
    }
}
public class minimum {
    public static void main(String args[]) {

        helpMinimum test=new helpMinimum();

        int cost[][] = {{0, 8, 3},
                {8, 8, 2},
                {9, 9, 3}};

        System.out.print(test.minCost(cost, 2, 2));
    }
}