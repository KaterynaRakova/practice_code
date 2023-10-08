package Array_2;

import java.util.Arrays;

public class Array_only14 {
/*
    Given an array of ints, return true if every element is a 1 or a 4.
    only14([1, 4, 1, 4]) → true
    only14([1, 4, 2, 4]) → false
    only14([1, 1]) → true

 */
    public boolean only14(int[] nums) {
    return nums.length==Arrays.stream(nums).filter(m->m==1||m==4).toArray().length;
   }

    public boolean solution2_only14(int[] nums) {
        for(int e: nums){
            if (e!=1){
                if(e!=4)
                    return false;
            }
        }
        return true;
    }

    public boolean solution3_only14(int[] nums) {
        boolean t= false;
        if(nums.length < 1)
            return true;
        for(int e: nums){
            if (e==1 || e==4)
                t=true;
            else{
                t=false;
                break;}
        }
        return t;
    }


}
