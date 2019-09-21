package zuoye;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import sun.invoke.empty.Empty;

import java.util.Iterator;
import java.util.Stack;

public class StackLinkedList<Item> implements Iterable<Item>{

    private Node first;
    private int n;
    private class Node{
        Node next;
        Item item;
    }

    private int size(){
         return  n;
    }
    private boolean isEmpty(){
        return first==null;
    }

    public void push(Item item){

        Node oldfirst=first;
        Node first=new Node();
        first.item=item;
        first.next=oldfirst;
        n++;
    }
    public Item pop(){
        Item item=first.item;
        first=first.next;
        n--;
        return item;
    }

    public Iterator<Item> iterator(){
        return new ReverseArrayIterator();
    }


    private class ReverseArrayIterator implements Iterator<Item>{
        private Node current=first;

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
    public static void main(String[] args){

        StackLinkedList<String> stack=new StackLinkedList<String>();
        while (!StdIn.isEmpty()){
            String item = StdIn.readString();
            if(!item.equals("-")){
                stack.push(item);
            }else if(!stack.isEmpty()){
                StdOut.print(stack.pop());
            }
        }
        StdOut.println("("+stack.size()+"left on stack");
    }
}
