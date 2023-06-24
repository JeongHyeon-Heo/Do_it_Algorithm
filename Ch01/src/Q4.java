import java.util.Scanner;

// 세값의 대소 관계인 13가지 조합의 중앙값을 구하여 출력하는 프로그램
public class Q4 {

    static int median_Number(int a, int b, int c) {
        if (a >= b) {
            if (b >= c) {
                return b;
            } else if (a <= c) {
                return a;
            } else {
                return c;
            }
        } else if (a > c) {
            return a;
        } else if (b > c) {
            return c;
        } else
            return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(" 중앙값은 " + median_Number(a, b, c)+" 입니다.");
    }
}
