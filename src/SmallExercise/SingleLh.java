package SmallExercise;

public class SingleLh {
    private static SingleLh singleLh;
    private SingleLh(){};

    public static SingleLh getInstance(){
        if(singleLh==null){
            singleLh= new SingleLh();
        }
        return singleLh;
    }


}
