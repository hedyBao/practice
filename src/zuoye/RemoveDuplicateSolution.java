//package zuoye;
//
//import com.sun.tools.hat.internal.parser.Reader;
//
//public class RemoveDuplicateSolution {
//    public int removeDuplicates(int[] nums){
//        if(nums.length==0){
//            return 0;
//        }
//        int i=0;
//        for(int j=1;j<nums.length;j++){
//            if(nums[j]!=nums[i]){
//                j++;
//            }
//            nums[i]=nums[j];
//        }
//        return i+1;
//
//    }
//
//    public static void main(String[] args) {
//        RemoveDuplicateSolution r= new RemoveDuplicateSolution();
//        int[] nums= {1,1,2,3,4};
//        System.out.println(r.removeDuplicates(nums));
//    }
//
//
//
//
//
//}
