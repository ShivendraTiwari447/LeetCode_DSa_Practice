class Solution {

    public List<String> generateParenthesis(int n) {

        List<String> ans = new ArrayList<>();

        generate(ans, "", 0, 0, n);

        return ans;
    }

    static void generate(List<String> ans, String str,
                         int open, int close, int n) {

        // Base case
        if (open == n && close == n) {
            ans.add(str);
            return;
        }

        // Add '('
        if (open < n) {
            generate(ans, str + "(", open + 1, close, n);
        }

        // Add ')'
        if (close < open) {
            generate(ans, str + ")", open, close + 1, n);
        }
    }
}