/*
You are given two strings s1 and s2 of equal length.
A string swap is an operation where you choose two indices in a string
(not necessarily different) and swap the characters at these indices.
Return true if it is possible to make both strings equal by performing
at most one string swap on exactly one of the strings. Otherwise, return false.

 

Example 1:
Input: s1 = "bank", s2 = "kanb"
Output: true
Explanation: For example, swap the first character with the last character of s2 to make "bank".

Example 2:
Input: s1 = "attack", s2 = "defend"
Output: false
Explanation: It is impossible to make them equal with one string swap.

Example 3:
Input: s1 = "kelb", s2 = "kelb"
Output: true
Explanation: The two strings are already equal, so no string swap operation is required.

Constraints:
1 <= s1.length, s2.length <= 100
s1.length == s2.length
s1 and s2 consist of only lowercase English letters.
*/

import java.util.Arrays;

public class AlmostEqualStrings {
    public boolean solution(String s1, String s2) {
        if (s1.equals(s2) == true) return true;
        for (int index = 0; index < s1.length(); index++) {
            String test = "" + s1.charAt(index);
            if (s2.contains(test) == false) return false;
        }
         char[] charsOne = s1.toCharArray();
         char[] charsTwo = s2.toCharArray();
         int swapCount = 0;
         for (int index = 0; index < charsOne.length; index++) {
             if (charsOne[index] != charsTwo[index]) {
                 charsTwo[index] = charsOne[index];
                 swapCount++;
             }
         }
        if (swapCount != 2) return false;
        if (Arrays.equals(charsOne, charsTwo) == true) return true;
        return false;
    }
}
