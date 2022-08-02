package dcp.algorithms.slidingwindow;

public class MaximumAverageSubarrayI {

    public static void main(String[] args) {

        int[] nums = new int[]{1,12,-5,-6,50,3};
        int k = 4;
        System.out.println(findMaxAverage(nums, k));

    }

    public static double findMaxAverage(int[] nums, int k) {

        int sum = 0;
        double avg = 0;

        int i;

        for(i = 0; i < k ; i++){

            sum = sum + nums[i];
        }

        avg = sum / k;

        for(; i< nums.length; i++){


            sum =  nums[i] < 0 ? sum + nums[i-k] + nums[i]: sum - nums[i-k] + nums[i];

            double curavg = sum / k;

            avg =  curavg > avg ? curavg : avg;

        }


        return avg;

    }

}
