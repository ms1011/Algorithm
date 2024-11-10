import java.io.*;
import java.util.*;

public class Main {
    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();

    static int N, M, A, B;
    static List<Integer>[] adj;
    static boolean[] visited;
    static int[] ans;

    static void input() {
        N = scan.nextInt();
        A = scan.nextInt();
        B = scan.nextInt();
        M = scan.nextInt();
        adj = new ArrayList[N+1];

        for (int i = 1; i <= N; i++) {
            adj[i] = new ArrayList<>();
        }
        visited = new boolean[N+1];
        ans = new int[N+1];

        for (int i = 1; i <= M; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();

            adj[x].add(y);
            adj[y].add(x);
        }
    }

    static void bfs(int start, int end) {
        Queue<Integer> que = new LinkedList<>();
        que.add(start);
        visited[start] = true;

        while (!que.isEmpty()) {
            int x = que.poll();

            if (x == end) return;

            for (int y : adj[x]) {
                if (visited[y]) continue;

                que.add(y);
                visited[y] = true;
                ans[y] = ans[x] + 1;
            }
        }
    }

    static void pro() {
        bfs(A, B);

        if (ans[B] == 0) {
            sb.append(-1);
        } else {
            sb.append(ans[B]);
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