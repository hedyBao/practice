package zuoye;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class chapterOne {
    public static void main(String[] args){
//   1.1.6     int f=0;
//        int g=1;
//        for(int i =0;i<=15;i++){
//            System.out.println(f);
//            f=f+g;
//            g=f-g;
//        }

//        1.1.5 double x;
//        double y;
//
//        StdOut.print(compare(0.1)&&compare(0.2));
//        1.1.7
//        double t= 9.0;
//        while(Math.abs((t-9.0/t))>0.01)
//            t=(9.0/t+t)/2.0;
//        System.out.printf("%.5f/n",t);
//
//        int sum=0;
//        for(int i = 1; i<1000; i++){
//            for(int j = 0; j<i; j++){
//                sum++;
//            }
//        }
//        System.out.println(sum);
//        int su=0;
//        for(int i = 1; i<1000; i*=2){
//            for(int j = 0; j<1000; j++){
//                su++;
//            }
//        }
//        System.out.println(su);

// 1.1.8       System.out.println('b');
//        System.out.println('b'+'c');
//        System.out.println((char)('a'+4));

//    int [][]a={{1,2,3},{4,5,8},{6,7,9}};
//
//
//        System.out.println("转置前：");
//        for(int i =0;i<a.length;i++){
//            for(int j=0;j<a[i].length;j++){
//                System.out.print(a[i][j]+" ");
//            }
//            System.out.println();
//        }
//
//        int [][]b= new int[a[0].length][a.length];
//        System.out.println("转置后：");
//        for(int i =0;i<a.length;i++){
//            for(int j=0;j<a[i].length;j++){
//                b[j][i]=a[i][j];
//
//
//            }
//        }
//        for(int i =0;i<b.length;i++){
//            for(int j=0;j<b[i].length;j++){
//                System.out.print(b[i][j]+" ");
//            }
//        }
//        1.1.13int[][] arr={{1,3,4},{5,6},{8}};
//        //循环给二维数组赋值
//
//        //打印下二维数组
//        System.out.println("---转置前---");
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }
//
//        //定义一个新数组，用来存储转置后的数据
//        int[][] arrNew=new int[arr[0].length][arr.length];
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                arrNew[j][i]=arr[i][j];
//            }
//        }
//        System.out.println("---转置后---");
//        for (int i = 0; i < arrNew.length; i++) {
//            for (int j = 0; j < arrNew[i].length; j++) {
//                System.out.print(arrNew[i][j]+" ");
//            }
//            System.out.println();
//        }
//        1.1.18System.out.println(mystery(2,25));
//        System.out.println(mystery(3,11));




    }
//    遍历二维数组的两种方法：
//    方法一（转置）：
    public static void tDiArr1(int [][] a ){
        for(int i =0;i<a.length;i++){

            for(int j=0;j<a[i].length;j++){

                System.out.print(a[j][i]+" ");
            }
            System.out.println();
        }

    }

//    方法二：
    public static void tDiArr2(int [][] a){
        for(int[] cells: a){
            for(int cell:cells){
                System.out.print(cell+" ");
            }
            System.out.println();
        }

    }

    public static boolean compare(double x ){
        if(x>0&&x<1){
            return true;
        }else{
            return false;
        }

    }

    public static int mystery(int a ,int b){
        if(b==0) return 0;
        if(b%2==0) return mystery(a+a,b/2);
        return mystery(a+a,b/2)+a;

    }



}
