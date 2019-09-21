package zuoye.ProxyTest;

import java.lang.reflect.Proxy;

public class DynProxyTest {
    public static void main(String[] args) {
        Calculator target = new CalculatorImpl();
        CalDynamicHandler p = new CalDynamicHandler(target);
        Calculator pro =(Calculator)Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                p);
        int re = pro.add(3,2);
        System.out.println(re);


    }




}
