class Solution {
    public boolean Dubplicate(int arr []) {
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;
        
    }
}

public class DuplicateNumber3 {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int arr[]={1,6,9,5,6};
        System.out.println(obj.Dubplicate(arr));
    }
}
