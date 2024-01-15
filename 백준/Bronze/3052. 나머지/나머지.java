import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[42];
        int cnt = 0;
        int a = 0;

        for (int i = 0; i < 10; i++) {
            a = sc.nextInt();
            num[a % 42]++;
        }

        for (int i = 0; i < num.length; i++) {
            if(num[i] != 0){
                cnt++;
            }
        }

        System.out.println(cnt);

    }
}