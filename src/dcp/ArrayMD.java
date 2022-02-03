package dcp;

import java.util.*;

public class ArrayMD {



    static List<List<Integer>> l = new ArrayList<>();
    static List<Integer> li = new ArrayList<>();
    static List<Integer> lis = new ArrayList<>();

    public static void main(String[] args) {
        li.add(1);
        li.add(2);

        lis.add(3);
        lis.add(4);

        l.add(li);
        l.add(lis);

        int[][] a = new int[2][2];


            for(int i =0 ; i< l.size() ; i++){
                List<Integer> temp = l.get(i);
                for (int j = 0; j < l.size(); j++) {
                    a[i][j] = temp.get(j);
                }
            }

        for(int i = 0 ; i< l.size(); i++){
            for(int j = 0; j< l.size(); j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.print("\n");
        }

        Integer[] x = new Integer[2];
        x = li.toArray(x);
        System.out.println(Arrays.toString(x));

    }



}
