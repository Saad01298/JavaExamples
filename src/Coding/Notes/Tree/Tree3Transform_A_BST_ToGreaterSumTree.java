package Coding.Notes.Tree;

public class Tree3Transform_A_BST_ToGreaterSumTree {
    public static void main(String[] args) {
        BST bst = new BST();
        bst.push(11);
        bst.push(2);
        bst.push(29);
        bst.push(1);
        bst.push(7);
        bst.push(15);
        bst.push(40);
        bst.push(35);

        bst.inOrderTraversal(bst.root);
        int k = 0;

        greaterSumTree(bst.root, k);

        System.out.print("\n");
        bst.inOrderTraversal(bst.root);
    }

    private static int greaterSumTree(Node root, int sum) {
        if (root == null)
            return sum;

        sum = greaterSumTree(root.right, sum);
        sum = sum + root.val;
        root.val = sum - root.val;
        sum = greaterSumTree(root.left, sum);

        return sum;
    }
}
