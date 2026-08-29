class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder result = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                result.append(Character.toLowerCase(ch));
            }
        }

    
        int n = result.length();
        for (int i = 0; i < n / 2; i++) {
            if (result.charAt(i) != result.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}