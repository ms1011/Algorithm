import java.util.*;

class Solution {
    static int answer = 0;
    
    public void dfs(int idx, int[] numbers, int target, int sum) {
        if (idx == numbers.length) {
            if (sum == target) {
                answer++;
            }
            return;
        }
        
        dfs(idx + 1, numbers, target, sum + numbers[idx]);
        dfs(idx + 1, numbers, target, sum - numbers[idx]);
    }
    
    public int solution(int[] numbers, int target) {
        dfs(0, numbers, target, 0);
        
        return answer;
    }
}