import java.io.*;
import java.util.*;

public class Main {
    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();

    static int N;
    static String[] files;
    static String common;

    static void input() {
        N = scan.nextInt();
        files = new String[N];

        for (int i = 0; i < N; i++) {
            files[i] = scan.nextLine();
        }

        common = files[0];
    }

    static void pro() {
        for (String file : files) {
            String temp = "";

            for (int i = 0; i < file.length(); i++) {
                char fileChar = file.charAt(i);
                char commonChar = common.charAt(i);

                if (fileChar == commonChar) {
                    temp += fileChar;
                } else {
                    temp += "?";
                }
            }

            common = temp;
        }

        System.out.println(common);
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