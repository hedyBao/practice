package zuoye;

import edu.princeton.cs.algs4.In;

import java.util.Arrays;
import java.util.Scanner;

public class binarySearch {
    private static int high;
    public static int rank(int[] a, int key){
        return rank(a,key,0,a.length-1,high);
    }
    public static int rank(int[]a ,int key,int lo,int hi,int high){
        System.out.println("high:"+high+"lo:"+lo+"hi:"+hi);
        if(hi<lo){
            return -1;
        }
        int mid=lo+(hi-lo)/2;
        if(a[mid]<key)
            return rank(a,key,mid+1,hi,high+1);
        else if(a[mid]>key)
            return rank(a,key,lo,mid-1,high+1);
        else
            return mid;
    }

    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        String pattern=scanner.nextLine();
        int[] whitelist= In.readInts(args[0]);
        Arrays.sort(whitelist);
        while(scanner.hasNextLine()){
            int key=scanner.nextInt();
            if(pattern=="+"){
                if(rank(whitelist,key)==-1){
                    System.out.println(key);
                }
            }else if(pattern=="-"){
                if(rank(whitelist,key)!=-1){
                    System.out.println(key);
                }
            }
        }
    }
}
