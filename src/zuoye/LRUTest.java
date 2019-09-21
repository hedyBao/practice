package zuoye;

public class LRUTest<Item> {
//    LRU保存数据的思路是以链表的形式，尾部缓存较早的数据，头部缓存较晚的数据，而且还有一定的容量，所以：
     private Node head ;
     private Node tail;
     int N;
     int capacity;

//    Node 要具备的两个：
      private class Node<Item>{
         Item item;
         Node next;

         public Node(){
         }
         public Node(Item item) {
             this.item = item;
         }

      }
//      判断链表是否为空：


    public boolean isFull(){
        int N=0;
        int size =0;
        if(head == tail){
            N=1;
        }else{
            Node x = head;
            while (x!=null){
                N++;
                x=x.next;
            }
            size = N;
        }

        if(size == capacity){
            return true;
        }else{
            return false;
        }

    }



//      单链表删除目标结点x：
    public boolean deleNode(Node n){
          //先把要删除的结点和它前面的一个结点交换；

        Node tmp = new Node();
        tmp.item= n.item;
        n.item= n.next.item;
        n.next.item = tmp.item;
//   下一步是把前一个结点的next引用直接指向下下一个结点，
        n.next= n.next.next;
        return true;


    }
//    在链表里找到目标结点并删除：
    public boolean isFindNode(Item item){


          Node x = head;
          while(x!=null){
              if(x.item==item){
                  deleNode(x);
                  return true;

              }else {
                  x=x.next;
              }
          }
          return false;
    }
//   这个方法自己写了没成功，借鉴的网上，最后一句话还需要理解：
    public void deleTail(){
          Node current = head;
          if(current==null){
              return;
          }
          Node next= current.next;
          while (next.next != null){
            current = next;
            next = next.next;
          }
          current.next = null;
    }




//     从头部插入结点：
    public void addHead(Item item){

          if(isFull()){

              searchLRU(item);
          }else{
              Node insertNode = new Node(item);

              if(head == null){
                  head = insertNode;
                  return;
              }else{
                  Node oldHead = head;
                  insertNode.next = oldHead;
                  insertNode.item = item;
//              下面这步是重点，要把这个插入的结点再赋值给head;
                  head = insertNode;
              }


          }




    }

    public void displayAll(){

          Node x = head;
          while(x!=null){
              System.out.print(x.item+" ");
              x=x.next;
          }
    }

    public void searchLRU(Item item){
        if(isFindNode(item)){
            addHead(item);
        }else {
            if(isFull()){
                //删除尾节点，添加在头结点
                deleTail();
                addHead(item);
            }else{
//                直接加在头结点
                addHead(item);
            }
        }


    }


//    public Item get(Key key ){
//
//    }






    public static void main(String[] args){
          LRUTest<String> l = new LRUTest<String>();
          l.capacity= 10;
         l.addHead("1");
         l.addHead("2");
        System.out.println("未满时，逐个在链表头部加入缓存：");
         l.displayAll();
        System.out.println();
         l.addHead("3");
         l.addHead("4");
         l.addHead("5");
        System.out.println("未满时，逐个在链表头部加入缓存：");
        l.displayAll();
        System.out.println();
        l.addHead("6");
        l.addHead("7");
        l.addHead("8");
        l.addHead("9");
        System.out.println("未满时，逐个在链表头部加入缓存：");
        l.displayAll();
        System.out.println();
        System.out.println("现在缓存满了：");
        l.addHead("10");
        l.displayAll();
        System.out.println();
        System.out.println("缓存已满，加入不存在的缓存");
        l.addHead("11");
        l.displayAll();
        System.out.println();
        System.out.println("缓存已满，加入已经存在的缓存");
        l.addHead("4");
        l.displayAll();
        System.out.println();
        System.out.println("方法一：");
        l.searchLRU("3");
        l.displayAll();
        System.out.println();

//        System.out.println("方法二：");
//        l.addHead("3");
//        l.displayAll();
//        System.out.println();





    }


}
