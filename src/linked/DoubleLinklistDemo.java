package linked;

public class DoubleLinklistDemo {
    Node head;
    Node tail;
    int size;

    public class Node{
        private Node next;
        private Object data;
        public Node(Object data){
            this.data=data;

        }
    }
    public DoubleLinklistDemo(){
        head=null;
        tail=null;
        size=0;
    }
//    头部增加；

    public void addHead(Object data){
        Node node =new Node(data);
        if(size==0){
            this.head=head;
            this.tail=tail;
            size++;
        }else{
            node.next=head;
            head=node;
            size++;
        }
    }

//    尾部增加；

    public void addTail(Object data){
        Node node = new Node(data);
        if(size==0){
            this.head=head;
            this.tail=tail;
            size++;
        }else {
            tail.next=node;
            tail=node;
            size++;

        }

    }

//    头部删除节点：
    public boolean deleHead(){
        if(size==0){
            return false;
        }
        if(head.next==null){
            head=null;
            tail=null;

        } else {
            head=head.next;
        }
        size--;
        return true;
    }
//    判断是否为空
    public boolean isEmpty(){
        return (size==0);
    }
//    判断节点的数量
    public int getSize(){
        return size;
    }

    public void display(){
        if(size>0){
            Node node =head;
            int temSize=size;
            if(size==1){
                System.out.println("["+head.data+"]");
                return;
            }
            while (temSize>0){
                if(node.equals(head)){
                    System.out.println("["+node.data+",");
                }else if(node.next==null){
                    System.out.println(node.data+"]");

                }else {
                    System.out.println(node.data+",");
                }
                node=node.next;
                temSize--;
            }
                System.out.println();
        }else{
            System.out.println("[]");
        }

    }




}
