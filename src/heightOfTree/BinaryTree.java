package heightOfTree;

public class BinaryTree {
    TreeNode root;

    int maxDepth(TreeNode node) {
        if (node == null) {
            return 0;
        } else {
            int leftDepth = maxDepth(node.left);
            int rightDepth = maxDepth(node.left);
            if (leftDepth > rightDepth) {
                return (leftDepth + 1);
            } else {
                return (rightDepth + 1);
            }
        }

    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);
        tree.root.left.right.right = new TreeNode(6);
        tree.root.left.right.left = new TreeNode(7);
        tree.root.left.left.right = new TreeNode(7);
        tree.root.left.left.left = new TreeNode(7);
        System.out.print(tree.maxDepth(tree.root));
    }
}
