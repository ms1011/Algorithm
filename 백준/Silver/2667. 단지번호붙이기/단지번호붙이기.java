import java.io.*;
import java.util.*;

public class Main {
    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();

    static int N, cnt;
    static ArrayList<Integer> group;
    static boolean[][] visited;
    static int [][] adj;
    static int [][] map;
    static int[] dx = {0,0,1,-1};
    static int[] dy = {1,-1,0,0};

    static void input() {
        N = scan.nextInt();
        adj = new int[N][N];
        visited = new boolean[N][N];

        map = new int[N][N];
        for (int i = 0; i < N; i++) {
            String input = scan.nextLine();
            for (int j = 0; j < N; j++) {
                map[i][j] = input.charAt(j) - '0';
            }
        }
    }

    static void pro() {
        group = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] == 1 && !visited[i][j]) {
                    cnt = 1;
                    bfs(i, j);
                    group.add(cnt);
                }
            }
        }

        Collections.sort(group);
        sb.append(group.size()).append('\n');
        for (int cnt : group) {
            sb.append(cnt).append('\n');
        }
        System.out.print(sb);
    }

    static void bfs(int x, int y) {
        Queue<int[]> que = new LinkedList<>();

        que.add(new int[]{x, y});
        visited[x][y] = true;

        while (!que.isEmpty()) {
            int curX = que.peek()[0];
            int curY = que.peek()[1];
            que.poll();

            for (int i = 0; i < 4; i++) {
                int nx = curX + dx[i];
                int ny = curY + dy[i];

                if (nx >= 0 && ny >= 0 && nx < N && ny < N) {
                    if (map[nx][ny] == 1 && !visited[nx][ny]) {
                        que.add(new int[]{nx, ny});
                        visited[nx][ny] = true;
                        cnt++;
                    }
                }
            }
        }
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