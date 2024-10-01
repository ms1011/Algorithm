import java.io.*;
import java.util.*;

public class Main {
    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();

    static int N;
    static ArrayList<Integer>[] a;

    static void input() {
        N = scan.nextInt();
        a = new ArrayList[N + 1];
        for (int color = 1; color <= N; color++) {
            a[color] = new ArrayList<Integer>();
        }
        for (int i = 1; i <= N; i++) {
            int coord, color;
            coord = scan.nextInt();
            color = scan.nextInt();
            // color 인 색깔의 점이 coord 에 놓여 있음
            a[color].add(coord);
        }
    }

    static int toLeft(int color, int idx) {
        if (idx == 0) return Integer.MAX_VALUE;
        return a[color].get(idx) - a[color].get(idx - 1);
    }

    static int toRight(int color, int idx) {
        if (idx + 1 == a[color].size()) return Integer.MAX_VALUE;
        return a[color].get(idx + 1) - a[color].get(idx);
    }

    static void pro() {
        // 색깔별로 정렬하기
        for (int i = 1; i <= N; i++) {
            Collections.sort(a[i]);
        }
        
        int ans = 0;
        for (int color = 1; color <= N; color++) {
            // 색깔 별로, 각 점마다 가장 가까운 점 찾아주기
            // 왼쪽이 오른쪽보다 가까우면
            for (int i = 0; i < a[color].size(); i++) {
                int leftDist = toLeft(color, i);
                int rightDist = toRight(color, i);
                ans += Math.min(leftDist, rightDist);
            }
        }

        // 정답 출력하기
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