package linked;

public class SingleLinkedListDemo {

   public static void main(String[] args){
       LinkListDemo linklist=new LinkListDemo();
//       linklist.addNode(2);
       linklist.addHead(1);
       linklist.display();
       linklist.addHead(2);
       linklist.addHead(3);
       linklist.display();
       linklist.deleHead();
       linklist.display();
       linklist.addLast(5);
       linklist.display();
       linklist.delete(1);
       linklist.display();


   }



}
