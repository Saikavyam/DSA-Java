import java.util.*;
class PascalTriangle{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows the traingle should have : ");
        int n = sc.nextInt();
        System.out.println("The list of elements in each row of pascal's triangle are as follows: ");
        System.out.println(pascalRows(n));
    }
    public static List<List<Integer>> pascalRows(int n){
        ArrayList<List<Integer>> mbfilms = new ArrayList<>();
        if(n==0){
            return mbfilms;
        }
        for(int i=0;i<n;i++){
            ArrayList<Integer> cultclassic = new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    cultclassic.add(1);
                }else{
                    int movies =  mbfilms.get(i-1).get(j-1) + mbfilms.get(i-1).get(j);
                    cultclassic.add(movies);
                }
            }
            mbfilms.add(cultclassic);
        }
        return mbfilms;
    }
}