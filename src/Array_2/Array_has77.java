package Array_2;

import java.util.Arrays;

public class Array_has77 {
/*
Given an array of ints, return true if the array contains two 7's next to each other, or there are two 7's separated by one element, such as with {7, 1, 7}.

has77([1, 7, 7]) → true
has77([1, 7, 1, 7]) → true
has77([1, 7, 1, 1, 7]) → false
 */

    public boolean has77(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            if(i<nums.length-2){
                if(nums[i]==7 && nums[i+1]==7 || nums[i]==7 && nums[i+2]==7)
                    return true;
            }else{
                if(nums[i]==7 && nums[i+1]==7)
                    return true;
            }
        }
        return false;

    }

    public boolean solution2_has77(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==7 && nums[i+1]==7)
                return true;}
        for(int i=0;i<nums.length-2;i++){
            if(nums[i]==7 && nums[i+2]==7)
                return true;
        }
        return false;

    }


}
