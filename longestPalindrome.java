class Solution {
    // T.C : O(n)
    // S.C : O(1)
    public int longestPalindrome(String s) {
        if (s == null || s.length() == 0)
            return 0;
        HashSet<Character> set = new HashSet<>();
        int length = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (set.contains(c)) {
                length = length + 2;
                set.remove(c);
            }
            else {
                set.add(c);
            }
        }
        if (set.size() > 0) {
            length++;
        }
        return length;
    }
}