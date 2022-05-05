package treeNode_methods_exercise;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        TreeNode root = new TreeNode('L');
        root.setLeft(new TreeNode<>('A'));
        root.getLeft().setLeft(new TreeNode<>('H'));
        root.getLeft().setRight(new TreeNode('L'));
        root.setRight(new TreeNode<>('O'));
        root.getRight().setRight(new TreeNode('!'));
        BinaryTree.preOrder(root);
        BinaryTree.nodeList.add('-');
        BinaryTree.inOrder(root);
        BinaryTree.nodeList.add('-');
        BinaryTree.postOrder(root);
        for (Character elem: BinaryTree.nodeList) {
            System.out.println(elem);
        }
    }
}
