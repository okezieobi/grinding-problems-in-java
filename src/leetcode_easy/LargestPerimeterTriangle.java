/*
Given an integer array nums,
return the largest perimeter of a triangle with a non-zero area, formed from three of these lengths. If it is impossible to form any triangle of a non-zero area, return 0.

Example 1:
Input: nums = [2,1,2]
Output: 5

Example 2:
Input: nums = [1,2,1]
Output: 0

Constraints:
3 <= nums.length <= 104
1 <= nums[i] <= 106
*/

import java.util.Arrays;

public class LargestPerimeterTriangle {
    public int solutionOne(int[] nums) {
         Arrays.sort(nums);
        int max = 0;
        for (int index = 0; index < nums.length - 2; index++) {
            if (nums[index] + nums[index + 1] > nums[index + 2]) {
                int tempMax = nums[index] + nums[index + 1] + nums[index + 2];
               max = Math.max(max, tempMax);
            }
        }
            return max;
    }
}
