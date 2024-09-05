class Solution {
    public String toLowerCase(String s){
        String abc="";
        for(int i=0;i<s.length();i++){
            if('A'<=s.charAt(i) && 'Z'>=s.charAt(i)){
                abc+=(char) (s.charAt(i)+32);
            }
            else{
                abc+=s.charAt(i);
            }
        }
        return abc;
    }
}

public class toLlowerCase2 {
    public static void main(String[] args) {
        Solution obj=new Solution();
        System.out.println(obj.toLowerCase("AnJha"));
    }
}
