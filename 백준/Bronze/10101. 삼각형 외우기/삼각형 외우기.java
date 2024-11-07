import java.io.*;
import java.util.*;

public class Main {
    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();

    static int[] arr = new int[3];

    static void input() {
        for (int i = 0; i < 3; i++) {
            arr[i] = scan.nextInt();
        }
    }

    static void pro() {
        if (arr[0] == 60 && arr[1] == 60 && arr[2] == 60) sb.append("Equilateral");
        else if ((arr[0] + arr[1] + arr[2]) == 180) {
            if ( (arr[0] == arr[1]) || (arr[0] == arr[2]) || (arr[1] == arr[2]) ) sb.append("Isosceles");
            else if ( (arr[0] != arr[1]) || (arr[0] != arr[2]) || (arr[1] != arr[2]) ) sb.append("Scalene");
        } else {
            sb.append("Error");
        }
    }

    public static void main(String[] args) {
        input();
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