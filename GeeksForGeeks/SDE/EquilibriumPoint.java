//https://www.geeksforgeeks.org/find-element-array-sum-left-array-equal-sum-right-array/
/*
Given, an array of size n. Find an element that divides the array into two sub-arrays with equal sums.
Examples:

Input: 1 4 2 5
Output: 2
Explanation: If 2 is the partition,
      subarrays are : {1, 4} and {5}

Input: 2 3 4 1 4 5
Output: 1
Explanation: If 1 is the partition,
 Subarrays are : {2, 3, 4} and {4, 5}

 Input: 2,4,6,7,8
*/

class EquilibriumPoint{
  public static void main(String []args){
    int []arr1 = {1,4,2,5};
    int []arr2 = {2,4,6,7,8};
    int []arr3 = {2,3,4,1,4,5};
    int []arr4 = {2,4,6,5,7,8};
    System.out.println(findEqulibrium(arr1, arr1.length));
    System.out.println(findEqulibrium(arr2, arr2.length));
    System.out.println(findEqulibrium(arr3, arr3.length));
    System.out.println(findEqulibrium(arr4, arr4.length));
  }

  private static int findEqulibrium(int []arr, int length){
      if(length<=2){
        System.out.println("Invalid array!!");
        return 0;
      }

      int i=0;
      int j=length-1;
      int leftSum = arr[i];
      int rightSum = arr[j];
      while(i!=j){
        if(leftSum==rightSum){
          i++;j--;
          rightSum += arr[j];
          leftSum += arr[i];
        }
        else if(leftSum>rightSum){
          j--;
          rightSum += arr[j];
        }
        else if(leftSum<rightSum){
          i++;
          leftSum += arr[i];
        }
      }
    if(leftSum==rightSum)
      return arr[i];
    else{
      System.out.println("Not found");
      return 0;
    }

  }

}
