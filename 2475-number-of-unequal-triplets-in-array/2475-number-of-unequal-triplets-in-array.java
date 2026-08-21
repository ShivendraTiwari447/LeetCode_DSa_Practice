class Solution {
    public int unequalTriplets(int[] nums) {

        int[] freq = new int[1001];

        for (int num : nums) {
            freq[num]++;
        }

        int left = 0;
        int right = nums.length;
        int ans = 0;

        for (int num = 0; num <= 1000; num++) {

            if (freq[num] == 0) {
                continue;
            }

            right -= freq[num];

            ans += left * freq[num] * right;

            left += freq[num];
        }

        return ans;
    }
}