package Array_2;

import java.util.Arrays;

public class Array_no14 {
    /*

Given an array of ints, return true if it contains no 1's or it contains no 4's.
no14([1, 2, 3]) → true
no14([1, 2, 3, 4]) → false
no14([2, 3, 4]) → true
     */
    public boolean no14(int[] nums) {
        String str= Arrays.toString(nums).replaceAll("[^0-9]","");
        if(str.contains("1") && str.contains("4"))
            return false;
        return true;

    }
    public boolean solution2_no14(int[] nums) {
        for(int e: nums){
            if (e==1){
                for(int n:nums){
                    if(n==4)
                        return false;
                }
            }
        }
        return true;
    }


    public boolean solution3_no14(int[] nums) {
        if(nums.length <2)
            return true;
        boolean t =false,t2 =false;
        for(int e : nums){
            if( e==1 ){
                t=true;}
            if(e==4){
                t2=true;
            }
        }
        return t!=t2;
    }
}
