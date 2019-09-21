package tree;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class binaryTree {
//    前序递归：
    public void preOrder(binaryTreeNode root){
        if(root!=null){
            System.out.println(root.getData());
            preOrder(root.getLeft());
            preOrder(root.getRight());
        }
    }
//    前序非递归：
//            1，先入栈根节点，输出根节点val值，再先后入栈其右节点、左结点；
//            2，出栈左节点，输出其val值，再入栈该左节点的右节点、左节点；直到遍历完该左节点所在子树。
//            3，再出栈右节点，输出其val值，再入栈该右节点的右节点、左节点；直到遍历完该右节点所在子树。
    public void preOrderNonRecursive(binaryTreeNode root){
        Stack<binaryTreeNode> stack=new Stack<binaryTreeNode>();
        if(root!=null){
            stack.push(root);
        }
        while(!stack.empty()){
           binaryTreeNode node =stack.pop();
           System.out.print(node.getData());
           if(node.getRight()!=null){
               stack.push(node.getRight());
           }
           if(node.getLeft()!=null){
               stack.push(node.getLeft());
           }

        }
    }
//    中序递归：
    public void inOrder(binaryTreeNode root){
        if(root!=null){
            inOrder(root.getLeft());
            System.out.print(root.getData());
            inOrder(root.getRight());
        }
    }

//    中序非递归：
    public void inOrderNonRecursive(binaryTreeNode root){

    }
//    后序递归：
//    后序非递归：
}
