package dcp.algorithms;

import java.util.ArrayList;
import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int key = 9;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        int n = list.size();

        //int m = n % 2 != 0 ? n/2 : n/2 - 1;
        System.out.println(list);

        for(int i : list){
            if(binarySearch(list, 0, n-1, i) != 0)
            {
                System.out.println("duplicate is : " + i);
                return;
            }
        }
        System.out.println("No duplicate");

        //System.out.println(binarySearch(list,0, list.size() - 1, key));
    }

    static int binarySearch(ArrayList<Integer> p, int f, int l, int key){
        int m = f + (l-f) / 2;
        int count = 0;
        //boolean found = false;
        while(f <= l){

            if(key == p.get(m)) {
               if((m>0) && (p.get(m-1) == p.get(m))) return p.get(m);
               if((m<p.size()-1) && (p.get(m+1) == p.get(m))) return p.get(m);
               return 0;
            }

            if(key < p.get(m)) {
                return binarySearch(p,f, m-1, key);
            }

            if(key > p.get(m)){
                return binarySearch(p,m+1,l,key);
            }
        }
        return count;
    }
}
