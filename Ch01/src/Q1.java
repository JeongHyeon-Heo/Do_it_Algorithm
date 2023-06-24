import java.util.Scanner;

// 세 값의 최댓값을 구하는 Max3 메서드를 작성하라.
public class Q1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("세 정수의 최댓 값을 구합니다.");
        System.out.println("a의 값 : ");
        int a = sc.nextInt();
        System.out.println("b의 값 : ");
        int b = sc.nextInt();
        System.out.println("c의 값 : ");
        int c = sc.nextInt();

        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }

        System.out.println("최댓값은 " + max + "입니다.");


    }
}
