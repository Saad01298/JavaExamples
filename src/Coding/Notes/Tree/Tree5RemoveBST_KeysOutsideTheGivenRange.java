package Coding.Notes.Tree;

public class Tree5RemoveBST_KeysOutsideTheGivenRange {
    public static void main(String[] args) {
        BST bst = new BST();
        bst.push(6);
        bst.push(-13);
        bst.push(-8);
        bst.push(14);
        bst.push(13);
        bst.push(15);
        bst.push(7);

        bst.inOrderTraversal(bst.root);
        keysOutsideRange(bst.root,-10,13);
        System.out.println("");
        bst.inOrderTraversal(bst.root);

    }

    private static Node keysOutsideRange(Node root, int i, int j) {
        if (root == null)
            return null;

        root.left = keysOutsideRange(root.left,i,j);
        root.right = keysOutsideRange(root.right,i,j);

        if (root.val<i)
            return root.right;
        else if (root.val>j)
            return root.left;
        else
            return root;
    }
}
