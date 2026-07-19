class Solution {
    public String smallestSubsequence(String s) {
        Map<Character, Integer> last = new HashMap<>();
        Set<Character> vis = new HashSet<>();
        StringBuilder ans = new StringBuilder();

        // Store the last occurrence of every character
        for (int i = 0; i < s.length(); i++) {
            last.put(s.charAt(i), i);
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // Skip if already present in the answer
            if (vis.contains(ch)) continue;

            // Remove larger/equal characters that appear again later
            while (ans.length() > 0 &&
                   ans.charAt(ans.length() - 1) >= ch &&
                   last.get(ans.charAt(ans.length() - 1)) >= i) {

                vis.remove(ans.charAt(ans.length() - 1));
                ans.deleteCharAt(ans.length() - 1);
            }

            // Add current character
            ans.append(ch);
            vis.add(ch);
        }

        return ans.toString();
    }
}