/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    int max = 0;//全局变量
    public int diameterOfBinaryTree(TreeNode root) {
        if(root != null){
            treedeep(root);
            return max;
        }
        return 0;
    }
    public int treedeep(TreeNode root){
        if(root != null){
            //计算左右子树深度之和，与max比较
            //再返回该子树的深度
            int right = treedeep(root.right);
            int left = treedeep(root.left);
            if(right + left > max)
                max = right + left;
            return Math.max(left, right) + 1;
        }
        return 0;
    }
}