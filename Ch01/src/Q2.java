import java.util.Scanner;

// 네 값의 최댓값을 구하는 max4 메서드를 작성하라.
public class Q2 {



    static int max_number(int a, int b, int c, int d) {

        int max=a;

        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        if (d > max) {
            max = d;
        }

        return max;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        System.out.println(max_number(a,b,c,d));


    }
}
