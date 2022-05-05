package treeNode_exercise;

public class Main {

    public static void main(String[] args) {
        TreeNode root = new TreeNode('L');
        root.setLeft(new TreeNode<>('A'));
        root.getLeft().setLeft(new TreeNode<>('H'));
        root.getLeft().setRight(new TreeNode<>('L'));
        root.setRight(new TreeNode<>('O'));
        root.getRight().setRight(new TreeNode<>('!'));

        System.out.println(root.getLeft().getElement());
        System.out.println(root.getLeft().getRight().getElement());
        System.out.println(root.getLeft().getLeft().getElement());
        System.out.println(root.getRight().getRight().getElement());
        System.out.println(root.getRight().getElement());
        System.out.println(root.getElement());

    }
}