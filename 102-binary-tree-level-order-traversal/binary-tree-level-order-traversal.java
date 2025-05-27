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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> ans = new ArrayList<>();

        if (root == null) return ans;
        Queue<TreeNode> bfs = new LinkedList<>();
            bfs.add(root);

        while(!bfs.isEmpty()){
            int size = bfs.size();
            List<Integer> res = new ArrayList<>();
            for(int i=0; i<size; i++){
                TreeNode current = bfs.poll();
                  res.add(current.val);

                if (current.left != null){
                     bfs.add(current.left);
                }
                if (current.right != null){
                     bfs.add(current.right);
                }
            }
            ans.add(res);
        }
      return ans;
    }
}