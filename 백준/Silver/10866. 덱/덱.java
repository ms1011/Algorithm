import java.io.*;
import java.util.*;

public class Main {
    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();

    static int N;
    static Deque<Integer> deque = new LinkedList<>();

    static void input() {
        N = scan.nextInt();
    }

    static boolean emptyCheck() {
        if (deque.isEmpty()) return true;
        return false;
    }

    static void execute(String command, int x) {
        switch (command) {
            case "push_front":
                deque.addFirst(x);
                break;
            case "push_back":
                deque.addLast(x);
                break;
            case "pop_front":
                if (emptyCheck()) sb.append(-1).append("\n");
                else sb.append(deque.pollFirst()).append("\n");
                break;
            case "pop_back":
                if (emptyCheck()) sb.append(-1).append("\n");
                else sb.append(deque.pollLast()).append("\n");
                break;
            case "size":
                sb.append(deque.size()).append("\n");
                break;
            case "empty":
                if (emptyCheck()) sb.append(1).append("\n");
                else sb.append(0).append("\n");
                break;
            case "front":
                if (emptyCheck()) sb.append(-1).append("\n");
                else sb.append(deque.peekFirst()).append("\n");
                break;
            case "back":
                if (emptyCheck()) sb.append(-1).append("\n");
                else sb.append(deque.peekLast()).append("\n");
                break;
        }
    }

    static void pro() {
        int x = 0;
        for (int i = 0; i < N; i++) {
            String[] input = scan.nextLine().split(" ");
            String command = input[0];
            try {
                x = Integer.parseInt(input[1]);
            } catch (Exception e) {
                // TODO: handle exception
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