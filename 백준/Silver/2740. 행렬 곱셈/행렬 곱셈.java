import java.io.*;
import java.util.*;

public class Main {
    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();

    static int N, M, K;
    static int[][] A, B;

    static void input() {
        N = scan.nextInt();
        M = scan.nextInt();
        A = new int[N+1][M+1];
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                A[i][j] = scan.nextInt();
            }
        }

        M = scan.nextInt();
        K = scan.nextInt();
        B = new int[M+1][K+1];
        for (int i = 1; i <= M; i++) {
            for (int j = 1; j <= K; j++) {
                B[i][j] = scan.nextInt();
            }
        }
    }
    
    static void pro() {
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= K; j++) {
                int sum = 0;
                for (int k = 1; k <= M; k++) {
                    int x = A[i][k];
                    int y = B[k][j];
                    sum += x * y;
                }
                sb.append(sum).append(' ');
            }
            sb.append('\n');
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