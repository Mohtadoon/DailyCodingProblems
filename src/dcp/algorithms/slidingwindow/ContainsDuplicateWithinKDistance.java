package dcp.algorithms.slidingwindow;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicateWithinKDistance {


    public static void main(String[] args) {

        int[] nums = new int[]{1,2,3,1,2,3};
        int k =2;


        System.out.println(containsDup(nums, k));

    }


    public static boolean containsDup(int[] nums, int k){
        HashSet<Integer> set = new HashSet<>();


        for(int i =0; i< nums.length; i++){

            if(set.contains(nums[i])) return true;

            set.add(nums[i]);

            if(set.size() > k){
                set.remove(nums[i-k]);
            }


        }

        return false;

    }

}
