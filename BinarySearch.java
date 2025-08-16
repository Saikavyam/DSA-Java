import java.util.*;
public class BinarySearch {
    public static void main(String args[]){
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        Arrays.sort(arr);
        System.out.println("The target element is found at index : " +binarySearch(arr,target));
    }
    public static int binarySearch(int[] arr, int target){
        int start = 0;
        int end  = arr.length -1;
        while(start<=end){
            int mid = start + (end-start)/2 ;
            if(target < arr[mid]){
                end = mid-1 ; 
            }else if(target>arr[mid]){
                start = mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    
}
