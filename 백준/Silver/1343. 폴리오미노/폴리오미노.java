import java.io.*;
import java.util.*;

public class Main {
    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();

    static char[] board;
    static String A = "AAAA";
    static String B = "BB";

    static void input() {
        String input = scan.nextLine();
        board = new char[input.length()];
        for (int i = 0; i < input.length(); i++) {
            board[i] = input.charAt(i);
        }
    }
    
    static void pro() {
        int a = 0, b = 0;
        for (int i = 0; i < board.length; i++) {
            if (board[i] != '.') {
                a++;
                b++;
            } else {
                a = 0;
                b = 0;
            }

            if (b == 2) {
                for (int j = i; j > i-2; j--) {
                    board[j] = 'B';
                }
                b = 0;
            }

            if (a == 4) {
                for (int j = i; j > i-4; j--) {
                    board[j] = 'A';
                }
                a = 0;
                b = 0;
            }
        }

        for (int i = 0; i < board.length; i++) {
            if (board[i] == 'X') {
                sb.setLength(0);
                sb.append(-1);
                return;
            }
            sb.append(board[i]);
        }
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