import java.util.*;
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    
    TreeNode(int val){
        this.val = val;
    }
}
public class ValidBST{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        TreeNode root = buildTree(input);
        boolean isValid = isValid(root);
        System.out.println("Is valid BST?" + isValid);
    }
    public static TreeNode buildTree(String input){
        if(input.trim().isEmpty()) return null;
        
        String[] parts = input.split(",");
        Queue<TreeNode> q = new LinkedList<>();
        TreeNode root = new TreeNode(Integer.parseInt(parts[0].trim()));
        q.add(root);
        
        int i=1;
        while(!q.isEmpty() && i<parts.length){
            TreeNode cur = q.poll();
            if(i<parts.length && !parts[i].trim().equals("null")){
                cur.left = new TreeNode(Integer.parseInt(parts[i].trim()));
                q.add(cur.left);
            }
            i++;
         if(i<parts.length && !parts[i].trim().equals("null")){
            cur.right = new TreeNode(Integer.parseInt(parts[i].trim())); 
             q.add(cur.right);
         }
         i++;
        }
        return root;
    
    }
    public static boolean isValid(TreeNode root){
        return valid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    private static boolean valid(TreeNode node, long min, long max){
        if(node == null) return true;
        if(node.val<=min || node.val>=max) return false;
        return valid(node.left, min, node.val) && valid(node.right, node.val, max);
        
        
    }
}