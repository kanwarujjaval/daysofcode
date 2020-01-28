package InorderTreeTraversal;

public class BinaryTree {
    TreeNode root;

    void morrisTraversal(TreeNode root) {
        TreeNode current, pre;
        if (root == null) {
            return;
        }

        current = root;

        while (current != null) {
            if (current.left == null) {
                System.out.print(current.data + " ");
                current = current.right;
            } else {
                // inorder predecessor of current
                pre = current.left;
                while (pre.right != null & pre.right != current) {
                    pre = pre.right;

                    //mark current as right child of its inorder predecessor
                    if (pre.right == null) {
                        pre.right = current;
                        current = current.left;
                    } else {
                        pre.right = null;
                        System.out.print(current.data + " ");
                        current = current.right;
                    }
                }
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
        tree.morrisTraversal(tree.root);
        /*
                 1
               /   \
              2      3
            /  \
          4     5
        */
    }
}
