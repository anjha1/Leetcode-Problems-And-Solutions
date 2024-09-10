import java.util.Arrays;
class Solution {
    public boolean Dubplicate(int arr []) {
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                return true;
            }
        }
        return false;
    }
}

public class DuplicateNumber2 {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int arr[]={1,6,9,5,7,6,9};
        System.out.println(obj.Dubplicate(arr));
    }
}
