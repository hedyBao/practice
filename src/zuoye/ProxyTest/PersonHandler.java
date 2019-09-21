package zuoye.ProxyTest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class PersonHandler implements InvocationHandler {
    private Object objectTarget;

    public PersonHandler(Object objectTarget){
        this.objectTarget = objectTarget;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable{
        System.out.println("动态代理");
         return method.invoke(objectTarget,args);
    }
}
