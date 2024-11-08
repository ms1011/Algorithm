import java.io.*;
import java.util.*;

public class Main {
    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();

    static int W, H, cnt = 0;
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {1, -1, 0, 0, -1, -1, 1, 1};
    static int[] dy = {0, 0, 1, -1, -1, 1, -1, 1};

    static boolean input() {
        W = scan.nextInt();
        H = scan.nextInt();
        if (W == 0 && H == 0) return false;
        map = new int[H+1][W+1];
        visited = new boolean[H+1][W+1];

        for (int i = 1; i <= H; i++) {
            for (int j = 1; j <= W; j++) {
                map[i][j] = scan.nextInt();
            }
        }

        return true;
    }

    static void bfs(int startX, int startY) {
        Queue<Integer> que = new LinkedList<>();
        que.add(startX);
        que.add(startY);
        visited[startX][startY] = true;

        while (!que.isEmpty()) {
            int x = que.poll();
            int y = que.poll();

            for (int i = 0; i < 8; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx > 0 && ny > 0 && nx <= H && ny <= W) {
                    if (visited[nx][ny]) continue;
                    if (map[nx][ny] == 0) continue;
                    que.add(nx);
                    que.add(ny);
                    visited[nx][ny] = true;
                }
            }
        }
    }

    static void pro() {
        while (true) {
            if (!input()) return;
            for (int i = 1; i <= H; i++) {
                for (int j = 1; j <= W; j++) {
                    if (visited[i][j]) continue;
                    if (map[i][j] == 0) continue;
                    bfs(i, j);
                    cnt++;
                }
            }
            sb.append(cnt).append('\n');
            cnt = 0;
        }
    }
    
    public static void main(String[] args) {
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