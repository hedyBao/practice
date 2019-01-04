package linked;

public class LinkListDemo {
    public Node head;
    public int size;
    public LinkListDemo(){
        head=null;
        size=0;
    }
//增
//    （1）在任意位置增加；
//    （2）在头部增加；
//    （3）在尾部增加；


    public void addHead(Object obj) {
        Node newHead = new Node(obj);
        if(size==0){
            head=newHead;
        }else {
            newHead.next = head;
            head=newHead;


        }
        size ++;



    }



    public String toString() {
        if (size == 0) {
            return "[]";
        }
            StringBuilder sb = new StringBuilder();
            Node current = this.head;
            sb.append("[");
            for (int i = 0; i < size; i++) {
                sb.append(current.data);
                if (i != size - 1) {
                    sb.append(".");
                } else {
                    sb.append("]");
                }
            }

            return sb.toString();
    }
}
