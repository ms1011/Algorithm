import java.io.*;
import java.util.*;

public class Main {
    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();

    static int T;

    static void input() {
        T = scan.nextInt();
    }

    static void pro() {
        for (int i = 0; i < T; i++) {
            int N = scan.nextInt();
            int max = Integer.MIN_VALUE;
            String maxCollege = "";
            for (int j = 0; j < N; j++) {
                String[] input = scan.nextLine().split(" ");
                String college = input[0];
                int amount = Integer.parseInt(input[1]);

                if (max < amount) {
                    max = amount;
                    maxCollege = college;
                }
            }
            sb.append(maxCollege).append("\n");
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