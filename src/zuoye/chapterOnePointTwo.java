package zuoye;

public class chapterOnePointTwo {
    public static void main(String[] args){
//        String s = "Hello World";
//        s.toUpperCase();
//        s.substring(6,11);
//        System.out.println(s);

//        String s = args[0];
//        String t = args[1];
//        if(s.length()==t.length() && s.concat(s).indexOf(t) !=-1){
//            System.out.println("yes");
//        }else {
//            System.out.println("no");
//        }
//
//        String a="day up";
//        a = a.concat("day up");
//        System.out.println(a);
        System.out.println(mystery("mn"));
        System.out.println(mystery("fool"));
    }

    public static String mystery(String s ){
        int N=s.length();
        if(N <= 1) return s;
        String a = s.substring(0,N/2);
        String b = s.substring(N/2,N);
        return mystery(b)+mystery(a);

    }

}
