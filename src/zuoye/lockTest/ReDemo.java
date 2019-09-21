package zuoye.lockTest;

import java.util.concurrent.locks.ReentrantLock;

public class ReDemo {
    private final ReentrantLock lock = new ReentrantLock();

    public void talk(){
        lock.lock();
        try {
            System.out.println("h");
        }finally {
            lock.unlock();
        }
    }
}
