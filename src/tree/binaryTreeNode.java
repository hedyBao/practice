package tree;

public class binaryTreeNode {
    private int data;
    private binaryTreeNode left;
    private binaryTreeNode right;

    public binaryTreeNode(){}

    public binaryTreeNode(int data, binaryTreeNode left,binaryTreeNode right){
        super();
        this.data=data;
        this.left=left;
        this.right=right;
    }
    public int getData(){
        return data;
    }
    public void setData(int data){
        this.data=data;
    }

    public binaryTreeNode getLeft() {
        return left;
    }

    public void setLeft(binaryTreeNode left) {
        this.left = left;
    }

    public binaryTreeNode getRight() {
        return right;
    }

    public void setRight(binaryTreeNode right) {
        this.right = right;
    }
}
