public class NumOfBits {
     public int hammingWeight(int n) {
        int numOfOnes = 0;
        while (n != 0) {
            numOfOnes += (n & 1);
            n = n >>> 1;
        }
        return numOfOnes;
    }
}
