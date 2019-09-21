package zuoye.Tmulti;

public class testThred {

    public static void main(String[] args) {

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                    System.out.println("a");
                }catch (Exception  e){

                }
            }
        });
        thread.start();

        try {
            Thread.sleep(10000);
        }catch(Exception e){

        }

        System.out.println("b");

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    Thread.sleep(6000);
                    System.out.println('w');
                }catch (Exception e){

                }

            }
        });
        thread1.start();



    }

}
