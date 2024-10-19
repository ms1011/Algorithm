import java.io.*;
import java.util.*;

public class Main {
    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();

    static int N, M;
    static boolean[][] board;
    static int min = Integer.MAX_VALUE;

    static void input() {
        N = scan.nextInt();
        M = scan.nextInt();
        board = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String str = scan.nextLine();
            for (int j = 0; j < M; j++) {
                if (str.charAt(j) == 'W') {
                    board[i][j] = true;
                } else {
                    board[i][j] = false;
                }
            }
        }
    }

    static void switchColor(int startRow, int startCol) {
        int count = 0;

        // 첫 번째 칸의 색
        boolean color = board[startRow][startCol];

        for (int x = startRow; x < startRow + 8; x++) {
            for (int y = startCol; y < startCol + 8; y++) {
                
                if (board[x][y] != color) {
                    count++;
                }

                // 다음 칸은 색이 바껴야 하므로 색 전환
                color = !color;
            }

            // 다음 줄의 시작 색은 이전 줄의 시작 색과 달라야 하므로
            color = !color;
        }

        // 흰색 체스판을 기준으로 할 때와 검은색 체스판을 기준으로 할 때 중 더 적은 변화가 일어난 갯수
        count = Math.min(count, 64 - count);

        // 흑 백 최솟값 뿐 아니라, 총 경우의 수 중 최솟값을 갱신
        min = Math.min(min, count);
    }

    static void pro() {

        // N-7과 M-7은 각각 8x8 체스판을 선택할 수 있는 시작 위치의 범위를 의미한다.
        // 예를 들어 N이 10이면 8x8 크기의 체스판이 시작할 수 있는 행의 최대 시작점은 N-8=2이다.
        // 즉, 행은 0 ~ (N-8)까지, 열은 0 ~ (M-8)까지 검사하여 모든 가능한 위치에서 8x8 체스판을 만든다.
        for (int i = 0; i < N - 7; i++) {
            for (int j = 0; j < M - 7; j++) {
                switchColor(i, j);
            }
        }
        
        System.out.println(min);
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