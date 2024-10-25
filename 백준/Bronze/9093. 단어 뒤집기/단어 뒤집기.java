import java.io.*;
import java.util.*;

public class Main {
    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();

    static int T;
    static String[] strArr;

    static void input() {
        T = scan.nextInt();
        strArr = new String[T];

        for (int i = 0; i < T; i++) {
            strArr[i] = scan.nextLine();
        }
    }


    static void pro() {
        for (String str : strArr) {
            String[] words = str.split(" ");
            for (int i = 0; i < words.length; i++) {
                for (int j = words[i].length() - 1; j >= 0; j--) {
                    sb.append(words[i].charAt(j));
                }
                sb.append(" ");
            }
            sb.append("\n");
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