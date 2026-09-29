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
    public void allpaths(TreeNode root,StringBuilder res,List<String> arr)
    {
        if(root==null)
        {
            return;
        }
        int len=res.length();
        res.append(root.val);
        if(root.left==null && root.right==null)
        {
            arr.add(res.toString());
            res.setLength(len);
            return;
        }
        res.append("->");
        allpaths(root.left,res,arr);
        allpaths(root.right,res,arr);
        res.setLength(len);
    }
    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> arr=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        allpaths(root,sb,arr);
        return arr;
    }
}