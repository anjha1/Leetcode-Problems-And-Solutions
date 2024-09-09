class Solution{
    public boolean isPowerOfTwo(int n){
        int i=1;
        while (n>=i) {
            int t=2*i;
            if (n==t || n==1){
                return true;
            }
            i++;
        }
        return false;
    }
}
public class PowerofTwo2 {
    public static void main(String[] args) {
        Solution obj=new Solution();
        System.out.println(obj.isPowerOfTwo(1));
    }
}



