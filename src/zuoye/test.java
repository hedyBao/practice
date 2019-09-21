package zuoye;

public class test {
    public static void main(String[] args){

        System.out.println((0+15)/2);
        System.out.println(true&&false || true &&true);
        System.out.println((1+2.236)/2);
        System.out.println(1+2+3+4.0);
        System.out.println(1+2+"3");

        test(5,4);
        System.out.println(test1(1,1));
    }

    public static void test(int a, int b){

        int c = 1;
        if(a > b) {
            c = 0;
        }

        System.out.println(c);
    }

    public static boolean test1(double x,double y){
        if((x > 0d && x < 1d)&&(y > 0d && y < 1d)){
            return true;

        }else{
            return false;
        }
    }

}
