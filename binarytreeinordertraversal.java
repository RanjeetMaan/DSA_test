public class binarytreeinordertraversal {
    public static class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int val) {
        this.val = val;
    }
}
    public static void inordertraversal(TreeNode root) {
        if (root == null) return;
        inordertraversal(root.left);
        System.out.print(root.val + " ");
        inordertraversal(root.right);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left=new TreeNode(2);
        root.left.left=new TreeNode(3);
        root.right = new TreeNode(4);
        root.right.left = new TreeNode(5);
        System.out.print("Inorder Traversal: ");
        inordertraversal(root);
    }
}
