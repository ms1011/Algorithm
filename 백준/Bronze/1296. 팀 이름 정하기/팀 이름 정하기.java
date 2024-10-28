import java.io.*;
import java.util.*;

public class Main {
    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();

    static String yundu, result = "";
    static int N, max = Integer.MIN_VALUE;
    static String[] names;

    static void input() {
        yundu = scan.nextLine();
        N = scan.nextInt();
        names = new String[N];
        for (int i = 0; i < N; i++) {
            names[i] = scan.nextLine();
        }
    }

    static void pro() {
        int yundu_L = yundu.length() - yundu.replaceAll("L", "").length();
        int yundu_O = yundu.length() - yundu.replaceAll("O", "").length();
        int yundu_V = yundu.length() - yundu.replaceAll("V", "").length();
        int yundu_E = yundu.length() - yundu.replaceAll("E", "").length();

        for (int i = 0; i < N; i++) {
            int L = yundu_L + names[i].length() - names[i].replaceAll("L", "").length();
            int O = yundu_O + names[i].length() - names[i].replaceAll("O", "").length();
            int V = yundu_V + names[i].length() - names[i].replaceAll("V", "").length();
            int E = yundu_E + names[i].length() - names[i].replaceAll("E", "").length();

            int percentage = ((L+O) * (L+V) * (L+E) * (O+V) * (O+E) * (V+E)) % 100;

            if (max < percentage) {
                max = percentage;
                result = names[i];
            } else if (max == percentage) {
                String[] compare = new String[2];
                compare[0] = result;
                compare[1] = names[i];
                Arrays.sort(compare);
                result = compare[0];
            }
        }

        System.out.println(result);
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