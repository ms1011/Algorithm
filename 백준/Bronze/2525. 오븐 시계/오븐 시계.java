import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt();
        int num = sc.nextInt();

        if (m + num >= 60){
            h += (m + num) / 60;
            m = (m + num) % 60;
            if(h >= 24) {
                h -= 24;
            }
        } else {
            m += num;
        }
        System.out.println(h + " " + m);
    }
}
