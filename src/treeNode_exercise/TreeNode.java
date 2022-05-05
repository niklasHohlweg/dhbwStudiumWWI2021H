package treeNode_exercise;

public class TreeNode<T> {
    private TreeNode<T> left = null;
    private TreeNode<T> right = null;
    private T element;

    public TreeNode(T element){ this.element = element;}
    public TreeNode<T> getLeft(){return left;}
    public void setLeft(TreeNode<T> left){this.left =left;}
    public TreeNode<T> getRight(){return right;}
    public void setRight(TreeNode<T> right){this.right = right;}
    public T getElement(){return element;}
    public void setElement(T element){this.element= element;}



}
