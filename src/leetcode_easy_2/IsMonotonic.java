public class IsMonotonic {
    boolean solution(int[] nums) {
        int countAscMonotonic = 1;
        int countDescMonotonic = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1])
                countAscMonotonic++;
            else if (nums[i] > nums[i + 1])
                countDescMonotonic++;
            else {
                countAscMonotonic++;
                countDescMonotonic++;
            }
        }
        if (nums.length == countAscMonotonic || nums.length == countDescMonotonic)
            return true;
        return false;
    }
}
