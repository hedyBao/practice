package zuoye;

import java.lang.reflect.Array;

public class Rotate {
    public static void main(String[] args) {
        int[] nums ={2,3,5,6,7};
        int k=2;
        int n=nums.length;
        int i;
        int j;

//         for(j=0;j<k;j++){
//             int tmp=nums[n-1];
//             for( i=n-1;i>0;i--){
//
//                 nums[i]=nums[i-1];
//
//             }
//             nums[0]=tmp;
//
//         }
        for(i=n-k;i<n;i++){
            nums[i-k-1]=nums[i];
            int tmp= nums[i];


        }





    }


}
