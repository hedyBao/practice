 package zuoye;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


 public class HedyCache2 {

    private int capcity;

    private Map<Object, Object> map = new HashMap<>();

    private Deque deque = new LinkedList();

    private Map<String, String> map1= new ConcurrentHashMap<>();

    public HedyCache2(int capacity){
        this.capcity=capacity;
    }


    public void set(Object key,Object value){
        Object v = map.get(key);

        if(v != null){
            map.put(key,value);
            deque.removeFirstOccurrence(key);
            deque.addFirst(key);

        }else{
            if (map.size() == capcity){
                map.put(key,value);
                deque.addFirst(key);
                Object oldKey = deque.removeLast();
                map.remove(oldKey);
            }else{
                map.put(key,value);
                deque.addFirst(key);
            }
        }
    }




    public Object get(Object key){
        Object target = map.get(key);
        if(target == null){
            return null;
        }else{
          deque.removeFirstOccurrence(key);
          deque.addFirst(key);
        }

        return target;

    }


    public void displayAll(){
        map.forEach( (k,v) ->{
            System.out.print(k +":"+ v + ";" + "  ");
        });
        System.out.println("-----------------------------");

        deque.forEach( i ->{
            System.out.print(i + " ");
        });
    }


    public static void main(String args[]){
        HedyCache2 cache = new HedyCache2(6);
        cache.set("a",1);
        cache.set("s",2);
        cache.set("d",3);
        cache.set("f",4);
        cache.set("g",5);
        System.out.println("缓存未满，逐个添加在缓存链表头部：");
        cache.displayAll();
        System.out.println();
        System.out.println("缓存已满：");
        cache.set("h",6);
        cache.displayAll();
        System.out.println();

        cache.set("j",7);
        System.out.println("缓存已满，添加不在缓存的数据，结果如下：");
        cache.displayAll();
        System.out.println();


        cache.get("g");
        System.out.println("缓存已满，想从里面拿到一个已经存在的数据，结果如下：");
        cache.displayAll();
        System.out.println();




    }




}
