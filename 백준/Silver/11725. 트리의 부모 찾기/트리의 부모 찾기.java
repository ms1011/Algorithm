import java.io.*;
import java.util.*;

public class Main {
    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();

    static int N;
    static List<Integer>[] adj;
    static boolean[] visited;
    // 부모 노드를 저장하기 위한 배열
    static int[] parent;
    
    static void input() {
        N = scan.nextInt();
        adj = new ArrayList[N+1];
        visited = new boolean[N+1];
        parent = new int[N+1];
        for (int i = 1; i <= N; i++) {
            adj[i] = new ArrayList<>();
        }

        for (int i = 1; i <= N-1; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();

            adj[x].add(y);
            adj[y].add(x);
        }
    }

    static void bfs(int start) {
        Queue<Integer> que = new LinkedList<>();
        que.add(start);
        visited[start] = true;

        while (!que.isEmpty()) {
            int x = que.poll();

            for (int y : adj[x]) {
                if (visited[y]) continue;

                que.add(y);
                visited[y] = true;

                // 다음 노드의 부모가 현재 노드
                parent[y] = x;
            }
        }
    }

    static void pro() {
        bfs(1);

        for (int i = 2; i <= N; i++) {
            sb.append(parent[i]).append('\n');
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