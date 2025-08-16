import java.util.*;
public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Factorial of n is :" + fact(n));
        sc.close();
    }
    public  static int  fact(int n){
        if(n <= 1) 
        { 
            return 1;
        }
        return n * fact(n -1);


    }
    
}
