package leetcode_review.week1;

//july25

import java.util.Arrays;

public class Running_Sum_of_1d_Array {


    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5};

        //System.out.println(Arrays.toString(getRunningSum(nums)));
        System.out.println(Arrays.toString(optimised(nums)));
    }

    //brute force O(n2) O(n)
    static int[] getRunningSum(int[] nums){

        int[] result = new int[nums.length];

        for(int i=0; i < nums.length; i++){

            int j = 0;
            int sum = 0;

            while( j <= i){
                sum = sum + nums[j];
                j++;
            }

            result[j-1] = sum;
        }

        return result;

    }


    static int[] optimised(int[] nums){

        for(int i=1; i< nums.length; i++){

            nums[i] = nums[i] + nums[i-1];

        }

        return nums;
    }
}



