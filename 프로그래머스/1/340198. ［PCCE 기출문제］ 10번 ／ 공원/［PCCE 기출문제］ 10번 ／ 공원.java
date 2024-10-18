import java.util.*;

class Solution {
    
    // (row, col)에서 시작하는 matSize의 돗자리를 놓을 수 있는 지 확인
    public boolean canPlaceMatSize(String[][] park, int row, int col, int matSize) {
        for (int i = 0; i < matSize; i++) {
            for (int j = 0; j < matSize; j++) {
                if (!park[row + i][col + j].equals("-1")) return false;
            }
        }
        
        return true;
    }
    
    // 돗자리가 공원에 놓을 수 있는 지 확인
    public boolean canPlaceMat(String[][] park, int matSize) {
        int row = park.length;
        int col = park[0].length;
        
        // 돗자리가 공원을 삐져나오면 안되므로 범위를 row - matSize 한다
        for (int i = 0; i <= row - matSize; i++) {
            for (int j = 0; j <= col - matSize; j++) {
                if (canPlaceMatSize(park, i, j, matSize)) return true;
            }
        }
        
        return false;
    }
    
    public int solution(int[] mats, String[][] park) {
        int answer = 0;
        Arrays.sort(mats);
        
        // 큰 돗자리부터 탐색
        for (int i = mats.length - 1; i >= 0; i--) {
            int matSize = mats[i];
            
            if (canPlaceMat(park, matSize)) {
                return matSize;
            }
        }
        
        return -1;
    }
}