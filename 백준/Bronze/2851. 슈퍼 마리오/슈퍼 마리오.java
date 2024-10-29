import java.io.*;
import java.util.*;

public class Main {
    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();

    static int[] scores = new int[10];
    static int res = 0;

    static void input() {
        for (int i = 0; i < 10; i++) {
            scores[i] = scan.nextInt();
        }
    }

    static void pro() {
        int sumScore = 0;

        for (int i = 0; i < 10; i++) {
            int beforeSum = sumScore;
            sumScore += scores[i];
            
            if (Math.abs(100 - beforeSum) > Math.abs(100 - sumScore)) {
                res = sumScore;
            } else if (Math.abs(100 - beforeSum) == Math.abs(100 - sumScore)) {
                res = sumScore;
            } else {
                res = beforeSum;
            }

            if (sumScore >= 100) {
                break;
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