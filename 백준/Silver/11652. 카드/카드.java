import java.io.*;
import java.util.*;

public class Main {
    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();

    static int N, maxCnt = 1, curCnt = 1;
    static long[] cards;

    static void input() {
        N = scan.nextInt();
        cards = new long[N];

        for (int i = 0; i < N; i++) {
            cards[i] = scan.nextLong();
        }
    }

    static void pro() {
        Arrays.sort(cards);

        long maxNum = cards[0];

        for (int i = 1; i < N; i++) {
            if (cards[i - 1] == cards[i]) {
                curCnt++;
            } else {
                curCnt = 1;
            }

            if (curCnt > maxCnt) {
                maxCnt = curCnt;
                maxNum = cards[i];
            }
        }

        System.out.println(maxNum);
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