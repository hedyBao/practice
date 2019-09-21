package zuoye.RPC;

public class ServiceImpl implements Service {
    @Override
    public String say(String s){
        String result = "我是Service的实现类"+s;
        System.out.println(result);
        return result;


    }
}
