package Coding.Notes.Tree;

public class Tree4InorderSuccessorInBinarySearchTree {
    public static void main(String[] args) {
        BST bst = new BST();
        bst.push(20);
        bst.push(8);
        bst.push(22);
        bst.push(4);
        bst.push(12);
        bst.push(10);
        bst.push(14);

        bst.inOrderTraversal(bst.root);
        inorderSuccessor(bst.root, 8);
        inorderSuccessor(bst.root, 10);
        inorderSuccessor(bst.root, 14);
    }

    private static void inorderSuccessor(Node root, int k) {
        Node t = root, ans = root;

        while (true) {
            if (k==t.val) {
                if (t.right==null) {
                    System.out.println(ans.val);
                    break;
                } else {
                    t = t.right;
                    while (t.left!=null) {
                        t=t.left;
                    }
                    System.out.println(t.val);
                    break;
                }
            } else if (k<t.val) {
                ans = t;
                t=t.left;
            } else {
                t=t.right;
            }
        }
    }
}
