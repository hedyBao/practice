package zuoye.lockTest;

public class SynTalking extends SynTalk{
    public synchronized void talk(){
        System.out.println("h");
        super.talk();
    }
}
