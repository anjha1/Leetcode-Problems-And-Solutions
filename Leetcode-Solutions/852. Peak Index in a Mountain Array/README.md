Problem Statement:
The task is to find the peak index in a mountain array. A mountain array is defined as an array where elements first increase and then decrease. We need to return the index of the peak element, which is the highest point in the array.

Approach:
The solution implements a binary search algorithm to find the peak index efficiently. Instead of using a linear search with O(n) time complexity, we utilize binary search, which reduces the time complexity to O(log n).

Solution Explanation:
The algorithm starts with two pointers, low and high, initialized at the beginning and the end of the array, respectively.
In each iteration, it calculates the middle index mid.
If the element at mid is less than the element at mid + 1, it means the peak lies on the right side, so low is updated to mid + 1.
Otherwise, the peak lies on the left side (including mid), so high is updated to mid.
The process continues until low equals high, which is the index of the peak element.

Code:
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int low = 0, high = arr.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] < arr[mid + 1]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return high;
    }
}

public class MountainArray {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int arr[] = {0, 1, 5, 88, 90, 70, 30, 0};
        System.out.println(obj.peakIndexInMountainArray(arr));  // Output: 4
    }
}


Example:
For the input array {0, 1, 5, 88, 90, 70, 30, 0}, the peak element is 90, located at index 4. The program will output 4 as the peak index.

Time Complexity:
Time Complexity: O(log n), where n is the length of the array. This is due to the binary search approach.
Space Complexity: O(1), as no additional space is used.
How to Run:
Compile the program: javac MountainArray.java
Run the program: java MountainArray
The program will print the index of the peak element in the provided array.