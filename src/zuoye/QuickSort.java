package zuoye;

public class QuickSort {
    public static void sort(int[] a, int low, int high){
        int i,j,temp,t;
        if(low > high){
            return;
        }
        i=low;
        j=high;
        temp=a[low];
        while(i<j){
            while(i<j && temp<=a[j]){
                j--;
            }

            while(i<j && temp>=a[i]){
                i++;
            }
            if(i<j){
                t=a[j];
                a[j]=a[i];
                a[i]=t;
            }
        }
        a[low] = a[i];
        a[i] = temp;

        sort(a,low,j-1);
        sort(a,j+1,high);
    }

    public static void main(String[] args){
        int[] a={0,1,0,4,8,2};
        sort(a, 0, a.length-1);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+",");
        }

    }


}
