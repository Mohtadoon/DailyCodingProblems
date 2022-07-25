package leetcode_review.week1;

import java.util.Arrays;

public class Find_Pivot_Index {


    public static void main(String[] args) {
        int[] nums = new int[]{1,7,3,6,5,6};

        System.out.println(optimised(nums));
    }

    public static int pivotIndex(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            int[] lrs = getLRSum(nums, i);

            if(lrs[0] == lrs[1]){
                return i;
            }
        }
        return -1;
    }
    public static int[] getLRSum(int[] nums, int i){

        int[] lrs = new int[2];

        int ls = 0;
        int rs = 0;

        for(int j = 0; j< i; j++){
            ls = ls + nums[j];
        }

        for(int k = i+1; k < nums.length; k++){
            rs = rs + nums[k];
        }
        lrs[0] = ls;
        lrs[1] = rs;

        return lrs;

    }

    public static int optimised(int[] nums){

     int sum = 0;
     int leftsum = 0;

     for(int i : nums)
         sum = sum + i;


     for(int i =0; i< nums.length ; i++){

         if(leftsum == sum - leftsum - nums[i]){
             return i;
         }else{
             leftsum = leftsum + nums[i];
         }

     }

     return -1;

    }
}
