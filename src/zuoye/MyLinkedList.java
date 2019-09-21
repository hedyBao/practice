package zuoye;

public class MyLinkedList {
    class Node{
        int val;
        Node next;
        public Node(int val){
            this.val= val;
        }
    }

    Node currHead;
    Node currTail;
    int size;
    public MyLinkedList(){
        currHead=null;
        currTail=null;
        size=0;
    }
    public int get(int index){
        if(size<index){
            return -1;
        }
        Node tmp=currHead;
        for(int i=0;i<size;i++){
            tmp=tmp.next;
        }
        return tmp.val;
    }
    public void addAtHead(int val){
        Node tmp=new Node(val);
        tmp.next=currHead;
        currHead=tmp;
        if(currTail==null){
            currTail=currHead;
            size++;
        }
    }

    public void  addAtTail(int val){
        Node tmp=new Node(val);
        if(currTail!=null){
            currTail.next=tmp;
        }
        if(currTail==null){
            currHead=tmp;
        }
        currTail=tmp;
        size++;
    }
    public void addAtIndex(int index, int val){
        if(size<index){
            return;
        }
        if (size==index){
            addAtTail(val);
        }else if(size==0){
            addAtHead(val);
        }else{
            Node ith=currHead;
            for(int i=0;i<index-1;i++){
                Node tmp=new Node(val);
                Node saveIth=ith;
                ith=ith.next;
                saveIth.next=tmp;
                tmp.next=ith;
                size++;
            }

        }
    }

    public void deleAtIndex(int index, int val){
        if(size==0){
            return;
        }
        if(size<=index){
            return;
        }
        if(index==0){
            if(size==1){
                size=0;
                currTail=null;
                currHead=null;
                return;
            }
            currHead=currHead.next;
            size--;
            return;
        }

        if(index!=0){
            Node ith=currHead;
            for(int i=0;i<index-1;i++){
                ith=ith.next;
            }
            if (size==index-1){
                currTail=ith;
                currTail.next=null;
                size--;
                return;
            }
            Node nekMinnit=ith.next;
            ith.next=nekMinnit.next;
        }
        size--;
    }


}
