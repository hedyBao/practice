package zuoye.ProxyTest;

public class CalculatorImpl implements Calculator {
    @Override
    public int add(int a, int b) {
        int result = a+b;
        return result;
    }

    public int subtract(int a, int b){
        int result= a-b;
        return result;
    }
}
