import java.io.*;
import java.util.*;

public class Main {
    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();

    static int N, M;
    static int[] cards, find;

    static void input() {
        N = scan.nextInt();
        cards = new int[N+1];

        for (int i = 1; i <= N; i++) {
            cards[i] = scan.nextInt();
        }

        M = scan.nextInt();
        find = new int[M+1];
        
        for (int i = 1; i <= M; i++) {
            find[i] = scan.nextInt();
        }
    }

    static boolean binarySearch(int x) {
        int L = 1;
        int R = N;

        while (L <= R) {
            int mid = (L + R) / 2;

            if (cards[mid] == x) {
                return true;
            }

            if (cards[mid] < x) {
                L = mid + 1;
            } else if (cards[mid] > x) {
                R = mid - 1;
            }
        }

        return false;
    }

    static void pro() {
        Arrays.sort(cards, 1, N+1);

        for (int i = 1; i <= M; i++) {
            if (binarySearch(find[i])) {
                sb.append(1).append(' ');
            } else {
                sb.append(0).append(' ');
            }
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