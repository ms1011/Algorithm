import java.io.*;
import java.util.*;

public class Main {
    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();

    static int N, M;
    static int[] arr;

    static void input() {
        N = scan.nextInt();
        arr = new int[N+1];

        for (int i = 1; i <= N; i++) {
            arr[i] = scan.nextInt();
        }

        M = scan.nextInt();
    }

    static boolean determination(int limit) {
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            // 상한액보다 이하인 값은 금액 그대로를 배정
            sum += Math.min(arr[i], limit);
        }

        return sum <= M;
    }

    static void pro() {
        int L = 1, R = 0, ans = 0;
        for (int i = 1; i <= N; i++) R = Math.max(R, arr[i]);

        while (L <= R) {
            int mid = (L + R) / 2;

            if (determination(mid)) {
                ans = mid;
                L = mid + 1;
            } else {
                R = mid - 1;
            }
        }
        System.out.println(ans);
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