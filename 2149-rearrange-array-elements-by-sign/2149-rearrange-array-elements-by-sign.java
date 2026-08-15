class Solution {
    public int[] rearrangeArray(int[] nums) {

        int[] nums1 = new int[nums.length];

        int pos = 0;
        int neg = 1;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > 0) {
                nums1[pos] = nums[i];
                pos += 2;
            } 
            else {
                nums1[neg] = nums[i];
                neg += 2;
            }
        }

        return nums1;
    }
}