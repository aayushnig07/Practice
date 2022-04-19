//https://www.geeksforgeeks.org/reverse-an-array-in-groups-of-given-size/
/*
Given an array, reverse every sub-array formed by consecutive k elements.

Examples:

Input:
arr = [1, 2, 3, 4, 5, 6, 7, 8, 9]
k = 3
Output: 
[3, 2, 1, 6, 5, 4, 9, 8, 7]

Input:
arr = [1, 2, 3, 4, 5, 6, 7, 8]
k = 5
Output:
[5, 4, 3, 2, 1, 8, 7, 6]

Input:
arr = [1, 2, 3, 4, 5, 6]
k = 1
Output:
[1, 2, 3, 4, 5, 6]

Input:
arr = [1, 2, 3, 4, 5, 6, 7, 8]
k = 10
Output:
[8, 7, 6, 5, 4, 3, 2, 1]
*/

class ReverseArrayInGroup{
  private static int[] reverseArray(int []arr, int k, int length){

  }

  private static int[] reverse(int []arr, int length){
    int [] reversedArray = new int[length];
    int k=0;
    for(int i=length-1;i>=0;i--){
      reversedArray[k++] = arr[i];
    }
    return reversedArray;
  }

}
