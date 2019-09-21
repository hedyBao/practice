package zuoye.ProxyTest;


import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//为了查看接口.class 对象和类.class对象的不同：
public class ClazzInfoShow {
    public static void main(String[] args) {
//        获取.class对象
        Class<Calculator> clazzCal = Calculator.class;
        Constructor[] clazzCalConstructs = clazzCal.getConstructors();
        Method[]  clazzCalMethods = clazzCal.getMethods();
        System.out.println("接口Calculator的构造器信息：");
        display(clazzCalConstructs);
        System.out.println("接口Calculator的方法信息：");
        display(clazzCalMethods);


        Class<CalculatorImpl> clazCalImpl= CalculatorImpl.class;
        Constructor[] calImplConstruct= clazCalImpl.getConstructors();
        Method[] calImplMethods = clazCalImpl.getMethods();
        System.out.println("类CalculatorImpl的构造器信息：");
        display(calImplConstruct);
        System.out.println("类CalculatorImpl的方法信息：");
        display(calImplMethods);


        Class proClaz = Proxy.getProxyClass(Calculator.class.getClassLoader(), Calculator.class);
    }


    public static void display(Executable[] targets){

        for(Executable target:targets){

            String name = target.getName();
            StringBuilder sb = new StringBuilder(name);
            sb.append("(");
            Class[] classparams = target.getParameterTypes();
            for(Class clazzParam : classparams){
                sb.append(clazzParam.getName()).append(",");
            }
//            删除最后一个逗号
            if(classparams!=null&& sb.length()!=0){
                sb.deleteCharAt(sb.length()-1);
            }
            sb.append(")");
            System.out.println(sb.toString());



        }

    }
}
