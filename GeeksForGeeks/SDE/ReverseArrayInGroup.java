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

class ReverseArrayInGroup {
  public static void main(String[] arg) {
    int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
    int k = 8;
    int i = 0;
    int maxIndex = arr.length - 1;
    while (i <= maxIndex) {
      reverseArray(arr, i, k, maxIndex);
      i = i + k;
    }
  }

  private static void reverseArray(int[] arr, int i, int k, int maxIndex) {
    int index = i + k - 1;
    if (index > maxIndex) {
      index = maxIndex;
    }
    int[] reversedArray = new int[index - i + 1];
    int j = 0;
    for (int s = index; s >= i; s--) {
      reversedArray[j] = arr[s];
      System.out.print(reversedArray[j] + " ");
      j++;
    }

  }

}
