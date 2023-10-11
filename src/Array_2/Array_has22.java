package Array_2;

import java.util.Arrays;

public class Array_has22 {
    /*
    Given an array of ints, return true if the array contains a 2 next to a 2 somewhere.
  has22([1, 2, 2]) → true
  has22([1, 2, 1, 2]) → false
  has22([2, 1, 2]) → false
     */
    public boolean has22(int[] nums) {
        String str="22";
        return Arrays.toString(nums).replaceAll("[^0-9]","").contains(str);
    }

    public boolean solution2_has22(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==2 && nums[i+1]==2)
                return true;
        }
        return false;
    }

}
