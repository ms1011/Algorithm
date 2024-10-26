import java.io.*;
import java.util.*;

public class Main {
    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();

    static void rot13(char a) {
        int x = (int)a + 13;
        if (Character.isUpperCase(a) && x > 'Z') {
            x -= 26;
        }
        if (Character.isLowerCase(a) && x > 'z') {
            x -= 26;
        }
        
        sb.append((char)x);
    }

    static void pro() {
        String S = scan.nextLine();

        for (int i = 0; i < S.length(); i++) {
            char a = S.charAt(i);

            if (Character.isDigit(a) || a == ' ') {
                sb.append(a);
            } else {
                rot13(a);
            }
        }
    }

    public static void main(String[] args) {
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