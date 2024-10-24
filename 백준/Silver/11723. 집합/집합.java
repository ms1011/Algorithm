import java.io.*;
import java.util.*;

public class Main {
    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();

    static int M;
    static List<Integer> S = new ArrayList<>();
    
    static void input() {
        M = scan.nextInt();
    }

    static void execute(String command, int x) {
        switch (command) {
            case "add":
                if (S.contains(x)) break;
                S.add(x);
                break;

            case "remove":
                if (!S.contains(x)) break;
                S.remove(Integer.valueOf(x));
                break;
                
                case "check":
                if (S.contains(x)) sb.append(1).append("\n");
                else sb.append(0).append("\n");
                break;
                
                case "toggle":
                if (S.contains(x)) {
                    S.remove(Integer.valueOf(x));
                } else {
                    S.add(x);
                }
                break;

            case "all":
                S.clear();
                for (int i = 1; i <= 20; i++) {
                    S.add(i);
                }
                break;

            case "empty":
                S.clear();
                break;

            default:
                break;
        }
    }

    static void pro() {
        for (int i = 0; i < M; i++) {
            String[] input = scan.nextLine().split(" ");
            String command = input[0];
            int x = 0;
            if (input.length > 1) {
                x = Integer.valueOf(input[1]);
            }
            execute(command, x);
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