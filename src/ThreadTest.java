

public class ThreadTest {
    final static Object object= new Object();
    public static class T1 extends Thread{
        public void run(){
            try {
                System.out.println("T1开始");
                object.wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public static class T2 extends Thread{
        public void run(){
                System.out.println("T2开始,唤醒T1");
                object.notify();
        }
    }


    public static void main(String[] args){
        Thread t1= new T1();
        Thread t2= new T2();
        t1.start();
        t2.start();

    }



}
