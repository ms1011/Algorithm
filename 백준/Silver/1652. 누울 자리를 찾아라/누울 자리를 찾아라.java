import java.io.*;
import java.util.*;

public class Main {
    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();

    static int N, horizontal = 0, vertical = 0;
    static char[][] room;

    static void input() {
        N = scan.nextInt();
        room = new char[N][N];

        for (int i = 0; i < N; i++) {
            String input = scan.nextLine();
            for (int j = 0; j < N; j++) {
                room[i][j] = input.charAt(j);
            }
        }
    }

    static void pro() {
        
        // 가로 자리 계산
        for (int i = 0; i < N; i++) {
            int count = 0;
            for (int j = 0; j < N; j++) {
                if (room[i][j] == '.') {
                    count++;
                } else {
                    if (count >= 2) {
                        horizontal++;
                    }
                    count = 0;  // 짐을 만난 경우 초기화
                }
            }
            if (count >= 2) {
                horizontal++;
            }
        }
        
        // 세로 자리 계산
        for (int j = 0; j < N; j++) {
            int count = 0;
            for (int i = 0; i < N; i++) {
                if (room[i][j] == '.') {
                    count++;
                } else {
                    if (count >= 2) {
                        vertical++;
                    }
                    count = 0;
                }
            }
            if (count >= 2) {
                vertical++;
            }
        }

        sb.append(horizontal).append(' ').append(vertical);
    }

    public static void main(String[] args) {
        input();
        pro();
        System.out.print(sb);
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