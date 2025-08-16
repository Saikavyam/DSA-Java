import java.util.*;
public class  LinearSearch1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int ans = linearSearch(arr, target);
        System.out.println( "The element  is at " +ans);
    }
    public static int linearSearch(int [] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for(int i= 0;i<arr.length;i++){
            int element = arr[i];

            if(element == target){
                return i ;
            }
        }
        return -1;

    }

}