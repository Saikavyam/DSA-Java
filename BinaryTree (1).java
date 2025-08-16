import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class BinaryTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read number of nodes
        int n = sc.nextInt();
        if (n == 0) {
            System.out.println(0);
            return;
        }
        
        // Read level-order traversal
        int[] nodes = new int[n];
        for (int i = 0; i < n; i++) {
            nodes[i] = sc.nextInt();
        }
        
        // Build tree from level-order input
        TreeNode root = buildTree(nodes);
        
        // Calculate and print height
        int height = calculateHeight(root);
        System.out.println("Height of the tree is: "+ height);
        bfs(root);
        System.out.println();
        dfs(root);
    }

    // Build binary tree from level-order array
    private static TreeNode buildTree(int[] nodes) {
        if (nodes.length == 0) return null;
        
        TreeNode root = new TreeNode(nodes[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        
        int i = 1;
        while (!queue.isEmpty() && i < nodes.length) {
            TreeNode current = queue.poll();
            
            if (i < nodes.length && nodes[i] != -1) {
                current.left = new TreeNode(nodes[i]);
                queue.add(current.left);
            }
            i++;
            
            if (i < nodes.length && nodes[i] != -1) {
                current.right = new TreeNode(nodes[i]);
                queue.add(current.right);
            }
            i++;
        }
        
        return root;
    }

    // Calculate height of binary tree
    private static int calculateHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = calculateHeight(root.left);
        int rightHeight = calculateHeight(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }
    // bfs traversal : levelorder:
    public static void bfs(TreeNode root){
        if(root == null) return;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode curr = q.poll();
            System.out.print(curr.val+" ");
            if(curr.left !=null) q.add(curr.left);
            if(curr.right != null) q.add(curr.right);
        }
    }
    // dfs traversal : preorder
    public static void  dfs(TreeNode root){
        if(root == null) return;
        System.out.print(root.val +" ");
        dfs(root.left);
        dfs(root.right);
    }
    
}