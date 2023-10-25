package Array_2;

public class Array_haveThree {
    /*
    Given an array of ints, return true if the value 3 appears in the array exactly 3 times, and no 3's are next to each other.

haveThree([3, 1, 3, 1, 3]) → true
haveThree([3, 1, 3, 3]) → false
haveThree([3, 4, 3, 3, 4]) → false
     */

    public boolean haveThree(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==3 && nums[i+1]==3)
                return false;
        }
        for(int j=0;j<nums.length; j++){
            if (nums[j]==3)
                count++;
        }
        return count==3;
    }

    public boolean solution2_haveThree(int[] nums) {
        int count=0;
        if(nums.length>1 && nums[0]==3){
            count++;
        }
        for(int i=1;i<nums.length; i++){
            if (nums[i-1]==3 && nums[i]==3)
                return false;
            if(nums[i]==3)
                count++;
        }
        return count==3;
    }

}
