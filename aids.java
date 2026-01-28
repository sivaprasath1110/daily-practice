public class aids {
    public static void main(String[] args) {
System.out.println("Numbers from 1 to 100:");
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }

        // 2. Even numbers from 1 to 50
        System.out.println("\n\nEven numbers from 1 to 50:");
        for (int i = 1; i <= 50; i++) {   
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        // 3. Multiplication table of 11
        System.out.println("\n\nMultiplication table of 11:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("11 x " + i + " = " + (11 * i));
        }

        // 4. Factorial
        int n = 5;
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("\nFactorial of " + n + " = " + fact);
    }
}
