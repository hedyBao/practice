package zuoye.RPC;

public class Test2 {
    public static void main(String[] args) {
        Service t=new ServiceImpl();
        ClientProxy p = new ClientProxy(t);
        Service s = (Service)ClientProxy.getProxy(p);
        String re= s.say("");
        System.out.println(re);

    }
}
