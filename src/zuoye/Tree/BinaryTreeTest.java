package zuoye.Tree;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Stack;

public class BinaryTreeTest {
    static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
        public TreeNode(int data){
            this.data = data;
        }
    }

//    TreeNode root;
//    public BinaryTreeTest(int[] a){
//        root = createBiTree(a,1);
//
//    }

//    前序遍历 递归版
    public static void preOrderRec(TreeNode root){
        if(root!=null){
            System.out.print(root.data+" ");
            preOrderRec(root.left);
            preOrderRec(root.right);
        }
    }
//    前序遍历 非递归版
    public static void preOrder(TreeNode root){
        ArrayDeque<TreeNode> stack = new ArrayDeque<>();
        while(root!=null||! stack.isEmpty()){
            if(root!=null){
                stack.push(root);
                System.out.print(root.data+" ");
                root= root.left;
            }else {
                root = stack.pop().right;
            }


        }
    }

    public static  void preOrder1(TreeNode root) {
        ArrayDeque<TreeNode> stack = new ArrayDeque<>();
        if (root != null) {
            stack.push(root);
        }
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            System.out.print(node.data);
            //右结点先入栈，左结点后入栈
            if (node.right != null) stack.push(node.right);
            if (node.left != null) stack.push(node.left);
        }
    }
//    中序遍历 递归版
    public static void midOrderRec(TreeNode root){
        if(root!=null){
            midOrderRec(root.left);
            System.out.print(root.data+" ");
            midOrderRec(root.right);
        }
    }
//    中序遍历 非递归版

    public static void midOrder(TreeNode root){
        ArrayDeque<TreeNode> stack = new ArrayDeque<>();
        while(root!=null||!stack.isEmpty()){
            if(root!=null){
                stack.push(root);
                root= root.left;

            }else {
                root= stack.pop();
                System.out.print(root.data+" ");
                root=root.right;
            }
        }
    }

//    后序遍历 递归版
    public static void aftOrderRec(TreeNode root){
        if(root!=null){
            aftOrderRec(root.left);
            aftOrderRec(root.right);
            System.out.print(root.data+" ");
        }
    }
// 后序遍历 非递归版:

    public static void aftOrder1(TreeNode root){
        java.util.ArrayDeque<TreeNode> inStack = new java.util.ArrayDeque<>();
        java.util.ArrayDeque<TreeNode> outStack = new java.util.ArrayDeque<>();
        inStack.push(root);
        while(!inStack.isEmpty()){
            outStack.push(root = inStack.pop());
            if(root.left != null){
                inStack.push(root.left);
            }
            if(root.right != null){
                inStack.push(root.right);
            }
        }
        while(!outStack.isEmpty()){
            System.out.print(outStack.pop().data + " ");
        }
        System.out.println();
    }

    public static TreeNode createBiTree(int array[], int index){
        if (index<array.length){
           int data =  array[index];
           if(data!=0){
               TreeNode treeNode = new TreeNode(data);
//               array[index]=0;
               treeNode.left =createBiTree(array,2*index);
               treeNode.right= createBiTree(array,2*index+1);
               return treeNode;
           }
        }
        return null;




    }

    public static void main(String[] args) {
        int[] a = {0,9,3,2,4,5};
        TreeNode root = createBiTree(a,1);
        System.out.println("前序递归的结果为：");
        preOrderRec(root);
        System.out.println();
        System.out.println("前序非递归的结果为：");
        preOrder(root);
        System.out.println();
        System.out.println("中序递归的结果为：");
        midOrderRec(root);
        System.out.println();
        System.out.println("中序非递归的结果为：");
        midOrder(root);
        System.out.println();
        System.out.println("后序递归的结果为：");
        aftOrderRec(root);
        System.out.println();
        System.out.println("后序非递归的结果为：");
//        aftOrder(root);
        System.out.println();
        aftOrder1(root);



        System.out.println();
        preOrder1(root);


    }



}
