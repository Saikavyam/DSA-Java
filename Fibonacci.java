import java.util.Scanner;

public class Fibonacci {
    private static long[] memo;

    public static long fibonacci(int n) {
        // Base Cases
        if (n <= 0) return 0;
        if (n == 1) return 1;


        if (memo[n] != -1) {
            return memo[n];
        }

        memo[n] = fibonacci(n - 1) + fibonacci(n - 2);
        return memo[n];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        memo = new long[n + 1];
        for (int i = 0; i <= n; i++) {
            memo[i] = -1;  
        }

        System.out.println("Fibonacci series up to " + n + ":");
        for (int i = 0; i <= n; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        scanner.close();
    }
}
