/*
Given an integer array nums,
move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

Example 1:
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]

Example 2:
Input: nums = [0]
Output: [0]

Constraints:
1 <= nums.length <= 104
-231 <= nums[i] <= 231 - 1
 

Follow up: Could you minimize the total number of operations done?
*/

public class MoveZeroes {
    public void solutionTwo(int[] nums) {
        int noneZeroIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[noneZeroIndex] = nums[i];
                noneZeroIndex++;
            }
        }
        for (int i = nums.length; i >= noneZeroIndex; i++) {
            nums[i] = 0;
        }
    }

    public void solution(int[] nums) {
        int[] result = new int[nums.length];
        int countUp = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                result[countUp] = nums[i];
                countUp++;
            }
        }
        int countDown = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                result[countDown] = nums[i];
                countDown--;
            }
        }
        for (int i = 0; i < result.length; i++) {
            nums[i] = result[i];
        }
    }
}
