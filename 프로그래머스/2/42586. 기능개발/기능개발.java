import java.util.*;

class Solution {
    public List<Integer> solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<Integer>();
        Queue<Integer> queue = new LinkedList<Integer>();
        
        for(int i = 0; i < progresses.length; i++){
            queue.add((int)Math.ceil( (100.0 - progresses[i]) / speeds[i]) );        
        }
        
        while(!queue.isEmpty()) {
    		int minDays = queue.poll();
            int count = 1;
            
            while(!queue.isEmpty() && queue.peek() <= minDays){
                queue.poll();
                count++;
            }

            answer.add(count);
        }
        
        return answer;
    }
}