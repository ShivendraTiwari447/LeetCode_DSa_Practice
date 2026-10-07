class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> charset = new HashSet<>();

        int max=0;
        int left =0;

        for(int i=0;i<s.length();i++){
            while(charset.contains(s.charAt(i))){
                charset.remove(s.charAt(left));
                left++;

            }
            charset.add(s.charAt(i));
            max=Math.max(max,i-left+1);
        }
        return max;
    
    }
}