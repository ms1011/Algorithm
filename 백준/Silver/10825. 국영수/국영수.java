import java.io.*;
import java.util.*;

public class Main {
    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();

    static int N;
    static Elem[] student;

    static class Elem implements Comparable<Elem> {
        public String name;
        public int kor, eng, math;

        @Override
        public int compareTo(Elem other) {
            if (kor != other.kor) return other.kor - kor;
            if (eng != other.eng) return eng - other.eng;
            if (math != other.math) return other.math - math;

            return name.compareTo(other.name);
        }
    }

    static void input() {
        N = scan.nextInt();
        student = new Elem[N];

        for (int i = 0; i < N; i++) {
            student[i] = new Elem();
            student[i].name = scan.next();
            student[i].kor = scan.nextInt();
            student[i].eng = scan.nextInt();
            student[i].math = scan.nextInt();
        }
    }

    static void pro() {
        Arrays.sort(student);

        for (int i = 0; i < N; i++) {
            sb.append(student[i].name).append('\n');
        }
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