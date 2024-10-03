import java.io.*;
import java.util.*;

public class Main {
    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();

    static int N, X, cnt;
    static int[] A;

    static void input() {
        N = scan.nextInt();
        A = new int[N+1];

        for (int i = 1; i <= N; i++) {
            A[i] = scan.nextInt();
        }
        X = scan.nextInt();
    }

    static void binSearch(int[] A, int L, int R, int Y) {
        while (L <= R) {
            int mid = (L + R) / 2;
            if (A[mid] + Y == X) cnt++;
            if (A[mid] + Y < X) {
                L = mid + 1;
            } else {
                R = mid - 1;
            }
        }
    }

    static void pro() {
        Arrays.sort(A);

        // B 배열의 값을 A에서 찾기
        for (int i = 1; i <= N; i++) {
            binSearch(A, i + 1, N, A[i]);
        }
        System.out.println(cnt);
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
