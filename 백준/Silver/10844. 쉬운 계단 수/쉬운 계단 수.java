import java.io.*;
import java.util.*;

public class Main {
    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();

    static int N;
    static long[][] dp;
    static long res = 0;
    static final long MOD = 1000000000;

    static void input() {
        N = scan.nextInt();
        
        // 0의 자리수는 없으므로, N + 1로 해야 1의자리 부터 카운트 가능
        dp = new long[N + 1][10];
    }

    static void pro() {
        for (int i = 0; i < 10; i++) {
            dp[1][i] = 1;
        }

        // 두번째 자릿수 부터
        for (int i = 2; i <= N; i++) {
            for (int j = 0; j < 10; j++) {

                if (j == 0) {
                    dp[i][0] = dp[i - 1][1] % MOD;
                } else if (j == 9) {
                    dp[i][9] = dp[i - 1][8] % MOD;
                } else {
                    dp[i][j] = (dp[i - 1][j - 1] % MOD) + (dp[i - 1][j + 1] % MOD) % MOD;
                }
            }
        }

        for (int i = 1; i < 10; i++) {
            res = (res + dp[N][i]) % MOD;
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