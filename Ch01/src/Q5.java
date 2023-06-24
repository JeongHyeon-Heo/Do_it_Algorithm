import java.util.Scanner;


// 다음과 같은 코드가 Q4의 코드에 비해 효율이 떨어지는 이유는 ?
public class Q5 {
    static int med3(int a, int b, int c) {
        if ((b >= a && c <= a) || (b <= a && c >= a)) {
            return a;
        } else if ((a > b && c < b) || (a < b && c > b)) {
            return b;
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("중앙값은 "+med3(a,b,c) + " 입니다." );
    }
}
