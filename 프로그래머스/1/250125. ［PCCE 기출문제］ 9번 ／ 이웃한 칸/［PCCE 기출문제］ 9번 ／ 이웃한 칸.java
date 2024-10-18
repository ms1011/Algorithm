class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        int[] dh = {0, 0, 1, -1};
        int[] dw = {1, -1, 0, 0};
        String color = board[h][w];
        
        for (int i = 0; i < 4; i++) {
            int nh = h + dh[i];
            int nw = w + dw[i];
            
            if (nh >= 0 && nw >= 0 && nh < board.length && nw < board.length) {
                if (color.equals(board[nh][nw])) {
                    answer++;
                }
            }
        }
        
        return answer;
    }
}