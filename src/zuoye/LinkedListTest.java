//package zuoye;
//
//public class LinkedListTest {
//
//
//    private class Node{
//        int item;
//        Node next;
//    }
//    private Node fisrt;
//    private int n;
//
//    public void deleLast(){
//        Node current=fisrt;    这里可以用first,
////        first为空的情况：
//        if(current==null){
//            return;
//        }
////        只有一个结点：
//        Node next=current.next;
//        if(next==null){
//            Node first=null;  这里用不了？
//        }
//        while(next.next!=null){
//            current=next;
//            next=current.next;
//        }
//        current.next=null;
//    }
//
//    public void delte(int k){
//        if(k<=0|| fisrt==null){
//            return;
//        }
//        if(k==1){
//            fisrt=fisrt.next;
//            return;
//        }
//
//
//
//    }
//
//
//}
