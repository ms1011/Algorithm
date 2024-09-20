import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static Scanner sc = new Scanner(System.in);

    static int T, N, M;
    static int[] A, B;

    static void input() {
        N = sc.nextInt();
        M = sc.nextInt();
        A = new int[N + 1];
        B = new int[M + 1];
        for (int i = 1; i <= N; i++) {
            A[i] = sc.nextInt();
        }
        for (int i = 1; i <= M; i++) {
            B[i] = sc.nextInt();
        }
    }

    static int lower_bound(int[] A, int L, int R, int X) {
        int res = L - 1;
        while (L <= R) {
            int mid = (L + R) / 2;
            if (A[mid] < X) {
                res = mid;
                L = mid + 1;
            } else {
                R = mid - 1;
            }
        }
        return res;
    }

    static void pro() {
        Arrays.sort(B);

        int ans = 0;
        for (int i = 1; i <= N; i++) {
            ans += lower_bound(B, 1, M, A[i]);
        }
        System.out.println(ans);
    }


    public static void main(String[] args) {
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            input();
            pro();
        }
    }
}