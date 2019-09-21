package zuoye.ProxyTest;

public class CalculatorProxy implements Calculator {

    private Calculator target;

//    把目标对象作为参数传给代理对象的构造器，代理对象调用目标对象的同名方法，
    public CalculatorProxy(Calculator target){
        this.target=target;
    }

    public int add(int a, int b){
        int result = target.add(a, b);
        return result;

    }

    public int subtract(int a, int b){
        int result = target.subtract(a ,b);
        return result;

    }










}
