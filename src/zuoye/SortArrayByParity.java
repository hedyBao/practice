package zuoye;

public class SortArrayByParity {
    public static void main(String[] args) {
        int[] nums= {3,2,1,4};
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                System.out.print(nums[i]+",");
            }

        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==1){
                System.out.print(nums[i]+",");
            }

        }

    }
}
