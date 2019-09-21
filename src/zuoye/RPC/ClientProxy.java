package zuoye.RPC;



import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ClientProxy implements InvocationHandler {
    private Object obj;


    public ClientProxy(Object obj){
        this.obj = obj;

    }


    public static Object getProxy(Object obj){


        return Proxy.newProxyInstance(Service.class.getClassLoader(),
                new Class<?>[]{Service.class},
                new ClientProxy(obj));
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable{
        Object result = new Object();
        return result;

    }
}
