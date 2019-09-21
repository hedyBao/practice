package containerlikespring;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static javax.xml.xpath.XPathFactory.newInstance;

public class regiser {

    static {

    }

    static HashMap<String,Object> clazhm = new HashMap<>();






    public static void register(Class clazz) throws IllegalAccessException,InstantiationException{


        Object o = clazz.newInstance();



        clazhm.put(clazz.getName(),o);

    }


    public static Object get(String clazzname){
        Object o= clazhm.get(clazzname);
        return  o;

    }
}
