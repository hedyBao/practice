package zuoye;

import java.io.Serializable;

public class Customer implements Serializable{
    private static final long serialVersionUID = -5182532647273106745L;
        private String name;
        private int age;
        private String sex;
        public  Customer(String name,int age){
            this.name=name;
            this.age=age;
        }

    public String toString(){
            return "name="+name+",age="+age;
    }
}
