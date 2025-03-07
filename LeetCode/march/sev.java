package march;

import java.util.ArrayList;
import java.util.List;

public class sev {
    public static void main(String[] args) {
        
    }

     public List<Integer> rightSideView(TreeNode root) {
        List<Integer> reslt = new ArrayList<>();
        rightView(root, reslt, 0);
        return reslt;

    }
    public void rightView(TreeNode curr , List<Integer> result, int currDepth){
        if(curr == null) return;
        if(currDepth == result.size()){
            result.add(curr.val);
        }

        rightView(curr.right, result, currDepth + 1);
        rightView(curr.left, result, currDepth + 1);
    }

    public void leftView(TreeNode curr , List<Integer> result, int currDepth){
        if(curr == null) return;
        if(currDepth == result.size()){
            result.add(curr.val);
        }

        rightView(curr.left, result, currDepth + 1);
        rightView(curr.right, result, currDepth + 1);
    }

    public class TreeNode {
             int val;
             TreeNode left;
             TreeNode right;
             TreeNode() {}
             TreeNode(int val) { this.val = val; }
             TreeNode(int val, TreeNode left, TreeNode right) {
                 this.val = val;
                 this.left = left;
                this.right = right;
             }
         }
}
