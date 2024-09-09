class Solution {
    public boolean isPowerOfTwo(int n) {
       return (n>0 && ((n & (n-1)) == 0 ));
    }
}
public class PowerofTwo{
    public static void main(String[] args) {
            Solution obj=new Solution();
            System.out.println(obj.isPowerOfTwo(16));
        }
}
        
