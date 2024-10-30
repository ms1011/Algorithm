import java.io.*;
import java.util.*;

public class Main {
    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();

    static String N;
    static int[] nums = new int[10];
    static int cnt = -1;

    static void input() {
        N = scan.nextLine();
    }
    
    static void pro() {
        for (int i = 0; i < N.length(); i++) {
            int x = Integer.parseInt(String.valueOf(N.charAt(i)));

            nums[x]++;
        }

        // 6과 9의 갯수 평준화
        if (nums[6] != nums[9]) {
            int sum = nums[6] + nums[9];
            nums[6] = sum / 2;
            nums[9] = sum / 2;
            if (sum % 2 == 1) {
                nums[6]++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            cnt = Math.max(cnt, nums[i]);
        }
    }

    public static void main(String[] args) {
        input();
        pro();
        System.out.println(cnt);
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