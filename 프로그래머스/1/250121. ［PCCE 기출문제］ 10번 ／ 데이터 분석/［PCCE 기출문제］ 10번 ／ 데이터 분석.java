import java.util.*;

class Solution {
    public List<int[]> solution(int[][] data, String ext, int val_ext, String sort_by) {
        List<int[]> list = new ArrayList<>();
        String[] s = {"code", "date", "maximum", "remain"};
        int extIdx = 0, sortIdx = 0;
        
        for (int i = 0; i < 4; i++) {
            if (ext.equals(s[i])) extIdx = i;
            if (sort_by.equals(s[i])) sortIdx = i;
        }
        
        for (int i = 0; i < data.length; i++) {
            // data에서 ext 값이 val_ext보다 작은 데이터만 뽑기
            if (data[i][extIdx] < val_ext) list.add(data[i]);
        }
        
        final int sort = sortIdx;
        
        list.sort((o1, o2) -> o1[sort] - o2[sort]);
        
        return list;
    }
}