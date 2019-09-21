package zuoye;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class QuickSortNew {


    public int[] quickSortNew(int[] a, int left ,int right){

        int pivot = midValue(a,left,right);
//        首先分析数组的数目大于3时
        if(right-left+1>3){
            int i= left;
            int j= right -1;
            while (i<j){
//                如果满足括号里的条件，会一直继续下去 ，目的：a[i]>pivot 时才停下，所以条件取反时一直往右移：
                while (i<j && a[i]<= pivot){i+=1;}
//                同上，找到a[j]<pivot
                while (i<j && a[j]>= pivot){j-=1;}
//                以上循环停下的时候 ，如果正好i<j,交换a[i] a[j]的位置
                if(i<j){
                    swap(a, i, j);
                }else {
                    break;
                }
            }
            swap(a,i,right-1);
            quickSortNew(a,left,i-1);
            quickSortNew(a, i+1, right);
        }
        return a;
    }

    public void swap(int[] a, int i , int j){
        int temp= a[i];
        a[i]=a[j];
        a[j]=temp;
    }
//   三数中值法是为了防止最坏情况的出现，找到三数中值，并与right-1 交换，能减少一次交换次数，因为right 确定＞ 中值；
    public int midValue(int a[], int left, int right){
//        先确定数组里的数>=3个,这样才能选三个数里的中值：
        if(right-left+1>=3){
            int center =(left+right)/2;
            if(a[left]> a[center]){
                swap(a,left,center);
            }
            if(a[center]> a[right]){
                swap(a,center,right);
            }
//            这一步是防止原先的顺序为：321，相当于比较了原来的left、right；
            if(a[left]>a[center]){
                swap(a,left,center);
            }
            swap(a,center,right-1);
            return a[right-1];
        }else{
            if(a[left]>a[right]){
                swap(a,left,right);
            }
            return 0;
        }
    }

    public static void main(String[] args){
        int arr[]={1,5,10,6,2,4};
//        int[] a={11,3,2,14,5,32,7,87,9,0,12,3,21,43535,554,64,234,76,676,45,565,45};
        QuickSortNew qs= new QuickSortNew();
//        qs.quickSortNew(a,0,a.length-1);
        qs.quickSortNew(arr,0,arr.length-1);
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
//        for(int i =0;i<a.length;i++){
//            System.out.print(a[i]+ " ");
//        }
    }

}
