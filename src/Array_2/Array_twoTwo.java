package Array_2;

public class Array_twoTwo {
    /*
    Given an array of ints, return true if every 2 that appears in the array is next to another 2.

twoTwo([4, 2, 2, 3]) → true
twoTwo([2, 2, 4]) → true
twoTwo([2, 2, 4, 2]) → false
     */
    public boolean twoTwo(int[] nums) {
        boolean t=true;
        if (nums.length==1 && nums[0]==2) {
            return false;
        }
        for(int i=1;i<nums.length;i++){
            if(nums[i]==2){
                if(nums[i-1]!=2)
                    t=false;
                else
                    t=true;
            }}
        return t;
    }
}
