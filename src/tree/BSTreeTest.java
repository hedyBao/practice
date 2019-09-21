//package tree;
//
//import java.util.Stack;
//
//public class BSTreeTest {
//
//    private static class TreeNode{
//            private Object data;
//            private TreeNode lChild;
//            private TreeNode rChild;
//
//
//
//        public TreeNode(Object data,TreeNode lChild,TreeNode rChild){
//            this.data = data;
//            this.lChild=lChild;
//            this.rChild= rChild;
//
//        }
//    }
//
//
//    public static void preRecurOrder(TreeNode root ){
//        if(root!=null){
//            System.out.println(root.data+" ");
//            preRecurOrder(root.lChild);
//            preRecurOrder(root.rChild);
//        }
//    }
//
//
//    public static void preOrder(TreeNode root){
//        Stack<TreeNode> stack = new Stack<>();
//        if(root!=null){
//            stack.push(root);
//        }
//
//        while(!stack.empty()){
//            TreeNode node = stack.pop();
//            System.out.println(node.data);
//            if(node.rChild!=null){
//                stack.push(node.rChild);
//            }
//
//            if(node.lChild!=null){
//                stack.push(node.lChild);
//            }
//
//        }
//    }
//
//
//    public static void inRecurOrder(TreeNode root){
//        if(root!=null){
//            inRecurOrder(root.lChild);
//            System.out.println(root.data+" ");
//            inRecurOrder(root.rChild);
//        }
//
//    }
//
//    public static void inOrder(TreeNode root){
//        Stack<TreeNode> stack = new Stack<>();
//        while(root!=null || !stack.empty()){
//            while(root!=null){
//                stack.push(root);
//                root = root.lChild;
//            }
//        }
//
//        if(!stack.empty()){
//            TreeNode node= stack.pop();
//            System.out.println(root.data);
//            root=node.rChild;
//        }
//    }
//
//
//    public static void postRecurOrder(TreeNode root){
//        if (root!=null){
//            postRecurOrder(root.lChild);
//            postRecurOrder(root.rChild);
//            System.out.println(root.data+" ");
//        }
//
//    }
//
//    public static void main(String[] args) {
//        TreeNode root= new TreeNode();
//        root.data = 1;
//
//    }
//
//
//
//}
