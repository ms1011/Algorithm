import java.io.*;
import java.util.*;

public class Main {
    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();

    static int[] trees = new int[6];

    static void input() {
        for (int i = 1; i <= 5; i++) {
            trees[i] = scan.nextInt();
        }
    }

    static void print() {
        for (int i = 1; i <= 5; i++) {
            sb.append(trees[i]).append(' ');
        }
        sb.append('\n');
    }

    static boolean isSorted() {
        boolean res = true;
        for (int i = 1; i <= 5; i++) {
            if (trees[i] != i) {
                res = false;
            }
        }

        return res;
    }


    static void pro() {
        while (true) {
            if (isSorted()) break;
            for (int i = 1; i < 5; i++) {
                if (trees[i] > trees[i+1]) {
                    int temp = trees[i];
                    trees[i] = trees[i+1];
                    trees[i+1] = temp;
                    print();
                }
            }
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