import java.util.ArrayList;
import java.util.List;
/*
Given an integer number n,
return the difference between the product of its digits and the sum of its digits.
 

Example 1:
Input: n = 234
Output: 15 
Explanation: 
Product of digits = 2 * 3 * 4 = 24 
Sum of digits = 2 + 3 + 4 = 9 
Result = 24 - 9 = 15

Example 2:
Input: n = 4421
Output: 21
Explanation: 
Product of digits = 4 * 4 * 2 * 1 = 32 
Sum of digits = 4 + 4 + 2 + 1 = 11 
Result = 32 - 11 = 21
 
Constraints:
1 <= n <= 10^5
*/


public class MinusPrdSum {
    public int subtractProductAndSumOne(int n) {
        if (n < 0) {
            n = -n;
        }
        List<Integer> digits = new ArrayList<Integer>();
        while (n > 0) {
            digits.add(n % 10);
            n /= 10;
        }
        int product = 1;
        int sum = 0;
        for (Integer digit : digits) {
            product *= digit;
            sum += digit;
        }
        return product - sum;
    }
    
     public int subtractProductAndSumTwo(int n) {
        int product = 1;
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            product *= digit;
            sum += digit;
            n /= 10;
        }
        return product - sum;
    }
}
