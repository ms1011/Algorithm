import java.io.*;
import java.util.*;

public class Main {
    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();

    static int N, M, K;
    static int[][] arr;

    static void input() {
        N = scan.nextInt();
        M = scan.nextInt();
        arr = new int[N+1][M+1];
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                arr[i][j] = scan.nextInt();
            }
        }
        K = scan.nextInt();
    }
    
    static void pro() {
        for (int a = 0; a < K; a++) {
            int sum = 0;
            int i = scan.nextInt();
            int j = scan.nextInt();
            int x = scan.nextInt();
            int y = scan.nextInt();

            for (int b = i; b <= x; b++) {
                for (int c = j; c <= y; c++) {
                    sum += arr[b][c];
                }
            }

            sb.append(sum).append('\n');
        }
        
    }

    public static void main(String[] args) {
        input();
        pro();
        System.out.println(sb);
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