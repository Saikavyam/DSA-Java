import java.util.*;
class TreeNode{
    int val;
    TreeNode left, right;
    
    TreeNode(int val){
        this.val = val;
        left = right = null;
    }
    
}
public class Main{
    public static TreeNode insert(TreeNode root, int val){
        if(root == null){
            return new TreeNode(val);
        }
        if(val<root.val){
            root.left = insert(root.left, val);
        }else if(val>root.val){
            root.right = insert(root.right, val);
        }
        
        return root;
    }
    public static TreeNode buildBst(int[] nodes){
        TreeNode root = null;
        for(int val:nodes){
            root = insert(root, val);
        }
        return root;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nodes[] = new int[n];
        for(int i=0;i<n;i++){
            nodes[i] = sc.nextInt();
        }
        TreeNode root = buildBst(nodes);
        System.out.println("InOrder");
        inorder(root);
        
    }
    public static void inorder(TreeNode root){
        if(root==null) return;
        inorder(root.left);
        System.out.println(root.val+" ");
        inorder(root.right);
    }
}