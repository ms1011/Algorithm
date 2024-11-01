import java.io.*;
import java.util.*;

public class Main {
    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();

    static int N;
    static List<Elem> list = new ArrayList<>();

    static class Elem implements Comparable<Elem> {

        String name;
        int date, month, year;

        @Override
        public int compareTo(Elem other) {
            if (year != other.year) return other.year - year;
            if (month != other.month) return other.month - month;
            return other.date - date;
        }
    }

    static void input() {
        N = scan.nextInt();

        for (int i = 0; i < N; i++) {
            String[] input = scan.nextLine().split(" ");
            Elem elem = new Elem();
            elem.name = input[0];
            elem.date = Integer.parseInt(input[1]);
            elem.month = Integer.parseInt(input[2]);
            elem.year = Integer.parseInt(input[3]);

            list.add(elem);
        }
    }
    
    static void pro() {
        Collections.sort(list);

        sb.append(list.get(0).name).append('\n');
        sb.append(list.get(list.size() - 1).name);
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