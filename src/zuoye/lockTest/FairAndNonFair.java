package zuoye.lockTest;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FairAndNonFair {
    protected final boolean tryAcquire(int acquires){
        final Thread current = Thread.currentThread();
        Lock lock = new ReentrantLock();
        return true;
    }
}
