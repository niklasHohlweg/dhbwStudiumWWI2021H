package treeNode_methods_exercise;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        BinaryTree.buildTree();
        BinaryTree.preOrder(BinaryTree.root);
        BinaryTree.nodeList.add('-');
        BinaryTree.inOrder(BinaryTree.root);
        BinaryTree.nodeList.add('-');
        BinaryTree.postOrder(BinaryTree.root);
        for (Character elem: BinaryTree.nodeList) {
            System.out.println(elem);
        }
    }
}
