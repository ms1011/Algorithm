import java.io.*;
import java.util.*;

public class Main {
    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();

    static int X, Y;
    static long Z, ans = -1;

    static void input() {
        X = scan.nextInt();
        Y = scan.nextInt();
        Z = calcPercent(X, Y);
    }

    static long calcPercent(long x, long y) {
        return (100 * y) / x;
    }

    static void binarySearch() {
        long L = 0;
        long R = Integer.MAX_VALUE;

        while (L <= R) {
            long mid = (L + R) / 2;

            if (calcPercent(X + mid, Y + mid) > Z) {
                ans = mid;
                R = mid - 1;
            } else {
                L = mid + 1;
            }
        }
        sb.append(ans);
    }

    static void pro() {
        if (Z >= 99) {
            sb.append(-1);
        } else {
            binarySearch();
        }
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