package zuoye;

public class selectionSort {
    public static void main(String[] args){
        int[] arr={2,5,6,1};
        int n = arr.length-1;

        for(int i=0;i<=n;i++){
            int min=i;
            for(int j=i+1;j<=n;j++){

                if (arr[j] < arr[min]) {
                    min=j;
                }

            }
            if(min!=i){
                int temp = arr[i];
                arr[i]=arr[min];
                arr[min]=temp;

            }

        }
        System.out.print("排序后：");
        for (int num : arr) {
            System.out.print(num + ",");
        }
    }




}
