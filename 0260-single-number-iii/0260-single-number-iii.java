class Solution {
    public int[] singleNumber(int[] nums) {

        int xor = 0;

        // XOR of all numbers
        for (int num : nums) {
            xor ^= num;
        }

        // Rightmost set bit
        int diffBit = xor & -xor;

        int a = 0;
        int b = 0;

        // Divide into two groups
        for (int num : nums) {
            if ((num & diffBit) != 0) {
                a ^= num;
            } else {
                b ^= num;
            }
        }

        return new int[]{a, b};
    }
}