package zuoye.ProxyTest;

import com.sun.deploy.net.proxy.ProxyHandler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class CalDynamicHandler implements InvocationHandler {
    private Object target;


    public CalDynamicHandler(Object target){
        this.target=target;

    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws  Throwable{
        try{
            return method.invoke(target,args);

        }catch (Exception e){
            System.out.println(e);
            return 1;

        }

    }

}
