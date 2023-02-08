package Coding.Notes.Tree;

class BinaryTree {
    Node root;

    void morrisTraversal (Node root1) {
        Node current, pre;

        if (root1 == null)
            return;

        current = root1;
        while (current != null)
        {
            if (current.left == null) {
                System.out.print(current.val + " ");
                current = current.right;
            }
            else {
                pre = current.left;
                while (pre.right != null && pre.right != current)
                    pre = pre.right;

                // if above loop ends due to null, then
                if (pre.right == null) {
                    pre.right = current;
                    current = current.left;
                }

                // if above loop ends due to current, then
                else {
                    pre.right = null;
                    System.out.print(current.val + " ");
                    current = current.right;
                }
            }
        }
    }
}
public class Tree2MorrisTraversal {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.root = new Node(6);
        binaryTree.root.left = new Node(3);
        binaryTree.root.right = new Node(10);
        binaryTree.root.left.left = new Node(1);
        binaryTree.root.left.right = new Node(37);
        binaryTree.root.right.left = new Node(9);
        binaryTree.root.right.right = new Node(21);
        binaryTree.root.left.left.right = new Node(94);
        binaryTree.root.left.right.right = new Node(62);

        // InOrderTraversal without extra space
        binaryTree.morrisTraversal(binaryTree.root);
    }
}
