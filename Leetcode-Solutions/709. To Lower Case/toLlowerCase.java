
class Solution {
    public String toLowerCase(String s) {
        char arr[] = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 65 && arr[i] <= 90) {
                arr[i] = (char) (arr[i] + 32);
            }
        }
        return String.valueOf(arr);

    }
}

public class toLlowerCase {
    public static void main(String[] args) {
        Solution obj = new Solution();
        System.out.println(obj.toLowerCase("Anjha"));
    }
}
