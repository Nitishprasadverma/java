
import java.util.*;
public abstract class FifteenMay25 {
    
}

//LeetCode 2900+++++++++++++++++++++++++++++++++++++++++++
class Solution1 {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String> ans = new ArrayList<>();

        for(int i = 0; i < groups.length; i++){
            if(i == 0 || groups[i - 1] != groups[i]){
                ans.add(words[i]);
            }
        }
        return ans;
    }
}

//LeetCode 970 +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
class Solution {
    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        int i = 0;
        Set<Integer> set = new HashSet<>();

        while(Math.pow(x,i) <= bound){
int j = 0;
            while((Math.pow(x,i) + Math.pow(y, j))<= bound){
                int num =(int) (Math.pow(x,i) + Math.pow(y, j));
                set.add(num );
                if(y == 1) break;
                j++;
            }

            if(x == 1) break;
            i++;
        }

        List<Integer> ans = new ArrayList<>(set);
        return ans;
    }
}


  //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
// LeetCode 111

// /**
//  * Definition for a binary tree node.
//   public class TreeNode {
//       int val;
//     TreeNode left;
//      TreeNode right;
//      TreeNode() {}
//       TreeNode(int val) { this.val = val; }
//       TreeNode(int val, TreeNode left, TreeNode right) {
//           this.val = val;
//           this.left = left;
//          this.right = right;
//       }
//   }
 
// class Solution1 {
//     public int minDepth(TreeNode root) {
//        if(root == null) return 0;
//        if(root.left == null) return 1 + minDepth(root.right);

//        if(root.right == null) return 1+ minDepth(root.left);
       

//        return 1 + Math.min(minDepth(root.left), minDepth(root.right));  
//     }
// }