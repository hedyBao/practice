package zuoye.ProxyTest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxyTest {
    public static void main(String[] args){
        CalculatorImpl cal = new CalculatorImpl();
        Calculator calculatorProxy = (Calculator)getProxy(cal);
        calculatorProxy.add(2,3);
        calculatorProxy.subtract(3,2);
    }

    public static Object getProxy( final Object target){
//        传入委托目标类的对象 target target
        Object proxy = Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                //匿名类
                new InvocationHandler(){
                    public Object invoke(Object proxy, Method method,Object[] args) throws Throwable{
                        System.out.println(method.getName()+"方法start:");
                        Object result = method.invoke(target,args);
                        System.out.println(result);
                        System.out.println(method.getName()+"方法end");
                        return result;

                    }

                });
        return proxy;





    }
}
