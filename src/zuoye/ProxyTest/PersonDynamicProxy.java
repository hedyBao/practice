package zuoye.ProxyTest;

import java.lang.reflect.Proxy;

public class PersonDynamicProxy {
    public static void main(String[] args) {
        Person p = new PersonImpl();
        PersonHandler proxy = new PersonHandler(p);
        Person p1 =(Person) Proxy.newProxyInstance(proxy.getClass().getClassLoader(),
                new Class<?>[]{Person.class}, proxy);
        p1.dance();

    }
}
