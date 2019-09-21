package zuoye.ProxyTest;

public class CalClient {

    public static void main(String[] args) {

        Calculator c = new CalculatorProxy(new CalculatorImpl());

        System.out.println(c.add(2,3));
    }

}
