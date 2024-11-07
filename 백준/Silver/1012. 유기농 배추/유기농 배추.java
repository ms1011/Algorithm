import java.io.*;
import java.util.*;

public class Main {
    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();

    static int T, M, N, K, cnt = 0;
    static int[][] field;
    static boolean[][] visited;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    static void input() {
        M = scan.nextInt();
        N = scan.nextInt();
        field = new int[M][N];
        visited = new boolean[M][N];
        K = scan.nextInt();
        for (int i = 0; i < K; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            field[x][y] = 1;
        }
    }

    static void bfs(int startX, int startY) {
        Queue<Integer> que = new LinkedList<>();
        que.add(startX);
        que.add(startY);
        visited[startX][startY] = true;

        while (!que.isEmpty()) {
            int x = que.poll();
            int y = que.poll();

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 0 && ny >= 0 && nx < M && ny < N) {
                    if (visited[nx][ny]) continue;
                    if (field[nx][ny] == 0) continue; 
    
                    que.add(nx);
                    que.add(ny);
                    visited[nx][ny] = true;
                }
            }
        }
    }
    
    static void pro() {
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (field[i][j] == 1 && !visited[i][j]){
                    bfs(i, j);
                    cnt++;
                }
            }
        }
        sb.append(cnt).append('\n');
        cnt = 0;
    }
    
    public static void main(String[] args) {
        T = scan.nextInt();
        for (int i = 0; i < T; i++) {
            input();
            pro();
        }
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