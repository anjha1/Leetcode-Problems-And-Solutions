class Solution {
    public int peakIndexInMountainArray(int[] arr) {
//         int i=0;
//         while(arr[i+1]>arr[i]){
//             i++;
//         }
//         return i;
//     }
// }

    int low=0,high=arr.length-1;
    while(low<high){
        int mid=low+(high-low)/2;
        if(arr[mid]<arr[mid+1]){
            low=mid+1;
        }
        else{
            high=mid;
        }
    }
    return high;
    }
}
    



public class MountainArray {
    public static void main(String[] args) {
        Solution obj=new Solution();
        int arr[]={0,1,5,88,90,70,30,0};
        System.out.println(obj.peakIndexInMountainArray(arr));
    }
}
