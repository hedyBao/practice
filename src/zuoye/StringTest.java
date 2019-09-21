package zuoye;

public class StringTest {


    public static void main(String[] args) {
        String str1= new String();
        String str2=new String("asdhjkkluyiu");
        String str5=str2.substring(2,5);
        String str3= new String("abc");
        String str4 =new String("ABC");
        int a = str3.compareTo(str4);
        int b= str4.compareTo(str3);
        boolean c= str3.equals(str4);
        boolean d= str3.equalsIgnoreCase(str4);
        String str7= str3.concat("fff");

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(str5);
        System.out.println(str7);

        String str= "I am a good student";
        System.out.println(str.indexOf("a"));
        System.out.println(str.indexOf("good"));
        System.out.println(str.lastIndexOf("good"));
        System.out.println(str.lastIndexOf("I",2));

    }



}
