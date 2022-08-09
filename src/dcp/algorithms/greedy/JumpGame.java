package dcp.algorithms.greedy;

public class JumpGame {

    public static void main(String[] args) {

        int[] nums = new int[] {2,3,1,1,4};

        System.out.println(canJump(nums));

    }

    public static boolean canJump(int[] nums){

        int lastGoodIndexPosition = nums.length - 1;

        for(int i = nums.length - 1; i >=0; i--){

            if(i+ nums[i] >= lastGoodIndexPosition){

                lastGoodIndexPosition = i;
            }
        }

        return lastGoodIndexPosition == 0;
    }

}
