//https://www.geeksforgeeks.org/find-subarray-with-given-sum/

/*
Given an unsorted array arr of nonnegative integers and an integer sum, find a continuous subarray which adds to a given sum. There may be more than one subarrays with sum as the given sum, print first such subarray. 
Examples : 

Input: arr[] = {1, 4, 20, 3, 10, 5}, sum = 33
Output: Sum found between indexes 2 and 4
Sum of elements between indices 2 and 4 is 20 + 3 + 10 = 33
*/

public class SubarrayWithGivenSum {
    public static void main(String[] args) {
        searchSubarray(new int[] { 1, 4, 20, 3, 10, 5 }, 33);
    }

    private static void searchSubarray(int[] arr, int sum) {
        int length = arr.length;
        int start = 0;
        int end = 0;
        int subArraySum = 0;
        subArraySum = arr[start];
        while (end != length - 1) {

            if (subArraySum == sum) {
                System.out.println("Indices First = " + start + " and end = " + end);
                return;
            }
            if (subArraySum > sum) {
                subArraySum = subArraySum - arr[start];
                start++;
            } else {
                end++;
                subArraySum = subArraySum + arr[end];
            }
        }
        System.out.println("No such sub array found");
    }
}
