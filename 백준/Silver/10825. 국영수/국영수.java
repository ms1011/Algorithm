import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();

    static void input() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        a = new Elem[N];

        for (int i = 0; i < N; i++) {
            a[i] = new Elem();
            a[i].name = sc.next();
            a[i].korean = sc.nextInt();
            a[i].english = sc.nextInt();
            a[i].math = sc.nextInt();
        }
    }

    static int N;
    static Elem[] a;

    static class Elem implements Comparable<Elem> {

        public String name;
        public int korean, english, math;

        @Override
        public int compareTo(Elem other) {
            // 국어 점수 내림차순
            if (korean != other.korean) return other.korean - korean;
            // 영어 점수 오름차순
            if (english != other.english) return english - other.english;
            // 수학 점수 내림차순
            if (math != other.math) return other.math - math;
            // 이름 순으로 정렬 - String 에 compareTo 내장
            return name.compareTo(other.name);
        }
    }

    static void pro() {
        Arrays.sort(a);

        for (Elem elem : a) {
            sb.append(elem.name).append('\n');
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        input();
        pro();
    }
}