import java.io.*;
import java.util.*;

public class Main {
    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();

    static int N, K;
    static char[] abc;

    static void input() {
        N = scan.nextInt();
        K = scan.nextInt();
        abc = new char[N];
        Arrays.fill(abc, '?');
    }

    static void pro() {
        int idx = 0;
        for (int i = 0; i < K; i++) {
            int S = scan.nextInt();
            char c = scan.next().charAt(0);
            
            // 반시계 방향으로 돌아야 하므로 뺄셈
            idx -= S % N;
            if (idx < 0) {
                idx += N;
            }
            
            // 이미 값이 들어있으면서 다른 문자가 들어오게되면 "!" 출력(종이에 해당하는 행운의 바퀴가 아님)
            if (abc[idx] != '?' && abc[idx] != c) {
                sb.append('!');
                return;
            }
            
            abc[idx] = c;
        }
        
        if (!duplicateCheck()) return;
        
        for (int i = idx; i < N + idx; i++) {
            sb.append(abc[i % N]);
        }
    }
    
    static boolean duplicateCheck() {
        Set<Character> charSet = new HashSet<>();
        for (char c : abc) {
            // '?'가 아니면서 값이 이미 존재하면
            if (c != '?' && !charSet.add(c)) { 
                sb.append('!');
                return false;
            }
        }
        return true;
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