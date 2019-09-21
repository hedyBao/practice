package SmallExercise;

public class SingleLhXa {
    private static SingleLhXa singleLhXa;
    private SingleLhXa(){};
    public static synchronized SingleLhXa getSingleLhXa(){
        if(singleLhXa==null){
            singleLhXa=new SingleLhXa();
        }
        return singleLhXa;
    }
}
