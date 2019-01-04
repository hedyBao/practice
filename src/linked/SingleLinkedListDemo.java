package linked;

public class SingleLinkedListDemo {

   public static void main(String[] args){
       LinkListDemo linklist=new LinkListDemo();
//       linklist.addNode(2);
       linklist.addHead(1);
       System.out.println(linklist);
       linklist.addHead(2);
       linklist.addHead(3);


       System.out.println(linklist);
   }



}
