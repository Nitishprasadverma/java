package StriverBinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

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
        inOrder(arr, root);
        return arr;

    }

    public void inOrder(List<Integer> arr, TreeNode root) {
        if (root == null)
            return;

        inOrder(arr, root.left);
        arr.add(root.val);
        inOrder(arr, root.right);

    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        postOrder(arr, root);
        return arr;
    }

    public void postOrder(List<Integer> arr, TreeNode root) {
        if (root == null)
            return;

        postOrder(arr, root.left);
        postOrder(arr, root.right);
        arr.add(root.val);

    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();

        List<List<Integer>> list = new LinkedList<List<Integer>>();
        if (root == null)
            return list;

        queue.offer(root);

        while (!queue.isEmpty()) {

            int levelNum = queue.size();

            List<Integer> subList = new LinkedList<Integer>();

            for (int i = 0; i < levelNum; i++) {
                if (queue.peek().left != null)
                    queue.offer(queue.peek().left);
                if (queue.peek().right != null)
                    queue.offer(queue.peek().right);
                subList.add(queue.poll().val);
            }
            list.add(subList);
        }
        return list;
    }

    // iterative preorder traversal
    public List<Integer> iterativepPreorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();

        if (root == null)
            return list;
        Stack<TreeNode> st = new Stack<TreeNode>();
        st.push(root);
        while (!st.isEmpty()) {
            root = st.pop();
            list.add(root.val);

            if (root.right != null)
                st.push(root.right);

            if (root.left != null)
                st.push(root.left);
        }
        return list;

    }

    // Iterative inorder traversal
    public List<Integer> iterativeInorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode node = root;
        while (true) {
            if (node != null) {
                stack.push(node);
                node = node.left;
            } else {
                if (stack.isEmpty()) {
                    break;
                }
                node = stack.pop();
                list.add(node.val);
            }
        }
        return list;
    }


    //Iterative 
    public List<Integer> IterativePostorderTraversal(TreeNode root){
        Stack<TreeNode> st1 = new Stack<TreeNode>();
        Stack<TreeNode> st2 = new Stack<TreeNode>();
        List<Integer> list = new ArrayList<Integer>();

        if(root == null) return list;

        st1.push(root);
        while (!st1.isEmpty()) {
            root = st1.pop();
            st2.add(root);

            if(root.left != null) st1.add(root.left);
            if(root.right != null) st1.push(root.right);
        }

        while (!st2.isEmpty()) {
            list.add(st2.pop().val);
        }

        return list;
    }

//Height of binary tree
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        int left = 1 + maxDepth(root.left);
        int right = 1 + maxDepth(root.right);

        return Math.max(left,right);
    }
    
}
