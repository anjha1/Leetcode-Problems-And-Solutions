import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;  
            }
            set.add(num);
        }
        return false;  
        
    }
}

public class DuplicateNumber1 {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int arr[] = {1, 6, 9, 5, 3};  
        System.out.println(obj.containsDuplicate(arr)); 
    }
}

