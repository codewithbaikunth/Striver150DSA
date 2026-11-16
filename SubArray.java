import java.util.*;
class SubArray{
      public static void main(String[]args){
            int nums[]={1,3,4,5,6,3};
              int sum = 0;
        int maxSum = nums[0];

        for (int i = 0; i < nums.length; i++) {

            sum = sum + nums[i];

            if (sum > maxSum) {
                maxSum = sum;
            }

            if (sum < 0) {
                sum = 0;
            }
        }

      System.out.println(maxSum);
      }
}