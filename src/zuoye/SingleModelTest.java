package zuoye;
//懒汉模式

public class SingleModelTest {

    private SingleModelTest(){

    }

    private static SingleModelTest singleModelTest;


    public static SingleModelTest getInstance(){

        if(singleModelTest==null){

            synchronized (SingleModelTest.class){

                if(singleModelTest==null){
                    singleModelTest= new SingleModelTest();
                }

            }

        }
        return singleModelTest;
    }


}
