import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        int first = 0, second = 1;
        int next;
        int i = 1;

        System.out.print("Fibonacci Series: ");

        while (i <= n) {
            System.out.print(first + " ");
            next = first + second;
            first = second;
            second = next;
            i++;
        }
    }
}
