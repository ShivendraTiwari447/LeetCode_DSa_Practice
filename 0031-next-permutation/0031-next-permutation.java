import java.util.Arrays;

class Solution {
    public void nextPermutation(int[] nums) {

        // Step 1: Find pivot
        int pivot = -1;

        for (int i = nums.length - 2; i >= 0; i--) {

            if (nums[i] < nums[i + 1]) {
                pivot = i;
                break;
            }
        }

        // No pivot → already largest permutation
        if (pivot == -1) {
            reverse(nums, 0, nums.length - 1);
            return;
        }

        // Step 2: Find rightmost element greater than pivot
        for (int i = nums.length - 1; i > pivot; i--) {

            if (nums[i] > nums[pivot]) {
                swap(nums, i, pivot);
                break;
            }
        }

        // Step 3: Reverse the right part
        reverse(nums, pivot + 1, nums.length - 1);
    }

    static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    static void reverse(int[] nums, int start, int end) {

        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}