package zuoye.ProxyTest;

import java.lang.reflect.Proxy;

public class DynamicProxyClient {

    public static void main(String[] args) {
        Calculator calculatorA= new CalculatorImpl();

        CalDynamicHandler calDynamicHandler = new CalDynamicHandler(calculatorA);

        Calculator proxy = (Calculator)Proxy.newProxyInstance(calDynamicHandler.getClass().getClassLoader(),
                new Class<?>[]{Calculator.class}, calDynamicHandler);


        System.out.println( proxy.add(2,3));

    }

}
