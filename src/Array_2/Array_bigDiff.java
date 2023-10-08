package Array_2;

import java.util.Arrays;

public class Array_bigDiff {
    /*
    Given an array length 1 or more of ints, return the difference between the largest and smallest values in the array. Note: the built-in Math.min(v1, v2) and Math.max(v1, v2) methods return the smaller or larger of two values.

bigDiff([10, 3, 5, 6]) → 7
bigDiff([7, 2, 10, 9]) → 8
bigDiff([2, 10, 7, 2]) → 8
     */
    public int bigDiff(int[] nums) {
        return Arrays.stream(nums).max().getAsInt() - Arrays.stream(nums).min().getAsInt();
    }
    public int solution2_bigDiff(int[] nums) {
        int min =nums[0],max =nums[0];
        for(int e:nums){
            min=Math.min(min,e);
            max=Math.max(max,e);
        }
        return max-min;
    }

    public int solution3_bigDiff(int[] nums) {
        int min=nums[0],max=nums[0];
      for(int i=0;i<nums.length;i++){
      min=Math.min(min,nums[i]);
      max=Math.max(max,nums[i]);
  }
  return max-min;
    }

}
