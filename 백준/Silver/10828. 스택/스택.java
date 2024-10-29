import java.io.*;
import java.util.*;

public class Main {
    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();

    static int N;
    static Stack<Integer> stack = new Stack<>();

    static void input() {
        N = scan.nextInt();
    }

    static void execute(String command) {
        switch (command) {
            case "pop":
                if (stack.empty()) sb.append("-1");
                else sb.append(stack.pop());
                sb.append("\n");
                break;
            case "size":
                sb.append(stack.size()).append("\n");
                break;
            case "empty":
                if (stack.empty()) {
                    sb.append("1");
                } else {
                    sb.append("0");
                }
                sb.append("\n");
                break;
            case "top":
                if (stack.empty()) {
                    sb.append("-1");
                } else {
                    sb.append(stack.peek());
                }
                sb.append("\n");
                break;
        }
    }
    
    static void pro() {
        for (int i = 0; i < N; i++) {
            String[] input = scan.nextLine().split(" ");
            String command = input[0];
            int x = -1;
            try {
                x = Integer.parseInt(input[1]);
                stack.add(x);
            } catch (Exception e) {
                execute(command);
            }
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