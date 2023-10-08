package Array_2;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Array_sum28 {
    /*
    Given an array of ints, return true if the sum of all the 2's in the array is exactly 8.
         sum28([2, 3, 2, 2, 4, 2]) → true
         sum28([2, 3, 2, 2, 4, 2, 2]) → false
         sum28([1, 2, 3, 4]) → false
     */

    public boolean sum28(int[] nums) {
        return Arrays.stream(nums).filter(n->n==2).sum()==8;
    }


    public boolean solution2_sum28(int[] nums) {
        int sum=0;
        for(int n: nums){
            if (n==2)
                sum+=n;
        }
        return sum==8;
    }

}
