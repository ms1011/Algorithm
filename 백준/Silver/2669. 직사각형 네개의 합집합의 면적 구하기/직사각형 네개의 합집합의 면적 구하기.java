import java.io.*;
import java.util.*;

public class Main {
    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();

    static int res = 0;
    static int[][] board = new int[101][101];

    static void input() {
        for (int i = 0; i < 4; i++) {
            // 왼쪽 아래 꼭짓점
            int x = scan.nextInt();
            int y = scan.nextInt();

            // 오른쪽 위 꼭짓점
            int a = scan.nextInt();
            int b = scan.nextInt();

            for (int j = x; j < a; j++) {
                for (int k = y; k < b; k++) {
                    board[j][k] = 1;
                }
            }
        }
    }
    
    static void pro() {
        for (int i = 0; i <= 100; i++) {
            for (int j = 0; j <= 100; j++) {
                if (board[i][j] == 1) res++;
            }
        }
    }

    public static void main(String[] args) {
        input();
        pro();
        System.out.println(res);
    }


    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public FastReader(String s) throws FileNotFoundException {
            br = new BufferedReader(new FileReader(new File(s)));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}