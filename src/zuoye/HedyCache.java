package zuoye;

import java.util.HashMap;



public class HedyCache {
//    hedyNode是结点的基本单位：
    private class HedyNode {
        String key;
        Object value;
        HedyNode prev;
        HedyNode next;

        public HedyNode(String key, Object value){
            this.key= key;
            this.value = value;
        }
    }

//    缓存的容量：
    private int capcity;
//    为了便于存取，且查找的时间复杂度为O(1),用map存基本单位hedyNode：
    private HashMap<String, HedyNode> map;
//    为了便于操作，使用双向链表：
    private HedyNode head;
    private HedyNode tail;
    public HedyCache(int capacity){
        this.capcity=capacity;
        this.map=new HashMap<String, HedyNode>();
    }


    public void set(String key,Object value){
        HedyNode targetNode = map.get(key);

        if(targetNode!=null){
//            如果目标结点已经存在于缓存，那么应该先get到结点，然后删除remove(String key)，然后放在头部setHead；
            HedyNode targetN= map.get(key);
            //拿到结点后要更新value
            targetN.value=value;
            removeNode(key);
        }else{
            targetNode = new HedyNode(key,value);
            if(map.size()< capcity){
                map.put(key,targetNode);
            }else {
                removeTail();
            }
        }
        setHead(targetNode);


    }


    public void setHead(HedyNode node){
        if(head!=null){
            node.next=head;
            head.prev=node;
        }
        head= node;
//        以下这部分代码的用意没有太明白？为什么还要再判断一次尾节点是不是空？
        if(tail==null){
            tail=node;
        }

    }


    public HedyNode get(String key){
        HedyNode targetNode = map.get(key);
        if(targetNode == null){
            return null;
        }else{
           remove(targetNode);
           setHead(targetNode);
            return targetNode;
        }

    }



    public void remove(HedyNode node){
        if(node.prev!=null){
            node.prev.next=node.next;
        }else{
            head= node.next;
        }

        if(node.next!=null){
            node.next.prev=node.prev;
        }else{
            tail=node.prev;
        }

    }

    public void removeTail(){

        if(tail != null){
            tail=tail.prev;
            if(tail == null){
                head= null;
            }else {
                tail.next=null;
            }
        }
    }
    //删除的时候要考虑到是否为头尾结点的情况，以下四种情况考虑的很全面：
    public void removeNode(String key){
        HedyNode targetNode = map.get(key);
        if(targetNode!=null){
            if(targetNode.prev!=null){
                targetNode.prev.next=targetNode.next;
            }
            if (targetNode.next!=null){
                targetNode.next.prev= targetNode.prev;
            }
            if(targetNode == head){
                head= targetNode.next;
            }
            if (targetNode ==tail){
                tail= targetNode.prev;
            }
        }

    }

    public void displayAll(){
        HedyNode x =head;
        while(x!=null){
            System.out.print("key:" + x.key +" " +"value:" + x.value + "      ");
            x=x.next;
        }

    }
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        HedyNode node = head;
//        while (node != null) {
//            sb.append(String.format("%s:%s ", node.key, node.value));
//            node = node.next;
//        }
//        return sb.toString();
//    }


//    public static void main(String args[]){
//        HedyCache cache = new HedyCache(6);
//        cache.set("a",1);
//        cache.set("s",2);
//        cache.set("d",3);
//        cache.set("f",4);
//        cache.set("g",5);
//        System.out.println("缓存未满，逐个添加在缓存链表头部：");
//        cache.displayAll();
//        System.out.println();
//        System.out.println("缓存已满：");
//        cache.set("h",6);
//        cache.displayAll();
//        System.out.println();
//
//        cache.set("j",7);
//        System.out.println("缓存已满，添加不在缓存的数据，结果如下：");
//        cache.displayAll();
//        System.out.println();
//
//
//        cache.get("g");
//        System.out.println("缓存已满，想从里面拿到一个已经存在的数据，结果如下：");
//        cache.displayAll();
//        System.out.println();
//
//
//
//
//    }




}
