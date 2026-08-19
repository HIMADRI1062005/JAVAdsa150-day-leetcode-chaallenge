import java.util.*;

class Solution {
    public List<List<Integer>> findPrimePairs(int n) {
        List<List<Integer>> ans = new ArrayList<>();
        
        boolean[] prime = new boolean[n+1];
        Arrays.fill(prime, true);
        prime[0] = prime[1] = false;
        
        for (int i = 2; i <= n; i++) {
            if (prime[i]) {
                int j = i * i;
                
                while (j <= n) {
                    prime[j] = false;
                    j += i;
                }
            }
        }
        
        for (int i = 2; i < n; i++) {
            if (i + i > n) break;
            if (prime[i] && prime[n - i]) {
                ans.add(Arrays.asList(i, n - i));
            }
        }
        
        return ans;
    }
}