import java.io.*;
import java.util.*;

public class Main {
    static class Elem implements Comparable<Elem> {
        int start;
        int end;

        public Elem(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public int compareTo(Elem o) {
            if (this.start == o.start) return this.end - o.end;
            return this.start - o.start;
        }
    }

    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();

    static int N, room = 0;
    static Elem[] study;
    
    static void input() {
        N = scan.nextInt();
        study = new Elem[N];
        for (int i = 0; i < N; i++) {
            int start = scan.nextInt();
            int end = scan.nextInt();
            study[i] = new Elem(start, end);
        }
    }

    static void pro() {
        Arrays.sort(study);

        Queue<Integer> pque = new PriorityQueue<>();
        pque.add(study[0].end);

        for (int i = 1; i < N; i++) {
            if (pque.peek() <= study[i].start) {
                pque.poll();
            }
            pque.add(study[i].end);
        }

        sb.append(pque.size());
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