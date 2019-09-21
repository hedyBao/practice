package zuoye;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.Stack;

public class QueueLinkedList<Item> implements Iterable<Item> {



    private int n;
    private Node first;
    private Node last;

    public class Node{
        Item item;
        Node next;
    }

    public boolean isEmpty(){
        return n==0;
    }
    public int size(){
        return n;
    }
//    表尾添加元素：
    public void enqueue(Item item){
        Node oldlast=last;
        last= new Node();
        last.item=item;
        last.next=null;
        if(isEmpty()){
            first=last;
        }else {
            oldlast.next=last;
        }
        n++;
    }
    public Item dequeue(){
        Item item = first.item;
        first=first.next;
        if(isEmpty()){
            last=null;
        }
        n--;
        return item;
    }

    public Iterator<Item> iterator(){

        return new ReverseArrayIterator();
    }
    private class ReverseArrayIterator implements Iterator<Item>{
        private Node current= first;
        public boolean hasNext(){
            return current!=null;
        }
        public Item next(){
           Item item= current.item;
           current=current.next;
           return item;
        }
        public void remove(){

        }

    }

    public static void main(String[] args) {
        QueueLinkedList<String> q= new QueueLinkedList<>();
        while(!StdIn.isEmpty()){
            String item = StdIn.readString();
            if(!item.equals("-")){
                q.enqueue(item);
            }else if(!q.isEmpty()){
                StdOut.print(q.dequeue()+" ");
            }
            StdOut.println("("+q.size()+"left on queue)");
        }
    }



}
