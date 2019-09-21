package zuoye;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {2, 8, 7, 6, 4};
        System.out.print("排序前：");
        for(int num:arr){
            System.out.print(+num+","+"");
        }
        System.out.println(" ");
        int n = arr.length - 1;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }

        }
        System.out.print("排序后：");
        for (int num : arr) {
            System.out.print(num + ",");

        }

    }




}
