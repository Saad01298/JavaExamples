package Coding.Notes.Tree;

public class Tree7LowestCommonAncestorInABinarySearchTree {
    public static void main(String[] args) {
        BST bst = new BST();
        bst.push(20);
        bst.push(8);
        bst.push(22);
        bst.push(4);
        bst.push(12);
        bst.push(10);
        bst.push(14);

        LCA_BST(bst.root, 8,14);
    }

    private static void LCA_BST(Node root, int x, int y) {
        Node temp = root;

        while (true) {
            if (x == temp.val || y == temp.val) {
                System.out.println(temp.val);
                break;
            }

            if (x < temp.val && y < temp.val) {
                temp = temp.left;
            } else if (x > temp.val && y > temp.val){
                temp = temp.right;
            } else {
                System.out.println(temp.val);
                break;
            }
        }
    }
}

