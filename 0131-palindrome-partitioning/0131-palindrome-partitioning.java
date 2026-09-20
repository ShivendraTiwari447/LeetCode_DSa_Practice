import java.util.*;

class Solution {

    public List<List<String>> partition(String s) {

        List<List<String>> ans = new ArrayList<>();

        backtrack(s, 0, new ArrayList<>(), ans);

        return ans;
    }

    static void backtrack(
            String s,
            int index,
            List<String> curr,
            List<List<String>> ans) {

        // Base case
        if (index == s.length()) {
            ans.add(new ArrayList<>(curr));
            return;
        }

        // Try all substrings starting from index
        for (int end = index; end < s.length(); end++) {

            String sub = s.substring(index, end + 1);

            // Check palindrome
            if (isPalindrome(sub)) {

                // Choose
                curr.add(sub);

                // Explore
                backtrack(s, end + 1, curr, ans);

                // Backtrack
                curr.remove(curr.size() - 1);
            }
        }
    }

    static boolean isPalindrome(String str) {

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {

            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}