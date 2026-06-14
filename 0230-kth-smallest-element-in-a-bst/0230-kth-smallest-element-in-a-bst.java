/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
           static int value=Integer.MIN_VALUE;
static int count=0;
    public int kthSmallest(TreeNode root, int k) {
        value=0;
        count=0;
        disp(root,k);
        return value;
    }
    static void disp(TreeNode root,int k){
        if(root==null) return ;
        disp(root.left,k);
        if(count<k){value=Math.max(root.val, value);
            count++;}
            else{value=value;}
        disp(root.right,k);
        
       
    }
}