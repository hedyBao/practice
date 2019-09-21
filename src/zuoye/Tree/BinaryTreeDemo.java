package zuoye.Tree;

import java.util.ArrayDeque;

public class BinaryTreeDemo {
    static class TreeNode{
        private int data;
        private TreeNode leftChild;
        private TreeNode rightChild;

        public TreeNode(int data){
            this.data = data;
        }
    }

    TreeNode root;
    public BinaryTreeDemo(int[] array){
        root = makeBinaryTreeByArrayDemo(array,1);

    }

    public static TreeNode makeBinaryTreeByArrayDemo(int[] array, int index ){
        if(index < array.length){
            int data = array[index];
            if(data!=0){
                TreeNode treeNode = new TreeNode(data);
//                array[index]=0;
                treeNode.leftChild= makeBinaryTreeByArrayDemo(array, 2*index);
                treeNode.rightChild = makeBinaryTreeByArrayDemo(array,2*index+1);
                return treeNode;

            }
        }
        return null;
    }

    public void DFSTree(){
        if(root == null){
            return;
        }
        ArrayDeque<TreeNode> stack = new ArrayDeque<TreeNode>();
        stack.push(root);
        while(stack.isEmpty()== false){
            TreeNode node = stack.pop();
            System.out.print(node.data+" ");
            if(node.rightChild!=null){
                stack.push(node.rightChild);
            }
            if(node.leftChild!=null){
                stack.push(node.leftChild);
            }
        }

        System.out.println("\n");
    }


    public void BFSTree(){
        if(root ==null){
            return;
        }
        ArrayDeque<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while(queue.isEmpty()==false){
            TreeNode node = queue.remove();
            System.out.print(node.data+" ");
            if(node.leftChild!=null){
                queue.add(node.leftChild);
            }
            if(node.rightChild!=null){
                queue.add(node.rightChild);
            }
        }
    }

    public static void main(String[] args) {
        int[] a= {0,13,65,5,97,25,0,37,22,0,4,28,0,0,32,0};
        BinaryTreeDemo binaryTreeDemo = new BinaryTreeDemo(a);
        binaryTreeDemo.DFSTree();
        binaryTreeDemo.BFSTree();
    }



}
