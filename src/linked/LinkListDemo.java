package linked;

public class LinkListDemo {
    public Node head;
    public Node node;
    public Node tail;
    public int size;
    public int index;
    public LinkListDemo(){
        head=null;
        size=0;
    }
//增
//    （1）在任意位置增加；



// （2）在头部增加；
    public void addHead(Object obj) {
        Node newHead = new Node(obj);
        if(size==0){
            head=newHead;
            tail=newHead;
        }else {
            newHead.next = head;
            head=newHead;
        }
        size ++;
    }

//    //   （3）在尾部增加；
    public void addLast(Object obj){
        Node node = new Node(obj);
        if(size==0){
            head=node;
            tail=node;
        }else {
            tail.next=node;
            tail=node;
        }
        size++;
    }
//    找到想要的节点：
    public Node find(Object obj){
        Node current =head;
        int temSize= size;
        while (true){
            if(obj.equals(current.data)){
                return current;
            }else {
                current=current.next;
            }

            if(current == null){
                break;
            }
        }

        return null;
    }
//    插入index位置：
    public void insertNodeByindex(int index,Node node){
        if(index<1||index>size+1){
            System.out.println("插入位置不合格");
            return;
        }
        int length=1;
        Node temp=head;
        while (head.next!=null){
            if(index==length++){
                node.next=temp.next;
                temp.next=node;
                return;
            }
            temp=temp.next;
        }


    }


    //删除指定的元素，删除成功返回true
    public boolean delete(Object value){
        if(size==0){
            return false;
        }
            Node current = head;
            Node previous= head;
            while (current.data!=value){
                if(current.next==null){
                    return false;
                }else {
                    previous=current;
                    current=current.next;
                }
            }
            //删除第一个节点；
            if(current==head){
                head=current.next;
                size --;
            }else {
                previous.next=current.next;
                size--;
            }
            return true;


    }



//   删除头部：
    public Object deleHead(){
        Object obj=head.data;
            head=head.next; //自己写的是head.next=head
            size--;
            return obj;
    }


    public void display(){
        if(size>0){
            Node node = head;
            int temSize=size;
            if(temSize==1){
                System.out.println("["+node.data+"]");
                return;
            }

            while (temSize>0){
                if(node.equals(head)){
                    System.out.print("["+node.data+",");
                }else if(node.next== null){
                    System.out.print(node.data+"]");
                }else{
                    System.out.print(node.data+",");
                }
                node=node.next;
                temSize--;
            }
            System.out.println();

        }else {
            System.out.print("[]");
        }


    }





//    public void addLast(Object obj){
//        Node newLast =new Node(obj);
//        while ()
//        }
//    }



//    public String toString() {
//        if (size == 0) {
//            return "[]";
//        }
//            StringBuilder sb = new StringBuilder();
//
//            Node current = head;
//            sb.append("[");
//
//            for (int i =0;i<size;i++){
//                sb.append(current.data);
//                if (i!=size-1){
//                    sb.append(",");
//                }else {
//                    sb.append("]");
//                }
//                current=current.next;
//
//
//            }
//            return sb.toString();
//
//    }
}
