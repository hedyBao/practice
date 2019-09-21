package zuoye;

import java.lang.reflect.Array;

public class CharAt {
    public static void main(String[] args) {
        String str="eeeeefsd";
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='e'){
                count++;
            }
        }


        System.out.println("e的个数："+count);
    }
}
