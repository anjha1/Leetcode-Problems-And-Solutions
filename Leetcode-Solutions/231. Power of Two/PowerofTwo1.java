class Solution {
    public boolean isPowerOfTwo(int n) {
        int i=1;
        while (i<n) {
          i=i*2;
        }
        return i==n ? true :false;
    }
    
}

public class PowerofTwo1 {
    public static void main(String[] args) {
        Solution obj=new Solution();
        System.out.println(obj.isPowerOfTwo(16));
    }
}
