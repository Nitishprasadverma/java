package Trees.binaryTree;

public class symmetric {
    public static void main(String[] args) {

    }

    public boolean isSymmetric(TreeNode root) {
            return root == null || isSymmetricHelper(root.left, root.right);
    }

    private boolean isSymmetricHelper(TreeNode left, TreeNode rihgt){
        if(left == null || rihgt == null) return left == rihgt;

        if(left.val != rihgt.val) return false;

        return isSymmetricHelper(left.left, rihgt.right) && isSymmetricHelper(left.right, rihgt.left);
    }

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
}
