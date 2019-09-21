package MySort;

import java.util.ArrayList;
import java.util.List;

public class SortDemo {
    private static void BubbleSortTest(int[] arr){
        int temp=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

        }
    }


    private static void QuickSortTest(int[] a){







    }


    public static void main(String[] args){

        int[] arr={3,6,9,1,5};
        System.out.println(arr);
        for(int i =0; i <arr.length; i++){
            System.out.printf(arr[i]+" ");
        }
        System.out.println();

        BubbleSortTest(arr);
        for(int i =0; i <arr.length; i++){
            System.out.printf(arr[i]+" ");
        }



    }
}
