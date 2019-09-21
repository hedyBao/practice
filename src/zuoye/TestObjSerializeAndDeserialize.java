package zuoye;

import sun.rmi.server.DeserializationChecker;

import java.io.*;
import java.text.MessageFormat;

public class TestObjSerializeAndDeserialize {
    public static void main(String[] args) throws Exception{
        SerializablePerson();
        Person p= DeserializePerson();
        System.out.println(MessageFormat.format("name={0},age={1},sex={2}",p.getName(),p.getAge(),p.getSex()));
    }
    private static void SerializablePerson() throws FileNotFoundException, IOException {
        Person person= new Person();
        person.setAge(23);
        person.setName("david");
        person.setSex("male");
        ObjectOutputStream oo= new ObjectOutputStream(new FileOutputStream(new File("/Users/tomas/Downloads/b.txt")));
        oo.writeObject(person);
        System.out.println("Person 对象序列化成功");
        oo.close();
    }
    private static  Person DeserializePerson() throws Exception,IOException{
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream(new File("/Users/tomas/Downloads/b.txt")));
        Person person=(Person) ois.readObject();
        System.out.println("Person反序列化成功");
        return person;
    }
}
