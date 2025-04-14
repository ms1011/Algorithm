class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 1;        
        int j = section[0];  // 롤러가 처음 칠할 부분
        
        for (int i=1; i<section.length; i++) {
            if (m <= (section[i] - j)) {
                answer++;
                j = section[i];
            }
        }
        
        return answer;
    }
}