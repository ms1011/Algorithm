import java.io.*;
import java.util.*;

public class Main {
    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();

    static int N, M;
    static int[] A, B;

    static void input() {
        N = scan.nextInt();
        A = new int[N+1];
        
        for (int i = 1; i <= N; i++) {
            A[i] = scan.nextInt();
        }

        M = scan.nextInt();
        B = new int[M+1];
        for (int i = 1; i <= M; i++) {
            B[i] = scan.nextInt();
        }
    }

    static int upperBound(int[] A, int L, int R, int X) {
        int bound = R + 1;
        while (L <= R) {
            int mid = (L+R) / 2;

            // X를 초과하는 순간의 경계
            if (A[mid] > X) {
                bound = mid;
                R = mid - 1;
            } else {
                L = mid + 1;
            }
        }

        return bound;
    }

    static int lowerBound(int[] A, int L, int R, int X) {
        int bound = R + 1;
        while (L <= R) {
            int mid = (L+R) / 2;

            // X를 처음 만나는 순간의 경계
            if (A[mid] >= X) {
                bound = mid;
                R = mid - 1;
            } else {
                L = mid + 1;
            }
        }

        return bound;
    }

    static void pro() {
        Arrays.sort(A, 1, N+1);

        // B[i]이 A배열에 범위로 탐색
        for (int i = 1; i <= M; i++) {
            // 윗 경계
            int upper = upperBound(A, 1, N, B[i]);
            // 아랫 경계
            int lower = lowerBound(A, 1, N, B[i]);
            sb.append(upper - lower).append(" ");
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