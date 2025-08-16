import java.util.*;
public class Cocubes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n ; i++) {
            arr[i] = sc.nextInt();
        }
        if(isSorted(arr)){
            System.out.println("-1");
        }
        int count = 0;
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for(int i = n - 1; i > 0; i--){
            for(int j = i - 1 ; j > -1; j--){
                if(j < i && arr[j] > arr[i]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                    ans.add(new ArrayList<>(Arrays.asList(j+1, i+1)));
                    count += 1;
                }
            }
        }
        System.out.println(count);
        for(ArrayList<Integer> list : ans){
            for(int i : list){
                System.out.print(i+" ");
            }
            System.out.println();
        
        }
    }
    private static boolean isSorted(int[] arr) {
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < arr[i-1]){
                return false;
            }
        }
        return true;
    }
}  

    