class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return helper(preorder, inorder, 0, 0, inorder.length - 1);
    }

    private TreeNode helper(int[] preorder, int[] inorder, int preIndex, int i, int j) {
        if (preIndex >= preorder.length || i > j) {
            return null;
        }

        int rootVal = preorder[preIndex];
        TreeNode root = new TreeNode(rootVal);
        
        int inIndex = i;
        while (inIndex <= j && inorder[inIndex] != rootVal) {
            inIndex++;
        }

        int leftTreeSize = inIndex - i;

        
        root.left = helper(preorder, inorder, preIndex + 1, i, inIndex - 1);
        root.right = helper(preorder, inorder, preIndex + 1 + leftTreeSize, inIndex + 1, j);

        return root;
    }
}
