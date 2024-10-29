import java.io.*;
import java.util.*;

public class Main {
    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();

    static int N, K, X = 0;
    static Queue<Integer> que = new LinkedList<>();

    static void input() {
        N = scan.nextInt();
        K = scan.nextInt();
        for (int i = 1; i <= N; i++) {
            que.add(i);
        }
    }
    
    static void pro() {
        sb.append("<");
        while (que.size() != 1) {
            for (int i = 0; i < K - 1; i++) {
                que.offer(que.poll());
            }
            sb.append(que.poll()).append(", ");
        }
        sb.append(que.poll()).append(">");
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