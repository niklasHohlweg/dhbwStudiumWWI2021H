package treeNode_methods_exercise;

import java.util.ArrayList;

public class BinaryTree {
    public static TreeNode root;
    public static ArrayList<Character> nodeList =new ArrayList<>();;
    public BinaryTree(TreeNode pRoot){this.root = pRoot;}

    public static ArrayList<Character> preOrder(TreeNode element){
        if(element.getElement() != null){nodeList.add((Character) element.getElement());}
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
    public static void buildTree(){
        TreeNode root = new TreeNode('L');
        root.setLeft(new TreeNode<>('A'));
        root.getLeft().setLeft(new TreeNode<>('H'));
        root.getLeft().setRight(new TreeNode('L'));
        root.setRight(new TreeNode<>('O'));
        root.getRight().setRight(new TreeNode('!'));
    }
}
