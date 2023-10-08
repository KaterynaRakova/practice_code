package Array_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Array_lucky13 {

    /*Given an array of ints, return true if the array contains no 1's and no 3's.

    lucky13([0, 2, 4]) → true
    lucky13([1, 2, 3]) → false
    lucky13([1, 2, 4]) → false

     */
    public boolean lucky13(int[] nums) {
        for(int e: nums){
            if(e==1 || e==3)
                return false;
        }
        return true;

    }

}
