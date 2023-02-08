package Coding.Notes.Tree;

public class Tree6LowestCommonAncestorInABinaryTree {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.root = new Node(1);
        binaryTree.root.left = new Node(2);
        binaryTree.root.right = new Node(3);
        binaryTree.root.left.left = new Node(4);
        binaryTree.root.left.right = new Node(5);
        binaryTree.root.right.left = new Node(6);
        binaryTree.root.right.right = new Node(7);

        postOrderTraversalLCA(binaryTree.root, 4,3);
    }

    private static boolean postOrderTraversalLCA(Node root, int a, int b) {
        if (root == null)
            return false;

        Boolean left = false, right = false;

        left = postOrderTraversalLCA(root.left, a, b);
        right = postOrderTraversalLCA(root.right, a, b);


        if (left == right && left == true) {
            System.out.println(root.val);
            return true;
        }
        else if (left == true && (root.val == a || root.val == b)) {
            System.out.println(root.val);
            return true;
        }
        else if (right == true && (root.val == a || root.val == b)) {
            System.out.println(root.val);
            return true;
        }
        else if (root.val == a || root.val == b)
            return true;
        else if (left == true || right == true)
            return true;
        else
            return false;

    }

}
