package Coding.Notes.Tree;

class Node {
    int val;
    Node left, right;
    Node (int val) {
        this.val = val;
        left = right = null;
    }
}

class BST {
    Node root;
    static int p = 0;

    void push (int a) {
        if (this.root == null) {
            this.root = new Node(a);
        } else {
            Node temp = this.root;
            Node addIt = new Node(a);
            while (temp != null) {
                if (temp.val < addIt.val) {
                    if (temp.right==null) {
                        temp.right = addIt;
                        temp = null;
                    } else {
                        temp = temp.right;
                    }
                } else {
                    if (temp.left==null) {
                        temp.left = addIt;
                        temp = null;
                    } else {
                        temp = temp.left;
                    }
                }
            }
        }
    }

    // Yet to be done
    int remove (int a) {
        return 0;
    }

    void inOrderTraversalForKthSmallest(Node root, int k) {
        if (root == null)
            return;

        inOrderTraversalForKthSmallest(root.left, k);

        p++;
        if (p==k) {
            System.out.print(root.val+" ");
        }

        inOrderTraversalForKthSmallest(root.right, k);
    }

    void inOrderTraversal(Node root) {
        if (root == null)
            return;

        inOrderTraversal(root.left);
        System.out.print(root.val+" ");
        inOrderTraversal(root.right);
    }
}

public class Tree1KthSmallestElementInBST {
    public static void main(String[] args) {
        BST bst = new BST();
        bst.push(16);
        bst.push(24);
        bst.push(8);
        bst.push(28);
        bst.push(22);
        bst.push(12);
        bst.push(6);
        bst.push(21);
        bst.push(3);
        bst.push(5);

        int k = 3;

        bst.inOrderTraversalForKthSmallest(bst.root, k);
    }
}
