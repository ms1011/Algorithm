import java.util.*;

class Solution {
    
    public String solution(int[] numbers) {
        String answer = "";
        String[] numberString = new String[numbers.length];
        
        for (int i = 0; i < numberString.length; i++) {
            numberString[i] = String.valueOf(numbers[i]);
        }
        
        Arrays.sort(numberString, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));
        
        for (int i = 0; i < numberString.length; i++) {
            answer += numberString[i];
        }
        
        if (answer.charAt(0) == '0') answer = "0";
        
        return answer;
    }
}