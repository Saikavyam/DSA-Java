import java.util.*;
public class reverseOfNum {
    public static int reverse(int num, int rev) {
        if (num == 0) return rev;
        return reverse(num / 10, rev * 10 + num % 10);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        int reversed = reverse(num, 0);
        System.out.println("Reversed Number: " + reversed);
    }
}
