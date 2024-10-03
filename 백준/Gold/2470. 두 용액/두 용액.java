import java.io.*;
import java.util.*;

public class Main {
    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();

    static int N;
    static int[] A;

    static void input() {
        N = scan.nextInt();
        A = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            A[i] = scan.nextInt();
        }
    }

    static int lowerBound(int[] A, int L, int R, int X) {
        // A[L...R] 에서 X 이상의 수 중 제일 왼쪽 인덱스를 return 하는 함수
        // 그런 게 없다면 R + 1 을 return 한다
        // R + 1은 메소드 반환 후에, -1 하여 비교한다.
        int bound = R + 1;

        while (L <= R) {
            int mid = (L+R) / 2;
            if (A[mid] >= X) {
                bound = mid;
                R = mid - 1;
            } else {
                L = mid + 1;
            }
        }

        return bound;
    }

    static void pro() {
        Arrays.sort(A, 1, N + 1);

        int best = Integer.MAX_VALUE;
        int val1 = 0, val2 = 0;

        // 범위가 N - 1인 이유는 N은 이미 다른 숫자들과 전부 비교 됐기 때문에
        for (int i = 1; i <= N - 1; i++) {
            // A[i] 용액을 쓸 것이다. 고로 -A[i] 와 가장 가까운 용액을 자신의 오른쪽 구간에서 찾자.
            // i+1 부터 탐색하는 이유는 중복을 피하기 위해
            int res = lowerBound(A, i+1, N, -A[i]);
            
            // res - 1이 탐색 범위에 포함되는지 확인, 이유는 i + 1 보다 작다면 이미 탐색한 수 이니까
            if (i + 1 <= res - 1 && res - 1 <= N && Math.abs(A[i] + A[res - 1]) < best) {
                best = Math.abs(A[i] + A[res - 1]);
                val1 = A[i];
                val2 = A[res - 1];
            }
            
            if (i + 1 <= res && res <= N && Math.abs(A[i] + A[res]) < best) {
                best = Math.abs(A[i] + A[res]);
                val1 = A[i];
                val2 = A[res];
            }
        }
        sb.append(val1).append(' ').append(val2);
        System.out.println(sb);
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