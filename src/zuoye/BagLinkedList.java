package zuoye;

import java.util.Iterator;

public class BagLinkedList<Item> implements Iterable<Item>{

    private Node first;
    private int n;
    private class Node{
        Item item;
        Node next;
    }
    public boolean isEmpty(){
        return n==0;
    }
    public int size(){
        return n;
    }

    public void add(Item item){
        Node oldfirst=first;
        first=new Node();
        first.item=item;
        first.next=oldfirst;

    }

    public Iterator<Item> iterator(){
        return new ReverseArrayIterator();
    }
    private class ReverseArrayIterator implements Iterator<Item>{
       private Node current=first;
       public boolean hasNext(){
           return current!=null;
       }
       public void remove(){

       }
       public Item next(){
           Item item= current.item;
           current=current.next;
           return item;
       }

    }




}
