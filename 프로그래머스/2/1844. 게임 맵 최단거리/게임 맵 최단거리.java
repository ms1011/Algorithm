import java.util.*;

class Solution {

    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    
    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;
        
        boolean[][] visit = new boolean[maps.length][maps[0].length];
        Queue<int[]> que = new LinkedList<>();
        
        que.add(new int[]{0, 0, 1});
        visit[0][0] = true;
        
        while (!que.isEmpty()) {
            int[] cur = que.poll();
            int x = cur[0];
            int y = cur[1];
            int distance = cur[2];
            
            if (x == n - 1 && y == m - 1) {
                return distance;
            }
            
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                
                if (nx >= 0 && ny >= 0 && nx < n && ny < m) {
                    if (maps[nx][ny] == 1 && !visit[nx][ny]) {
                        que.add(new int[]{nx, ny, distance + 1});
                        visit[nx][ny] = true;
                    }
                }
            }
        }
        
        
        return -1;
    }
}