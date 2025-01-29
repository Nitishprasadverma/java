package StriverBinaryTree;

import java.util.ArrayList;
import java.util.List;

public class Tree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        // store preorder traversal values
        List<Integer> arr = new ArrayList<>();
        // Call the preorder traversal function
        preorder(root, arr);
        // Return the resulting list
        // containing preorder traversal values
        return arr;
    }

    static void preorder(TreeNode root, List<Integer> arr) {
        // If the current node is NULL
        // (base case for recursion), return
        if (root == null) {
            return;
        }
        // Push the current node's
        // value into the list
        arr.add(root.val);
        // Recursively traverse
        // the left subtree
        preorder(root.left, arr);
        // Recursively traverse
        // the right subtree
        preorder(root.right, arr);
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
 inOrder(arr,root);
 return arr;

    }

public void inOrder(List<Integer>arr, TreeNode root){
    if(root == null) return;

    inOrder( arr,root.left);
    arr.add(root.val);
    inOrder(arr,root.right);
    
}

public List<Integer> postorderTraversal(TreeNode root) {
    List<Integer> arr = new ArrayList<>();
    postOrder(arr,root);
    return arr;
}

public void postOrder(List<Integer> arr, TreeNode root){
    if(root == null) return ;

    postOrder(arr, root.left);
    postOrder(arr,root.right);
    arr.add(root.val);
    
}
}
