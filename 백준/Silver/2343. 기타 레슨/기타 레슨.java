import java.io.*;
import java.util.*;

public class Main {
    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();

    static int N, M;
    static int[] LESSON;

    static void input() {
        N = scan.nextInt();
        M = scan.nextInt();
        LESSON = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            LESSON[i] = scan.nextInt();
        }
    }

    static boolean determination(int len) {
        int sum = 0, cnt = 1;

        for (int i = 1; i <= N; i++) {
            // 블루레이에 담긴 크기의 합과 담길 강의의 합을 len과 비교
            if (sum + LESSON[i] <= len) {
                sum += LESSON[i];
            } else {
                cnt++;
                sum = LESSON[i];
            }
        }

        return cnt <= M;
    }

    static void pro() {
        int L = LESSON[1], R = 0, ans = 0;
        // 모든 영상을 저장해야 하기 때문에, 최소값은 제일 긴 녹화본의 길이가 된다
        for (int i = 1; i <= N; i++) {
            L = Math.max(L, LESSON[i]);
            R += LESSON[i];
        }

        
        while (L <= R) {
            int mid = (L + R) / 2;
            // 블루레이의 크기를 줄이기 위한 작업
            if (determination(mid)) {
                ans = mid;
                R = mid - 1;
            } else {
                L = mid + 1;
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