package zuoye.ProxyTest;

public class PersonClientOfStaticProxy {
    public static void main(String[] args) {
        PersonImpl p = new PersonImpl();
        PersonImplStaticProxy personProxy = new PersonImplStaticProxy(p);
        personProxy.dance();

    }


}
