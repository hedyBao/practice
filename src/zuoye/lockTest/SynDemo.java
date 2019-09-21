package zuoye.lockTest;

import java.util.concurrent.locks.ReentrantLock;

public class SynDemo {
    //普通同步方法，锁是当前实例对象
    public synchronized void talk(){
        System.out.println("talk");

    }
    //静态同步方法，锁是当前类的class对象
    public static synchronized void run(){
        System.out.println("run");

    }
    //同步方法块，锁是括号里的对象
    public int getValue(int v){
        synchronized (this){
            return --v;
        }
    }


}
