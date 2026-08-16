import java.util.*;

class Solution {
    public List<Integer> majorityElement(int[] nums) {

        int cand1 = 0;
        int cand2 = 0;

        int count1 = 0;
        int count2 = 0;

        // Step 1: Find two possible candidates
        for (int num : nums) {

            if (num == cand1) {
                count1++;
            }
            else if (num == cand2) {
                count2++;
            }
            else if (count1 == 0) {
                cand1 = num;
                count1 = 1;
            }
            else if (count2 == 0) {
                cand2 = num;
                count2 = 1;
            }
            else {
                count1--;
                count2--;
            }
        }

        // Step 2: Count actual frequency
        count1 = 0;
        count2 = 0;

        for (int num : nums) {

            if (num == cand1) {
                count1++;
            }
            else if (num == cand2) {
                count2++;
            }
        }

        // Step 3: Verify
        List<Integer> ans = new ArrayList<>();

        if (count1 > nums.length / 3) {
            ans.add(cand1);
        }

        if (cand2 != cand1 && count2 > nums.length / 3) {
            ans.add(cand2);
        }

        return ans;
    }
}