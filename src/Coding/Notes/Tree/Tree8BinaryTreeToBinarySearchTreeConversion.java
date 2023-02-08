package Coding.Notes.Tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Tree8BinaryTreeToBinarySearchTreeConversion {
    static int i = 0;

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.root = new Node(10);
        binaryTree.root.left = new Node(2);
        binaryTree.root.right = new Node(7);
        binaryTree.root.left.left = new Node(8);
        binaryTree.root.left.right = new Node(4);

        //Insert binary tree data in arrayList
        ArrayList<Integer> arrayList = new ArrayList<>(List.of(10,2,7,8,4));
        Collections.sort(arrayList);

        BTtoBST(binaryTree.root, arrayList);

        binaryTree.morrisTraversal(binaryTree.root);
    }

    private static void BTtoBST(Node root, ArrayList<Integer> arrayList) {
        if (root == null)
            return;

        BTtoBST(root.left, arrayList);
        root.val = arrayList.get(i++);
        BTtoBST(root.right, arrayList);
    }


}




