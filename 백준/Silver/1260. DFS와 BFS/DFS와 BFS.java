import java.io.*;
import java.util.*;

public class Main {
    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();

    static int N, M, V;
    static ArrayList<Integer>[] arr;
    static boolean[] visit;

    static void input() {
        N = scan.nextInt();
        M = scan.nextInt();
        V = scan.nextInt();
        arr = new ArrayList[N + 1];
        visit = new boolean[N + 1];
        for (int i = 1;i <= N; i++)
            arr[i] = new ArrayList<>();
        
        for (int i = 1; i <= M; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            arr[x].add(y);
            arr[y].add(x);
        }

        for (int i = 1; i <= N; i++) {
            Collections.sort(arr[i]);
        }
    }

    // x 를 갈 수 있다는 걸 알고 방문한 상태
    static void dfs(int x) {
        visit[x] = true;
        sb.append(x).append(' ');

        for (int y : arr[x]) {
            if (visit[y]) continue;

            dfs(y);
        }
    }

    // start 에서 시작해서 갈 수 있는 정점들을 모두 탐색하기
    static void bfs(int start) {
        Queue<Integer> que = new LinkedList<>();
        
        que.add(start);
        visit[start] = true;

        while (!que.isEmpty()) {
            int x = que.poll();

            sb.append(x).append(' ');
            for (int y : arr[x]) {
                if (visit[y]) continue;

                que.add(y);
                visit[y] = true;
            }
        }
    }

    static void pro() {
        dfs(V);
        sb.append('\n');
        for (int i = 1; i <= N; i++) {
            visit[i] = false;
        }
        bfs(V);

        System.out.println(sb);
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