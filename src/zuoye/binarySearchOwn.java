package zuoye;

public class binarySearchOwn {

    public static int  unRecursiveBiSearch(int[] arr,  int key){
        int low =0;
        int high= arr.length-1;
        int mid=0;
        if(key < arr[low] || key > arr[high] || low > high){
            return -1;
        }


        while(low <= high){
            mid = (low+high)/2;
            if(key < arr[mid]){
                high = mid-1;
            }else if(key > arr[mid]){
                low = mid+1;
            }else{
                return mid;
            }
        }
    return -1;
    }

    public static int recursiveBiSearch(int[] arr, int key, int lo,int hi){
        if(lo<=hi){
            int mid=(lo+hi)/2;
            if(arr[mid]==key){
                return mid;
            } else if (arr[mid]<key) {
                return recursiveBiSearch(arr,key,mid+1,hi);
            }else{
                return recursiveBiSearch(arr,key,lo,mid-1);
            }

        }
    return -1;
    }

//    public static void main(String[] args){
//        int[] arr ={1,2,5,9,34,67};
//        int key= 34;
//        int position = unRecursiveBiSearch(arr,key);
//
//        if(position==-1){
//            System.out.println("无结果");
//        }else{
//            System.out.println("查找的是"+key+"，"+"位置是"+position);
//        }
//
//    }
    public static void main(String[] args){
        int[] arr ={1,2,5,9,34,67,78,96};
        int key= 3;
        int position = recursiveBiSearch(arr,key,0,arr.length -1);

        if(position==-1){
            System.out.println("无结果");
        }else{
            System.out.println("查找的是"+key+"，"+"位置是"+position);
        }

    }

//
}
