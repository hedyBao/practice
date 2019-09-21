package zuoye;

import edu.princeton.cs.algs4.BST;
import edu.princeton.cs.algs4.In;
import sun.tools.jstat.Literal;

import java.util.ArrayList;
import java.util.List;

public class BSTree<Key extends Comparable<Key>,Value> {
    public class Node{
        private Key key;
        private Value value;
        private Node left;
        private Node right;
        private int n;

        private Node(Key key,Value value, int n){
            this.key=key;
            this.value=value;
            this.n=n;
        }
    }

    private Node root;
    public int size(){
        return size(root);
    }
    private int size(Node x){
        if(x==null){
            return 0;
        }else{
            return x.n;
        }
    }
    public Value get(Key key){
        return get(root, key);
    }

    private Value get(Node x,Key key){
        if(x==null){
            return null;
        }else{
            int cmp=key.compareTo(x.key);
            if(cmp< 0 ) return get(x.left,key);
            else if(cmp>0) return get(x.right,key);
            else return x.value;
        }
    }

    public void put(Value value,Key key){
        root=put(root,value,key);
    }

    private Node put(Node x,Value value,Key key){
        if(x==null){
            return new Node(key,value,1);
        }else{
            int cmp=key.compareTo(x.key);
            if(cmp<0) x.left=put(x.left,value,key);
            else if(cmp>0) x.right=put(x.right,value,key);
            else x.value=value;
            x.n=1+size(x.left)+size(x.right);
            return x;
        }

    }

    public Key min(){
        return min(root).key;
    }

    private Node min(Node x){
        if(x.left==null)
            return x;
        return min(x.left);

    }

    public Key max(){
        return max(root).key;
    }

    private Node max(Node x){
        if(x.right==null)
            return x;
        return max(x.right);

    }

    public Key floor(Key key){
        Node x=floor(root,key);
        if(x==null){
            return null;
        }else {
            return x.key;
        }

    }

    private Node floor(Node x,Key key){
        if(x==null){
            return null;
        }
        int cmp=key.compareTo(x.key);
        if(cmp==0){
            return x;
        }else if(cmp<0){
            return floor(x.left,key);
        }else{
            Node t= floor(x.right,key);
            if(t==null){
                return x;
            }else {
                return t;
            }
        }
    }

    public Key ceiling(Key key){
        Node x=floor(root,key);
        if(x==null){
            return null;
        }else {
            return x.key;
        }

    }


    private Node celing(Node x,Key key){
        if(x==null){
            return null;
        }
        int cmp=key.compareTo(x.key);
        if(cmp==0){
            return x;
        }else if(cmp>0){
            return floor(x.right,key);
        }else{
           Node t=floor(x.left,key);
           if(t==null){
               return x;
           }else{
               return t;
           }
        }
    }

//选择排名为k的节点：
    public Key select(int k){
        return select(root,k).key;

    }

    private Node select(Node x,int k){
        if(x==null){
            return null;
        }
        int t=size(x.left);
        if(t>k){
            return select(x.left,k);
        }else if(t<k){
            return select(x.right,k-t-1);
        }
        else return x;
    }
//查找给定键值的排名
    public int rank(Key key){
       return rank(key,root);
    }

    private int rank(Key key,Node x){
        if(x==null){
            return 0;
        }else {
            int cmp=key.compareTo(x.key);
            if(cmp<0) return rank(key,x.left);
            else if(cmp>0) return 1 + size(x.left) + rank(key,x.right);
            else return size(x.left);
        }

    }

//    删除最小键值对
    public void deleteMin(){
        deleteMin(root);

    }

    private Node  deleteMin(Node x){
        if(x.left==null) return x.right;
        x.left=deleteMin(x.left);
        x.n=1+size(x.left)+size(x.right);
        return x;
    }

//    删除最大键值对

    public void deleteMax(){
        deleteMax(root);
    }

    private Node deleteMax(Node x){
        if(x.right==null) return x.left;
        x.right=deleteMax(x.right);
        x.n=size(x.left)+size(x.right)+1;
        return x;
    }
//    以下删除没太明白：
    public void delete(Key key){

    }
    private Node delete(Node x, Key key){
        if(x==null) return null;
        int cmp=key.compareTo(x.key);
        if(cmp<0) x.left=delete(x.left,key);
        else if(cmp>0) x.right=delete(x.right,key);
        else{
            if(x.left==null) return x.right;
            if(x.right==null) return x.left;

            Node t=x;
            x=min(t.right);
            x.right=deleteMin(t.right);
        }
        x.n=size(x.left)+size(x.right)+1;
        return x;

    }

    public String toString(){
        StringBuilder sb= new StringBuilder();
        toString(root,sb);
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }

    private void toString(Node x,StringBuilder sb){
        if(x==null) return;
        toString(x.left,sb);
        sb.append("<"+x.key+","+x.value+">,");
        toString(x.right,sb);
    }

    public List<Key> keys(){
        return keys(min(),max());
    }

    public List<Key> keys(Key lo , Key hi){
        List<Key> list= new ArrayList<Key>();
        keys(root,list,lo,hi);
        return list;
    }
    private void keys(Node x, List<Key> list,Key lo , Key hi ){
       if(x==null) return;
       int cmplo= lo.compareTo(x.key);
       int comhi=hi.compareTo(x.key);
       if(cmplo <0) keys(x.left,list,lo,hi);
       if(cmplo<=0 && comhi>=0) list.add(x.key);
       if(comhi>0) keys(x.right,list,lo,hi);

    }

    public static void main(String[] args){
        BST<Integer,String> bst= new BST<Integer,String>();
        bst.put(5,"e");
        bst.put(1, "a");
        bst.put(4, "d");
        bst.put(9, "i");
        bst.put(10, "j");
        bst.put(2, "b");
        bst.put(7, "g");
        bst.put(3, "c");
        bst.put(8, "h");
        bst.put(6, "f");

        java.lang.Iterable<Integer> keys = bst.keys();
        for(int key:keys){
            System.out.print("<"+key+","+bst.get(key)+">,");
        }
        System.out.println();
        bst.deleteMin();
        System.out.println(bst.toString());
        bst.deleteMax();
        System.out.println(bst.toString());
        bst.delete(7);
        System.out.println(bst.toString());

    }

}


