class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}

class maxDepth {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;

        int lh = maxDepth(root.left);
        int rh = maxDepth(root.right);

        return 1 + Math.max(lh, rh);
    }

    public static void main(String[] args) {
        // Creating tree manually 🌳
        /*
                1
               / \
              2   3
             /
            4
        */

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);

        maxDepth obj = new maxDepth();
        int depth = obj.maxDepth(root);

        System.out.println("Max Depth: " + depth);
    }
}
