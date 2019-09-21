package zuoye;

import java.lang.reflect.Array;

public class ReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException {

//        获得class对象的三个方法：
//        （1）使用 Class 类的 forName 静态方法
        Class c1 = Class.forName("java.lang.String");
//        获取所传类从java语言规范定义的格式输出
        System.out.println(c1.getCanonicalName());
        Class c2 = Class.forName("[[D");
        System.out.println(c2.getCanonicalName());
//        （2）class的.class方法
        Class clz = Boolean.class;
        System.out.println(clz.getCanonicalName());
//        （3）Object的getClass方法
        byte[] bytes = new byte[1024];
        Class c3 = bytes.getClass();
        System.out.println(c3.getCanonicalName());


        Class<?> cls =Class.forName("java.lang.String");
        Object array= Array.newInstance(cls,2);
        Array.set(array, 0, "Scala");
        Array.set(array, 1, "Java");

        System.out.println(Array.get(array,1));



    }
}
