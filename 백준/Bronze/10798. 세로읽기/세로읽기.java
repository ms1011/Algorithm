import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[][] input = new char[5][15];
        int maxLen = 0;

        for (int i = 0; i < 5; i++) {
            String str = sc.next();

            if(maxLen < str.length()) {
                maxLen = str.length();
            }
            for (int j = 0; j < str.length(); j++) {
                input[i][j] = str.charAt(j);
            }

        }

        for (int i = 0; i < maxLen; i++) {
            for (int j = 0; j < 5; j++) {
                if(input[j][i] == '\u0000') {
                    continue;
                }
                System.out.print(input[j][i]);
            }
        }
    }
}