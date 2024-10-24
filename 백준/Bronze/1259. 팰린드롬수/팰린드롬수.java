import java.io.*;
import java.util.*;

public class Main {
    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();

    static List<String> strList = new ArrayList<>();
    static String input;

    static void input() {
        while (!input.equals("0")) {
            strList.add(input);
            input = scan.nextLine();
        }
    }

    static boolean isSameNumber(String str, String reverseStr) {
        boolean flag = true;
        for (int i = 0; i < str.length(); i++) {
            char forward = str.charAt(i);
            char reverse = reverseStr.charAt(i);
            if (forward != reverse) {
                flag = false;
            }
        }

        return flag;
    }

    static void pro() {
        for (String str : strList) {
            String reverseStr = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                reverseStr += str.charAt(i);
            }

            if (isSameNumber(str, reverseStr)) {
                sb.append("yes");
            } else {
                sb.append("no");
            }
            sb.append("\n");
        }
    }

    public static void main(String[] args) {
        input = scan.nextLine();
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