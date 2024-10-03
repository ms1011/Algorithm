import java.io.*;
import java.util.*;

public class Main {
    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();

    static int N, M;
    static String[] A, B;
    static List<String> res = new ArrayList<>();

    static void input() {
        N = scan.nextInt();
        M = scan.nextInt();
        A = new String[N+1];
        B = new String[M+1];

        for (int i = 1; i <= N; i++) {
            A[i] = scan.nextLine();
        }
        for (int i = 1; i <= M; i++) {
            B[i] = scan.nextLine();
        }
    }

    static void binSearch(String[] A, int L, int R, String X) {

        while(L <= R) {
            int mid = (L + R) / 2;
            if (A[mid].equals(X)) {
                res.add(A[mid]);
            }

            if (A[mid].compareTo(X) < 0) {
                L = mid + 1;
            } else {
                R = mid - 1;
            }
        }
    }

    static void pro() {
        // A 정렬
        Arrays.sort(A, 1, N+1);
        
        // B 정렬 하나씩 선택해서 있는 지 탐색
        for (int i = 1; i <= M; i++) {
            binSearch(A, 1, N, B[i]);
        }

        // 정답 배열 정렬
        Collections.sort(res);

        System.out.println(res.size());
        for (String string : res) {
            System.out.println(string);
        }
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
