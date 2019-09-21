package zuoye.Tmulti;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecutorTest {


    static ScheduledExecutorService service = Executors.newScheduledThreadPool(32);
    static ExecutorService service11= Executors.newFixedThreadPool(32);

    public static void main(String[] args) {

        for(int i = 0; i< 10000;i++)
        service.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("ggggg");
            }
        },1000, TimeUnit.MILLISECONDS);

        for(int i = 0;i<100;i++){
            service11.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("1");
                }
            });
        }


    }
}
