package Lec25_Binary_Trees_2;

public class BinaryTreeNode<T> {
	public T data;
    public BinaryTreeNode<T> left;
    public BinaryTreeNode<T> right;

    public BinaryTreeNode(T data){
        this.data= data;
    }
}
