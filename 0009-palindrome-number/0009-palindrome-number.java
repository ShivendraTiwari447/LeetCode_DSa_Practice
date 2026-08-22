class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false; // Negative numbers are not palindromes
        }

        int rev = 0;
        int n = x;
        int duplicate = n;

        while (n > 0) {
            int lst = n % 10;
            n = n / 10;
            rev = (rev * 10) + lst;
        }

        return duplicate == rev;
    }
}