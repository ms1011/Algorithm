import java.io.*;
import java.util.*;

public class Main {
    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();

    static int N, M;
    static int[] arr, used, selected;
    
    static void input() {
        N = scan.nextInt();
        M = scan.nextInt();
        arr = new int[N+1];
        used = new int[N+1];
        selected = new int[M+1];

        for (int i = 1; i <= N; i++) {
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr, 1, N+1);
    }


    static void pro(int x) {
        if (x == M + 1) {
            for (int i = 1; i <= M; i++) {
                sb.append(selected[i]).append(' ');
            }
            sb.append('\n');
        } else{
            int lastSelect = 0;
            for (int i = 1; i <= N; i++) {
                if (used[i] == 1) continue;
                if (arr[i] == lastSelect) continue;
                
                lastSelect = arr[i];
                selected[x] = arr[i];
                used[i] = 1;
                pro(x + 1);
                selected[x] = 0;
                used[i] = 0;
            }
        }
        
    }

    public static void main(String[] args) {
        input();
        pro(1);
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