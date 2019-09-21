package zuoye;

public class insertSort {
   private int[] a;
   private int length;




   public insertSort(int[] a ){
       this.a=a;
       this.length=a.length;
   }
   public void display(){
       for(int num:a){
           System.out.print(num+",");
       }
       System.out.println();
    }
    public void doInsertSort(){
       for(int i =1;i<length;i++){
           int temp=a[i];
           int leftindex=i-1;
           while(leftindex>=0 && a[leftindex]>temp){
               a[leftindex+1]=a[leftindex];
               leftindex--;
           }
           a[leftindex+1]=temp;
       }
    }

    public static void main(String[] args){
       int[] array={2,9,7,4,6};
       insertSort is = new insertSort(array);
       is.doInsertSort();
       is.display();


    }
}
