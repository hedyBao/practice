package tree;

public class bsTree {
    public Node root;


    public class Node {
        public int data;
        public Node leftChild;
        public Node rightChild;
        public Node(int data){
            this.data=data;
        }

        public void display(){
            System.out.println(data);

        }
    }
//    查找节点：
    public Node find(int key){
        Node current=root;
        while(current!=null){
            if(current.data>key){
               current=current.leftChild;
            }else  if(current.data>key){
                current=current.rightChild;

            }else {
                return current;
            }
        }
        return null;
    }
    //    插入节点：
    public boolean insert(int data){
        Node newNode =new Node(data);
        if(root==null){
            root=newNode;
            return true;
        }else {
            Node current =root;
            Node parentNode=null;
            while(current!=null){
                parentNode=current;
                if(current.data<data) {
                    newNode = current.rightChild;
                    if (current == null) {
                        parentNode.rightChild = newNode;
                        return true;
                    }
                }else{
                    newNode=current.rightChild;
                    if(current==null){
                        parentNode.leftChild=newNode;
                        return true;
                    }

                }
            }

        }

            return false;

    }
    //    最大值：
    public Node findMax(){
        Node current=root;
        Node maxNode= current;
        while(current!=null){
            maxNode=current;
            current=current.rightChild;
        }
        return maxNode;
    }

//    最小值：
    public Node findMin(){
        Node current=root;
        Node minNode=current;
        while (current!=null){
            current=minNode;
            current=current.leftChild;
        }
        return minNode;
    }
//    前序遍历：
    //    中序遍历：
//    public void infixOrder(Node current){
//        if(current!=null){
//            infixOrder(current.leftChild);
//        }
//
//
//
//
//    }

//    后序遍历：



}
