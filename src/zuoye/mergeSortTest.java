package zuoye;

public class mergeSortTest {
    public static void mergeSort(int[] a ,int left,int right){

        if(left<right){
            int mid=(left+right)/2;
            mergeSort(a,left,mid);
            mergeSort(a,mid+1,right);
            merge(a,left,mid,right);
        }
    }

    public static void merge(int[] a,int left, int mid, int right){
        int[] t=new int[a.length];
        int leftStart=left;
        int rightStart=right;
        int tIndex=left;
        while(leftStart<=mid && rightStart<=right){
           if(a[leftStart]<a[rightStart]){
               t[tIndex++]=a[leftStart++];
           }else{
               t[tIndex++]=a[rightStart++];
           }
        }
        while (leftStart<=mid){
            t[tIndex++]=a[leftStart++];
        }
        while(rightStart<=right){
            t[tIndex++]=a[rightStart++];
        }
        while(left<=right){
            a[left]=t[tIndex++];
        }
    }

    public static void showArr(int[] a){
        for(int i =0;i<a.length;i++){
            System.out.println(a[i]+",");
        }
    }

    public static void main(String[] args){
        int[] a={4, 2, 6, 1, 3, 8, 5, 9};
        mergeSort(a,0,a.length-1);
        showArr(a);
    }

}
