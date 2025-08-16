import java.util.*;
public class Span {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n  = sc.nextInt();
        int[] p =  new int[n];
        for (int idx = 0; idx < n; idx++) {
            p[idx] = sc.nextInt();
        }
        int [] sp = new int[n];
        sp[0] = 1;
        for(int i=1;i<n;i++){
            int s = 1;
            int j = i-1;
            while(j >= 0 && p[i]>=p[j]){
                s += sp[j];
                j -= sp[j];
            }
            sp[i] = s;

        }
        for(int i:sp){
            System.out.print(i);
        }
       
        }

    
}
    
