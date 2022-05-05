package treeNode_methods_exercise;

import java.util.ArrayList;

public class BinaryTree {
    private TreeNode head;
    public static ArrayList<Character> nodeList =new ArrayList<>();;
    public BinaryTree(TreeNode pHead){this.head = head;}

    public static ArrayList<Character> preOrder(TreeNode element){
        nodeList.add((Character) element.getElement());
        if(element.getLeft() != null){BinaryTree.preOrder(element.getLeft());}
        if(element.getRight() != null){BinaryTree.preOrder(element.getRight());}
        return nodeList;
    }
    public static ArrayList<Character> inOrder(TreeNode element){
        if(element.getLeft() != null){BinaryTree.inOrder(element.getLeft());}
        nodeList.add((Character) element.getElement());
        if (element.getRight() != null) {BinaryTree.inOrder(element.getRight());}
        return nodeList;
    }
    public static ArrayList<Character> postOrder (TreeNode element){
        if(element != null){
            BinaryTree.postOrder(element.getLeft());
            BinaryTree.postOrder(element.getRight());
            nodeList.add((Character) element.getElement());
        }
        return nodeList;
    }
}
