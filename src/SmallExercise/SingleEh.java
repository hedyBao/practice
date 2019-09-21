package SmallExercise;

public class SingleEh {

    private static SingleEh singleEh= new SingleEh();
    private SingleEh(){};
    public static SingleEh getSingleEh(){
        return singleEh;
    }
}
