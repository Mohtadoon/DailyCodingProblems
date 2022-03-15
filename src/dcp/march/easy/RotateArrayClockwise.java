package dcp.march.easy;

import java.util.Arrays;

public class RotateArrayClockwise {

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1, 0, 0}, {2,4,5}, {9,4,3}};
        print2D(matrix);
        rotate(matrix);
        print2D(matrix);

    }


    public static void rotate(int[][] matrix) {
        int n = matrix.length;

        for(int i = 0; i < n/2; i++){

            for(int j = i; j < n - 1 - i; j++){

                int temp = matrix[i][j];
                matrix[i][j] = matrix[n-1-j][i];
                matrix[n-1-j][i] = matrix[n-1-i][n-1-j];
                matrix[n-1-i][n-1-j] = matrix[j][n-1-i];
                matrix[j][n-1-i] = temp;


            }

        }

    }

    static void print2D(int[][] matrix){

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }

    }
}
