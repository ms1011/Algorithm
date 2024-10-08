import java.io.*;
import java.util.*;

public class Main {
    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();

    static int N, M;
    static int PRICE[];

    static void input() {
        N = scan.nextInt();
        M = scan.nextInt();

        PRICE = new int[N+1];
        for (int i = 1; i <= N; i++) {
            PRICE[i] = scan.nextInt();
        }
    }

    static boolean isPossible(int K) {
        int sum = 0;
        int count = 1;

        for (int i = 1; i <= N; i++) {
            if (sum + PRICE[i] > K) {
                count++;
                sum = 0;
            }
            sum += PRICE[i];
        }

        return count <= M;
    }

    static void pro() {
        int L = 0, R = 0, res = 0;

        for (int i = 1; i <= N; i++) {
            L = Math.max(L, PRICE[i]);
            R += PRICE[i];
        }

        while (L <= R) {
            int mid = (L + R) / 2;

            if (isPossible(mid)) {
                res = mid;
                R = mid - 1;
            } else {
                L = mid + 1;
            }
        }

        System.out.println(res);
    }

    public static void main(String[] args) {
        input();
        pro();
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