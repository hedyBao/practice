package zuoye.ProxyTest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class PersonImplProxyOfWeb {
    private Person person = new PersonImpl();

    public Person creatPersonPrxoy(){
        return (Person) Proxy.newProxyInstance(person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new InvocationHandler(){
            public Object invoke(Object proxy, Method method, Object[] args) throws  Throwable{
                String methodName = method.getName();
                if("dance".equals(methodName)){

                    return method.invoke(person,args);
                }
            return null;
            }
        });
    }
}
