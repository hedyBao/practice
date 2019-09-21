package array;

public class twoDimensionalArray {
    public static void main(String[] args){
        int [][] arr= new int [2][3];
        arr[0]= new int []{1,2,3};
        arr[1][0]=23;
        arr[1][1]=2;
        arr[1][2]=45;
        for(int i=0;i<arr.length;i++){
//            System.out.println(arr[i]);

            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+",");
            }
        }



        int [][] arr1= {{6,7,8,9},{11,22}};
        for (int[] is:arr1) {
            for (int i:is) {
                System.out.print(i+",");

            }
            
        }
        
    }



}
