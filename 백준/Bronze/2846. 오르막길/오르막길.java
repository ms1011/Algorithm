import java.io.*;
import java.util.*;

public class Main {
    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();

    static int N, H = 0, res = 0;
    static int[] Pi;
    static List<Integer> arr = new ArrayList<>();

    static void input() {
        N = scan.nextInt();
        Pi = new int[N];
        for (int i = 0; i < N; i++) {
            Pi[i] = scan.nextInt();
        }
    }

    static void pro() {
        int currentHeight = 0;
        for (int i = 0; i < N-1; i++) {
            int cur = Pi[i];
            int next = Pi[i+1];

            if (next - cur > 0) {   // 오르막이면
                currentHeight += next - cur;
            } else {
                H = Math.max(H, currentHeight);
                currentHeight = 0;
            }
        }
        H = Math.max(H, currentHeight);
    }

    public static void main(String[] args) {
        input();
        pro();
        System.out.print(H);
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