package zuoye;

import sun.rmi.server.DeserializationChecker;

import java.io.*;

public class TestSerialversionUID implements Serializable {
    public static void main(String[] args) throws Exception{
       SerializeCustomer();
       Customer customer = DeserializeCustomer();
        System.out.println(customer);


    }
    private static void SerializeCustomer() throws FileNotFoundException, IOException {
        Customer customer= new Customer("gale",25);
        ObjectOutputStream oo=new ObjectOutputStream(new FileOutputStream(new File("/Users/tomas/Downloads/c.txt")));
        oo.writeObject(customer);
        System.out.println("反序列化成功");
        oo.close();
    }
    private static Customer DeserializeCustomer() throws Exception,IOException{
        ObjectInputStream ois= new ObjectInputStream(new FileInputStream(new File("/Users/tomas/Downloads/c.txt")));
        Customer customer=(Customer) ois.readObject();
        System.out.println("序列化成功");
        return customer;

    }




}


